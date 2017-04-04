import java.util.*;


public class Swimming extends Sport {
	
	private ArrayList<Athlete> p;
	private Participant official;
	private Participant winner;
	
	public Swimming(){
		Database d = new Database();
		p = d.getDataSwimming();
		
	}
	public void startGame(){
		p.get(0).compete();
		p.get(1).compete();
		p.get(2).compete();
	}

	public  void sorting (){
		/*Iterator<Athlete> swim = p.iterator();
		while(swim.hasNext()){
			Athlete a = swim.next();
			System.out.println(a.getCompeteTime());		
			
		}
			*/	
		Collections.sort(p);
		Iterator<Athlete> afterswim = p.iterator();
		while(afterswim.hasNext()){
			Athlete aa = afterswim.next();
			System.out.println(aa.getCompeteTime());		
		}
		
	}
}
