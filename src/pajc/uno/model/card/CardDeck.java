package pajc.uno.model.card;

import java.util.ArrayList;

public class CardDeck
{
	private final ArrayList<Card> deck = new ArrayList<>(108);

	public CardDeck()
	{
		generateDeck();
	}

	private void generateDeck()
	{
		generateNumberCards();
		generateActionCards();
		generateWildCards();
	}

	public void generateNumberCards()
	{
		for (CardColor color : CardColor.values())
		{
			for (int i = 0; i <= 9; i++)
			{
				deck.add(new NumberCard(i, color));
			}
		}
	}

	public void generateActionCards()
	{
		for (var color : CardColor.values())
		{
			for (var i = 0; i < 2; i++)
			{
				deck.add(new ActionCard(color, CardType.SKIP));
				deck.add(new ActionCard(color, CardType.REVERSE));
				deck.add(new ActionCard(color, CardType.DRAW_TWO));
			}
		}
	}

	public void generateWildCards()
	{
		for (var i = 0; i < 4; i++)
		{
			deck.add(new WildCard(CardType.WILD_COLOR));
			deck.add(new WildCard(CardType.WILD_DRAW_FOUR));
		}
	}
}
