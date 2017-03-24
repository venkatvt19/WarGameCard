package com.game.war.src;


/**
 * 
 * @author Venkat
 * Description: It is entry point for playing war game between different players.
 * version 1.0 
 */
public class War {

	
	/**
	 * 
	 * @param numberOfSuits
	 * @param numberOfRanks
	 * @param numberOfPlayers
	 * @return Player details
	 */
	public Player play(int numberOfSuits, int numberOfRanks, int numberOfPlayers) {

		GameApp game = new GameApp();
		game.createPlayers(2);
		game.playGame(numberOfSuits, numberOfRanks, numberOfPlayers);
		Player player = game.getWinner();
		return player;
	}

	
	public static void main(String[] args) {

		War war = new War();
		Player player = war.play(4, 13, 2);

		if (player != null) {
			System.out.println(player.getId() + " won the game");
		} else {
			System.out.println("Game tie....!!!");
		}

	}

}
