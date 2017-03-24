package com.game.war.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.game.war.src.Card;
import com.game.war.src.DeckOfCards;
/**
 * 
 * @author Venkat
 * Description: This file contains card Deck related test cases.
 * version 1.0 
 */
public class DeckTest {

	static DeckOfCards deck;

	@Before
	public void beforeTest() {
		deck = new DeckOfCards();
		deck.create(4, 13);
	}

	@Test
	public void testCreateDeck() {

		Assert.assertEquals(52, deck.getSizeOfCards());
	}

	@Test
	public void testDeal() {

		Card card = deck.deal();
		System.out.println(card);
	}
	
	

	
}
