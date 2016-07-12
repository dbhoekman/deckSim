package deckSim;
import java.util.ArrayList;
import java.util.List;
import deckSim.Card;

public class Deck{
	
	List<Card> Cards = new ArrayList<Card>();
	
	public Deck()
	{
		
	}
	
	public void initDeck(int num_suits, int num_values)
	{
		
		for (int i = 0; i < num_suits; i++)
		{
			for (int j = 0; j < num_values; j++)
			{
				//Create the card to be added to the deck
				Card toBeAdd = new Card(i+1, j+1);
				//Add the card to the deck
				Cards.add(toBeAdd);

			}
		}
	}
	
	public void shuffleDeck()
	{
		int rand;
		Card temp;
		
		if(Cards == null)
		{
			return;
		}
		for (int i = 0; i < Cards.size(); i++)
		{
			//Generate a random number from i to the size of the deck
			rand = i + (int)(Math.random() * (((Cards.size()-1) - i) + 1));
			
			//If the number is equal to i, no swapping is needed
			if (rand != i)
			{
				//Set the card at i to temp
				//Swap the cards at i and rand
				//Once this is done the deck will be shuffled
				//This has each card to have a 1/size chance of being in any position
				temp = Cards.get(i);
				Cards.set(i, Cards.get(rand));
				Cards.set(rand, temp);
			}			
		}
	}
}
