import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Display {	

	public void displayResult(ArrayList<Sport> game,String gameName, String gameID) {		
		for (int x = 0; x < game.size(); x++) {
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println((x + 1) + ". "+gameName+" "+ gameID + (x + 1)+"     "+ "Referee"
			+"  "+game.get(x).getReferee().getName());
			System.out.println("-------------------------------------------");			
			if(game.get(x).getWinner() != null ){
			System.out.println("Winner of the Game");
			System.out.println("------------------");
			System.out.println(game.get(x).getWinner().getName());	
			System.out.println("------------------");
			System.out.println("Seccond of the Game");
			System.out.println("------------------");
			System.out.println(game.get(x).getSeccond().getName());
			System.out.println("------------------");
			System.out.println("Third of the Game");
			System.out.println("------------------");
			System.out.println(game.get(x).getThird().getName());
			}else{
				System.out.println("Haven't played the game");
			}
			
		/*for (int x = 0; x < game.size(); x++) {
		for (int i = 0; i < game.get(x).getAthlete().size(); i++) {
			ArrayList<Athlete> a1 = (ArrayList<Athlete>) game.get(x).getAthlete();				
			System.out.println();
			System.out.format("%20s%10s%10s%10s%10s", a1.get(i).getName(),a1.get(i).getID(),a1.get(i).getAge(),a1.get(i).getState(),a1.get(i).getPoint());
		}
			for (int i = 0; i < 3; i++) {
				ArrayList<Athlete> a1 = (ArrayList<Athlete>) game.get(x).getAthlete();				
				System.out.println();
				System.out.format("%20s%10s%10s%10s%10s", a1.get(i).getName(),
						a1.get(i).getID(),a1.get(i).getAge(),a1.get(i).getState(),
						a1.get(i).getPoint());
				System.out.println("Winner of the Game");
				System.out.println();
			}
		}*/
		}
	}
	public void categorySelectDisplay(ArrayList<Sport> game,String gameName, String gameID){
		
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
	public void displayAthletePoint(ArrayList<Sport> game,String gameName, String gameID) {		
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
		/*List<Sport> l1 = new ArrayList<Sport>();
		l1.addAll(game1);
		l1.addAll(game2);
		l1.addAll(game3);
		ArrayList<Athlete> a1 = (ArrayList<Athlete>) game1.get(0).getAthlete();
		ArrayList<Athlete> a2 = (ArrayList<Athlete>) game1.get(1).getAthlete();
		ArrayList<Athlete> a3 = (ArrayList<Athlete>) game2.get(0).getAthlete();
		ArrayList<Athlete> a4 = (ArrayList<Athlete>) game2.get(1).getAthlete();
		ArrayList<Athlete> a5 = (ArrayList<Athlete>) game3.get(0).getAthlete();
		ArrayList<Athlete> a6 = (ArrayList<Athlete>) game3.get(1).getAthlete();
		*/
		
	//	Sport[] athCollection = new Sport[3];
		//athCollection[0] = game1;
		
		//Set<String> athlete = new HashSet<>();
		//for(int i =0; i<3; i++){
		//	for()
		//} 
		

	}
}