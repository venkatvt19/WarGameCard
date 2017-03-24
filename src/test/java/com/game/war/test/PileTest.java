package com.game.war.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.game.war.src.Card;
import com.game.war.src.Pile;

/**
 * 
 * @author Venkat
 * Description: This file contains Pile of cards related test cases.
 * version 1.0 
 */
public class PileTest {

	static Card card1;
	static Pile pile;

	@BeforeClass
	public static void beforeClass() {
		card1 = new Card(3, "Club");
		pile = new Pile();
	}

	@Test
	public void testPileSize() {
		pile.addCard(card1);
		Assert.assertEquals(1, pile.getSize());
	}

	@Test
	public void testNewCard() {
		Card card = pile.getNewCard();
		Assert.assertEquals(card1, card);
	}

	@Test
	public void testPileClear() {
		pile.clear();
		Assert.assertEquals(0, pile.getSize());
	}

	@AfterClass
	public static void afterClass() {
		pile.clear();
	}
}
