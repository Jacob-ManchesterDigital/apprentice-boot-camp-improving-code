
package com.adaptionsoft.games.trivia.runner;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.Game;
import com.adaptionsoft.games.uglytrivia.Player;


public class GameRunner {

	private static boolean notAWinner;

	public static void main(String[] args) {
		Game aGame = new Game();

		// Add 3 players with names
		aGame.addPlayer(new Player("Chet"));
		aGame.addPlayer(new Player("Pat"));
		aGame.addPlayer(new Player("Sue"));

		// Create new random number generator, with a seed of the first input argument
		Random rand = new Random(Integer.parseInt(args[0]));

		// While no winner
		do {
			// Call roll() with a random number between 1 inclusive and 6 exclusive
			int fiveSidedDie = rand.nextInt(5) + 1;
			aGame.roll(fiveSidedDie);

			// Generate another random number between 0 inclusive and 9 exclusive
			// Randomly choose if right or wrong
			boolean isWrongAnswer = rand.nextInt(9) == 7;
			if (isWrongAnswer) {
				notAWinner = aGame.penalisePlayer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}
			
			
			
		} while (notAWinner);
		
	}
}
