package com.game.war.src;

/**
 * 
 * @author Venkat
 * version 1.0 
 */
public class Player {

	private String id;
	private Pile pile;

	public Player(String id) {

		this.id = id;
		pile = new Pile();

	}

	public Card playCard() {

		if (pile.getSize() > 0)
			return pile.getNewCard();
		else
			return null;
	}

	public String getId() {
		return id;
	}

	public Pile getPile() {
		return pile;
	}

	public void collectCards(Pile p) {

		pile.addCards(p);

	}

	public void collectCard(Card c) {

		pile.addCard(c);

	}
	
}
