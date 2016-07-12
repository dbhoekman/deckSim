package deckSim;

public class Card {
	//The suit follows the CHASED method.
	//CLUBS		Hearts		Spades		Diamonds
	//  0		  1 		  2				3
	
	//The value follows the following
	//ACE		Jack		Queen		King
	// 1		 11 		  12	     13
	int Suit;
	int Value;

	
	public Card(int suit, int value){
		Suit = suit;
		Value = value;
	}
}
