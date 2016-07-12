package deckSim;
import deckSim.Card;
import deckSim.Deck;

public class main {
	
	public static void main (String[] args)
	{
		System.out.println("This is the Deck Simulator!");
		
		//Card newCard = new Card(1,1);
		//System.out.printf("Card suit: %d\nCard value: %d\n", newCard.Suit, newCard.Value);

		Deck ourDeck = new Deck();
		
		ourDeck.initDeck(4, 13);
		ourDeck.shuffleDeck();
		for (int i = 0; i < 52; i++)
		{
			Card newCard = ourDeck.Cards.get(i);
			System.out.printf("Card %d suit: %d\nCard %d value: %d\n", i+1, newCard.Suit, i+1, newCard.Value);
		}

	}

}
