package com.game.war.src;

/**
 * 
 * @author Venkat
 * version 1.0 
 */

public interface Deck {

	/* Create the deck of cards */

	public void create( int numberOfSuits, int numberOfRanks );

	/* Shuffle the deck */

	public void shuffle();

	/* deal a card from the deck */

	public Card deal();
	
}
