import java.util.*;
public class Deck
	{
	static String currentCard;
	static int currentCardValue;
	static int randomCardDraw;
	static ArrayList <DeckConstructor> deck = new ArrayList <DeckConstructor>();
	public static void createDeck()
		{
		deck.add(new DeckConstructor ("Two of Hearts", 1, 2));
		deck.add(new DeckConstructor ("Three of Hearts", 2, 3));
		deck.add(new DeckConstructor ("Four of Hearts", 3, 4));
		deck.add(new DeckConstructor ("Five of Hearts", 4, 5));
		deck.add(new DeckConstructor ("Six of Hearts", 5, 6));
		deck.add(new DeckConstructor ("Seven of Hearts", 6, 7));
		deck.add(new DeckConstructor ("Eight of Hearts", 7, 8));
		deck.add(new DeckConstructor ("Nine of Hearts", 8, 9));
		deck.add(new DeckConstructor ("Ten of Hearts", 9, 10));
		deck.add(new DeckConstructor ("Jack of Hearts", 10, 10));
		deck.add(new DeckConstructor ("Queen of Hearts", 11, 10));
		deck.add(new DeckConstructor ("King of Hearts", 12, 10));
		deck.add(new DeckConstructor ("Ace of Hearts", 13, 11));
		deck.add(new DeckConstructor ("Two of Diamonds", 14, 2));
		deck.add(new DeckConstructor ("Three of Diamonds", 15, 3));
		deck.add(new DeckConstructor ("Four of Diamonds", 16, 4));
		deck.add(new DeckConstructor ("Five of Diamonds", 17, 5));
		deck.add(new DeckConstructor ("Six of Diamonds", 18, 6));
		deck.add(new DeckConstructor ("Seven of Diamonds", 19, 7));
		deck.add(new DeckConstructor ("Eight of Diamonds", 20, 8));
		deck.add(new DeckConstructor ("Nine of Diamonds", 21, 9));
		deck.add(new DeckConstructor ("Ten of Diamonds", 22, 10));
		deck.add(new DeckConstructor ("Jack of Diamonds", 23, 10));
		deck.add(new DeckConstructor ("Queen of Diamonds", 24, 10));
		deck.add(new DeckConstructor ("King of Diamonds", 25, 10));
		deck.add(new DeckConstructor ("Ace of Diamonds", 26, 11));
		deck.add(new DeckConstructor ("Two of Spades", 27, 2));
		deck.add(new DeckConstructor ("Three of Spades", 28, 3));
		deck.add(new DeckConstructor ("Four of Spades", 29, 4));
		deck.add(new DeckConstructor ("Five of Spades", 30, 5));
		deck.add(new DeckConstructor ("Six of Spades", 31, 6));
		deck.add(new DeckConstructor ("Seven of Spades", 32, 7));
		deck.add(new DeckConstructor ("Eight of Spades", 33, 8));
		deck.add(new DeckConstructor ("Nine of Spades", 34, 9));
		deck.add(new DeckConstructor ("Ten of Spades", 35, 10));
		deck.add(new DeckConstructor ("Jack of Spades", 36, 10));
		deck.add(new DeckConstructor ("Queen of Spades", 37, 10));
		deck.add(new DeckConstructor ("King of Spades", 38, 10));
		deck.add(new DeckConstructor ("Ace of Spades", 39, 11));
		deck.add(new DeckConstructor ("Two of Clubs", 40, 2));
		deck.add(new DeckConstructor ("Three of Clubs", 41, 3));
		deck.add(new DeckConstructor ("Four of Clubs", 42, 4));
		deck.add(new DeckConstructor ("Five of Clubs", 43, 5));
		deck.add(new DeckConstructor ("Six of Clubs", 44, 6));
		deck.add(new DeckConstructor ("Seven of Clubs", 45, 7));
		deck.add(new DeckConstructor ("Eight of Clubs", 46, 8));
		deck.add(new DeckConstructor ("Nine of Clubs", 47, 9));
		deck.add(new DeckConstructor ("Ten of Clubs", 48, 10));
		deck.add(new DeckConstructor ("Jack of Clubs", 49, 10));
		deck.add(new DeckConstructor ("Queen of Clubs", 50, 10));
		deck.add(new DeckConstructor ("King of Clubs", 51, 10));
		deck.add(new DeckConstructor ("Ace of Clubs", 52, 11));
		}	
	
	

	public static void deal()
		{
		randomCardDraw = (int) ((Math.random() * deck.size()));
		Deck.currentCard = deck.get(randomCardDraw).getCardName();
		Deck.currentCardValue = deck.get(randomCardDraw).getValue();
		deck.remove(deck.get(randomCardDraw));
		}
}
