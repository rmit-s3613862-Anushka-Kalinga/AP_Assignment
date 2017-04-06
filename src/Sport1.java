import java.util.*;


public class Sport1 {
	private String gameID;
	private ArrayList<Athlete> p;
	private Participant referee;
	private Athlete winner;
	
	public Sport1(String gameID, ArrayList swimmingGame, Participant ref){
		this.gameID = gameID;
		p = swimmingGame;
		referee = ref;
			
	}
	public ArrayList<Athlete> getAthlete(){
		return p;
	}
	public Athlete getWinner(){
		return winner;
	}
	public Participant getReferee(){
		return referee;
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
		int pointsForFirst = p.get(0).getPoint();
		int pointsForSecond = p.get(1).getPoint();
		int pointsForThird = p.get(2).getPoint();
		System.out.println(pointsForFirst);
		pointsForFirst = pointsForFirst + 5;
		pointsForSecond += 2;
		pointsForThird +=1;		
		p.get(0).setPoint(pointsForFirst );
		p.get(1).setPoint(pointsForSecond );
		p.get(2).setPoint(pointsForThird );		
		System.out.println("name " + p.get(0).getID() + "compete time " + p.get(0).competeTime +"  "+ 
		p.get(0).getPoint()+p.get(1).getPoint());
	}
}
