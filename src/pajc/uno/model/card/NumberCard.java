package pajc.uno.model.card;

public class NumberCard extends AbstractCard
{
	private final int value;

	public NumberCard(int value, CardColor color)
	{
		super(color, CardType.NUMBER);
		this.value = value;
	}
}
