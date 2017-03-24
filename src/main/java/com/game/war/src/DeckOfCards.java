package com.game.war.src;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @author Venkat
 * Description: It is implementation of Deck.
 * version 1.0 
 */

public class DeckOfCards implements Deck {

	private Card deck[] = new Card[53];
	private int totalCards = 0;

	private String[] suit = { "Club", "Diamond", "Heart", "Spade" };

	/**
	 * It will create deck of cards based on the number of suits and ranks range.
	 */
	
	public void create(int numberOfSuits, int numberOfRanks) {

		for (int i = 0; i < numberOfSuits; i++) {

			for (int j = 1; j <= numberOfRanks; j++) {

				Card card = new Card(j, suit[i]);

				deck[totalCards] = card;
				totalCards++;
			}

		}

	}

	public int getSizeOfCards() {
		return totalCards;
	}

	/**
	 * To shuffle deck of cards
	 */
	
	public void shuffle() {

		Set<Integer> set = new HashSet<Integer>();

		Random random = new Random();

		for (int i = 0; i < totalCards; i++) {
			int randomIndex = random.nextInt((totalCards - i) + 1) + i;

			if (randomIndex >= 52) {
				continue;
			}

			if (!set.contains(randomIndex)) {

				Card temp = deck[i];
				deck[i] = deck[randomIndex];
				deck[randomIndex] = temp;

			}

			set.add(randomIndex);

		}

	}

	/**
	 *   Deal a card from the deck 
	 */
	
	public Card deal() {

		if (totalCards == 0) {
			return null;
		}

		return deck[--totalCards];

	}

	public void displayCards() {
		for (Card card : deck) {
			System.out.println(card);
		}
	}

}
