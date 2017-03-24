package com.game.war.test;

import org.junit.Assert;
import org.junit.Test;

import com.game.war.src.Card;

/**
 * 
 * @author Venkat
 * Description: This file contains Card related test cases.
 * version 1.0 
 */

public class CardTest {

	
	
	@Test
	public void testEquals() {
		
		Card card1=new Card(3,"Club");
		Card card2=new Card(3,"Club");
		
		Assert.assertEquals(card1, card2);
				
	}
	
	
	@Test
	public void testComapareTo(){
		
		Card card1=new Card(3,"Club");
		Card card2=new Card(4,"Spade");
		int result=card2.compareTo(card1);
		Assert.assertEquals(1, result);
		
	}

}
