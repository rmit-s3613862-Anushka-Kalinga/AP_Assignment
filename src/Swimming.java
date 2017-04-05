import java.util.*;


public class Swimming extends Sport {
	
	private ArrayList<Athlete> p;
	private Participant official;
	private Athlete winner;
	
	public Swimming(String gameID, ArrayList swimmingGame, Participant ref){
		//Database d = new Database();
		//p = d.getDataSwimming();
		super(gameID);
		p = swimmingGame;
		official = ref;
			
	}
	public ArrayList<Athlete> getAthlete(){
		return p;
	}
	public Athlete getWinner(){
		return winner;
	}
	public void startGame(){
		for(int i = 0; i < p.size(); i++){
			p.get(i).compete();
		}	
		sorting();
		setPointsForWinners();
	}

	public  void sorting (){		
		Collections.sort(p);
		Iterator<Athlete> afterswim = p.iterator();
		while(afterswim.hasNext()){
			Athlete aa = afterswim.next();
			System.out.println(aa.getCompeteTime());		
		}
		
	}
	public void setPointsForWinners(){
		winner = p.get(0);
		int points = p.get(0).getPoint();
		System.out.println(points);
		points = points + 5; 
		
		p.get(0).setPoint(points );
		System.out.println("name " + p.get(0).getID() + "compete time " + p.get(0).competeTime +"  "+ p.get(0).getPoint());
	}
}
