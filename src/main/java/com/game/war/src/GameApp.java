package com.game.war.src;
/**
 * 
 * @author Venkat
 * 
 * version 1.0 
 */
public class GameApp {

	Player player[];
	int p1 = 0, p2 = 1, p3 = 2;
	void createPlayers(int numberOfPlayers) {

		player = new Player[numberOfPlayers];

		for (int i = 0; i < numberOfPlayers; i++)
			player[i] = new Player("" + i);

	}

	/**
	 * Description: This methos contains logic for war game.
	 * @param numberOfSuits
	 * @param numberOfRanks
	 * @param numberOfPlayers
	 */
	public void playGame(int numberOfSuits, int numberOfRanks, int numberOfPlayers) {

		DeckOfCards cardDeck = new DeckOfCards();
		cardDeck.create(numberOfSuits, numberOfRanks);
		cardDeck.shuffle();

		while (cardDeck.getSizeOfCards() > 0) {
//			int totalPlayer = 1;
//			while (totalPlayer-- >= 0) {
				player[p1].collectCard(cardDeck.deal());
				player[p2].collectCard(cardDeck.deal());
//			}

		}

		Pile droppedCards = new Pile();

		

		Card card1 = player[p1].playCard();

		System.out.println("Player: " + player[p1].getId() + " dropped " + card1 + " card");

		Card card2 = player[p2].playCard();

		System.out.println("Player: " + player[p2].getId() + " dropped " + card2 + " card");

		if (card1.compareTo(card2) > 0) {

			player[p1].collectCard(card1);
			player[p1].collectCard(card2);
		} else if (card1.compareTo(card2) < 0) {

			player[p2].collectCard(card1);
			player[p2].collectCard(card2);
		} else {

			droppedCards.addCard(card1);
			droppedCards.addCard(card2);

			boolean continueOk = false;

			do {

				System.out.println("Players need to drop " + card1.getRank() + " number of cards");

				for (int k = 0; k < card1.getRank(); k++) {

					card1 = player[p1].playCard();
					droppedCards.addCard(card1);
					card2 = player[p2].playCard();
					droppedCards.addCard(card2);
				}

				System.out.println("Player: " + player[p1].getId() + " top card: " + card1);
				System.out.println("Player: " + player[p2].getId() + " top card:  " + card2);

				if (card1.compareTo(card2) > 0) {

					continueOk = false;

					player[p1].collectCards(droppedCards);

					System.out.println("Player: " + player[p1].getId() + " collected cards");

				} else if (card1.compareTo(card2) < 0) {
					continueOk = false;
					player[p2].collectCards(droppedCards);
					System.out.println("Player: " + player[p1].getId() + " collected cards");
				}

				else {
					continueOk = true;
				}

			} while (continueOk);

		}

	}

	
	public Player getWinner(){
		
			if(player[p1].getPile().getSize()>player[p2].getPile().getSize()){
				return player[p1];
			}else if(player[p1].getPile().getSize()<player[p2].getPile().getSize()){
				return player[p2];
			}
			return null;
		
	}
	
}
