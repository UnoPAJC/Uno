package pajc.uno.model.card;

public class AbstractCard implements Card
{
	private final CardColor color;
	private final CardType type;

	protected AbstractCard(CardColor color, CardType type)
	{
		this.color = color;
		this.type = type;
	}

	public CardColor getColor()
	{
		return color;
	}

	public CardType getType()
	{
		return type;
	}
}
