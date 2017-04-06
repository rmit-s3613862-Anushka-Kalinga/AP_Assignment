import java.util.ArrayList;

public class Display {
	
	/*ArrayList<Sport1> swimmingGame;
	ArrayList<Sport1> cyclingGame;
	public Display(ArrayList<Sport1> swimmingGame,ArrayList<Sport1> cyclingGame ){
		this.swimmingGame = swimmingGame;
		this.cyclingGame = cyclingGame;
	}*/

	public void displayResult(ArrayList<Sport1> game,String gameName, String gameID) {		
		for (int x = 0; x < game.size(); x++) {
			System.out.println();
			System.out.println("---------------------------------------");
			System.out.println((x + 1) + ". "+gameName+" "+ gameID + (x + 1)+"     "+ "Referee"
			+"  "+game.get(x).getReferee().getName());
			System.out.println("---------------------------------------");
			System.out.format("%20s%10s%10s%10s%10s", "Name","ID","Age","State","Points");
			for (int i = 0; i < game.get(x).getAthlete().size(); i++) {
				ArrayList<Athlete> a1 = (ArrayList<Athlete>) game.get(x).getAthlete();				
				System.out.println();
				System.out.format("%20s%10s%10s%10s%10s", a1.get(i).getName(),a1.get(i).getID(),a1.get(i).getAge(),a1.get(i).getState(),a1.get(i).getPoint());
			}
		}

	}
	public void categorySelectDisplay(ArrayList<Sport1> game,String gameName, String gameID){
		
		for (int x = 0; x < game.size(); x++) {
			System.out.println();
			System.out.println("--------------------");
			System.out.println((x + 1) + ". "+gameName+" "+ gameID + (x + 1));
			System.out.println("--------------------");
			System.out.format("%20s%10s", "Name","ID");
			for (int i = 0; i < game.get(x).getAthlete().size(); i++) {
				ArrayList<Athlete> a1 = (ArrayList<Athlete>) game.get(x).getAthlete();				
				System.out.println();
				System.out.format("%20s%10s", a1.get(i).getName(),a1.get(i).getID());
			}
		}
	}
}