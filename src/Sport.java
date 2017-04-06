import java.util.ArrayList;

public abstract class Sport {

	private String gameID;
	
	public Sport(String gameID){
		this.gameID = gameID;
	}

	public String getGameID() {
		return gameID;
	}

	public void setGameID(String gameID) {
		this.gameID = gameID;
	}
	
	protected abstract void startGame();
	protected abstract ArrayList getAthlete(); 
	protected abstract Athlete getWinner();
	protected abstract void sorting ();
	protected abstract void setPointsForWinners();
	
}
