package pajc.uno.model.card;

public class WildCard extends AbstractCard
{
	public WildCard(CardType type)
	{
		super(null, type);
	}

	public WildCard(CardType type, CardColor color)
	{
		super(color, type);
	}
}
