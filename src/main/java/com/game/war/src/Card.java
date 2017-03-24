package com.game.war.src;


/**
 * 
 * @author Venkat
 * version 1.0 
 */
public class Card implements Comparable<Card> {

	int rank;
	String suit;

	public Card(int rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	/**
	 * To Compare playing cards
	 */
	public int compareTo(Card card) {
		Card otherCard = (Card) card;

		if (rank == 1)
			rank = 14;

		if (otherCard.getRank() == 1)
			otherCard.setRank(14);

		return rank - otherCard.getRank();
	}

	
	/**
	 * If the cards rank is equal then two cards are equal.
	 */
	public boolean equals(Object card) {

		Card otherCard = (Card) card;
		return rank == otherCard.getRank();

	}

	public String toString() {

		switch (rank) {

		case 1:
			return "Ace - " + suit;
		case 11:
			return "Jack - " + suit;
		case 12:
			return "Queen - " + suit;
		case 13:
			return "King - " + suit;
		default:
			return rank + " - " + suit;

		}

	}

}
