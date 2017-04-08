import java.util.ArrayList;

/**
 * programme to start the game and check user prediction
 * 
 * @author Kalinga
 *
 */
public class GameLoad {
	/**
	 * 
	 * @param game
	 *            is arraylist of sport
	 * @param gameNumber
	 *            is user selected sport number
	 * @param predictID
	 *            is user predicted winner ID
	 */
	public void gameLoding(ArrayList<Sport> game, int gameNumber, String predictID) {

		game.get(gameNumber - 1).startGame();
		if (game.get(gameNumber - 1).getWinner().getID().equals(predictID)) {
			System.out.println("Congratzz Your Prediction Correct!");
		} else {
			System.out.println("Bad Luck Your Prediction Wrong");
		}

	}

}
