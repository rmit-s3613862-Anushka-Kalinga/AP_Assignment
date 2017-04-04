import java.util.ArrayList;
public class Swimming extends Sport {
	
	private ArrayList<Athlete> p;
	private Participant official;
	private Participant winner;
	
	public Swimming(){
		Database d = new Database();
		p = d.getDataAth();
		
	}
	public void startGame(){
		System.out.println(p.get(2).compete());
	}
	public void compareTo(Athlete p){
		//int c = ((Athlete)p).
	}

}
