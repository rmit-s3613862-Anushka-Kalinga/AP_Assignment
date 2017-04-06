import java.util.*;


public class Sport1 {
	private String gameID;
	private ArrayList<Athlete> p;
	private Participant referee;
	private Athlete winner = null;
	private Athlete seccond = null;
	private Athlete third = null;
	
	public Sport1(String gameID, ArrayList game, Participant ref){
		this.gameID = gameID;
		p = game;
		referee = ref;
			
	}
	public ArrayList<Athlete> getAthlete(){
		return p;
	}
	public Athlete getWinner(){
		return winner;
	}
	public Athlete getSeccond(){
		return seccond;
	}
	public Athlete getThird(){
		return third;
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
		seccond = p.get(1);
		third = p.get(2);
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
