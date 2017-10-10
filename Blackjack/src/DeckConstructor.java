
public class DeckConstructor
	{
	private String cardName;
	private int card;
	private  int value;
	
	public DeckConstructor (String cn, int c, int v)
		{
		cardName = cn;
		card = c;
		value = v;
		}

	public String getCardName()
		{
		return cardName;
		}

	public void setCardName(String cardName)
		{
		this.cardName = cardName;
		}

	public int getCard()
		{
		return card;
		}

	public void setCard(int card)
		{
		this.card = card;
		}

	public int getValue()
		{
		return value;
		}

	public void setValue(int value)
		{
		this.value = value;
		}
	}

