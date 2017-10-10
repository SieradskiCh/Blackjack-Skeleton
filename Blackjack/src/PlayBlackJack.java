import java.util.Scanner;

public class PlayBlackJack
	{
	static int playerHandValue;
	static int dealerHandValue;
	static int cash = 100;
	static int bet;
	static boolean stillRunning;
	static boolean bust = true;
	public static void main(String[] args)
		{
		moneyCheck();
		gameRunner();
		}
	private static void moneyCheck()
		{
		System.out.println("You have " + cash + " cash. How much would you like to bet?");
		Scanner userInput1 = new Scanner (System.in);
		bet = userInput1.nextInt();
		if (bet > cash)
			{
			System.out.println("That is more money than you have. Try another bet.");
			moneyCheck();
			}
		}
	private static void gameRunner()
		{
		Deck.createDeck();
		playerHandValue = 0;
		dealerHandValue = 0;
		stillRunning = true;
		userDeal();
		userDeal();
		dealerShow();
		dealerSecret();
		while (stillRunning)
			{
			hitAsk();
			}
		}
	public static void userDeal()
		{
		Deck.deal();
		if (Deck.currentCardValue == 11)
			{
			aceChoose();
			}
		System.out.println("You were dealt the " + Deck.currentCard );
		System.out.println("It is worth " + Deck.currentCardValue + " points");
		playerHandValue = Deck.currentCardValue + playerHandValue;
		System.out.println("Your hand is worth " + playerHandValue + " points");
		System.out.println(" ");
		checkForBust();
		}
	public static void dealerSecret()
		{
		Deck.deal();
		dealerHandValue = dealerHandValue + Deck.currentCardValue;
		checkForBust();
		}	
	public static void dealerShow ()
		{
		Deck.deal();
		System.out.println("The dealer draws the " + Deck.currentCard );
		dealerHandValue = dealerHandValue + Deck.currentCardValue;
		System.out.println("The dealer's hand is showing " + dealerHandValue + " points");
		System.out.println(" ");
		}
	public static void hitAsk()
		{
		System.out.println("Would you like to hit?");
		System.out.println("1). yes");
		System.out.println("2). no");
		Scanner userInput1 = new Scanner (System.in);
		int selection = userInput1.nextInt();
		if (selection == 1)
			{
			System.out.println(" ");
			userDeal();
			}
		else if (selection == 2)
			{
			stillRunning = false;
			conclusion();
			}
		}
	public static void aceChoose()
		{
		System.out.println("You have drawn an Ace. What value do you want to assign this card?");
		System.out.println("1). 1");
		System.out.println("2). 11");
		Scanner userInput1 = new Scanner (System.in);
		int selection = userInput1.nextInt();
		if (selection == 1)
			{
			System.out.println("This ace now has a value of one");
			Deck.currentCardValue = 1;
			}
		else if (selection == 2)
			{
			System.out.println("This ace now has a value of eleven");
			}
		else 
			{
			System.out.println("This is not an option. PLease select again...");
			aceChoose();
			}
		}
	public static boolean checkForBust()
		{
		if (playerHandValue > 21)
			{
			System.out.println("You're busted!");
			loseMoney();
			playAgain();
			bust = false;
			}
		if (dealerHandValue > 21)
			{
			System.out.println("You win. The dealer is busted!");
			winMoney();
			playAgain();
			bust = false;
			}
		else
			{
			return true;
			}
		return false;
		}
	public static void conclusion()
		{
		System.out.println("Your hand is worth " + playerHandValue + ".");
		boolean dealerAI = true;
		while (dealerAI)
			{
			if (dealerHandValue < 17)
				{
				dealerSecret();
				System.out.println("The dealer has hit!");
				}
			else 
				{
				dealerAI = false;
				dealerConclusion();
				}
			}
		}
	public static void dealerConclusion()
		{
		System.out.println("The dealer's hand is worth " + dealerHandValue + ".");
		System.out.println(" ");
		if (playerHandValue > dealerHandValue && playerHandValue < 22)
			{
			System.out.println("Congrats! You win!!!");
			winMoney();
			playAgain();
			}
		else if (playerHandValue <= dealerHandValue && dealerHandValue < 22)
			{
			System.out.println("Sorry, the dealer has won");
			loseMoney();
			playAgain();
			}
		}
	public static void loseMoney()
		{
		cash = cash - bet;
		if (cash <= 0)
			{
			System.out.println(" ");
			System.out.println("You're out of money. Better luck next time!");
			System.exit(0);
			}
		}
	public static void winMoney()
		{
		cash = cash + bet;
		}
	public static void playAgain()
		{
		System.out.println(" ");
		System.out.println("Would you like to play again?");
		System.out.println("1). Yes");
		System.out.println("2). No");
		Scanner userInput1 = new Scanner (System.in);
		int selection = userInput1.nextInt();
		if (selection == 1)
			{
			moneyCheck();
			gameRunner();
			}
		else 
			{
			System.out.println(" ");
			System.out.println("Thank you for playing! You walked away with " + cash + " dollars! Have a nice day!");
			System.exit(0);
			}
		}
	}
