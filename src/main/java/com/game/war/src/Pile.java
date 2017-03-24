package com.game.war.src;

/**
 * 
 * @author Venkat
 * version 1.0 
 */
public class Pile {

	private Card[] pile;
	private int first, last;

	public Pile() {

		pile = new Card[52];
		first = last = 0;
	}

	public int getSize() {
		return last - first;
	}

	public void clear() {
		first = last = 0;
	}

	public void addCard(Card c) {
		pile[last++] = c;
	}

	public void addCards(Pile pile) {

		while (pile.getSize() > 0) {
			addCard(pile.getNewCard());
		}
	}

	public Card getNewCard() {
		if (first == 0 && last == 0) {
			return null;
		}

		if (first == last) {
			return pile[first];
		}

		return pile[first++];
	}

}
