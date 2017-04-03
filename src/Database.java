import java.util.ArrayList;



public class  Database {
	
	public void setData (){
		ArrayList<Participant> g = new ArrayList<Participant>();
		Participant s1 = new Swimmer("sw1", "Andy", 23, "vic");
		Participant s2 = new Swimmer("sw2", "Peters", 35, "mel");
		Participant sa1 = new SuperAthlete("sa1", "Tec", 22, "vic", 2);
		g.add(s1);
	
	}
	
}
