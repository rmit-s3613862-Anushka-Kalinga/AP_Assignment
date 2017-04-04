import java.util.ArrayList;

public class Database {
	
	public  ArrayList getData (){
		ArrayList<Participant> g = new ArrayList<Participant>();
		Participant s1 = new Swimmer("sw1", "Andy", 23, "vic");
		Participant s2 = new Swimmer("sw2", "Peters", 35, "mel");
		Participant sa1 = new SuperAthlete("sa1", "Tec", 22, "vic", 2);
		g.add(s1);
		g.add(s2);
		g.add(sa1);
		return g;
	
	}
	public  ArrayList getDataSwimming (){
		ArrayList<Athlete> dataSwimmer = new ArrayList<Athlete>();
		Athlete s1 = new Swimmer("sw1", "Andy", 23, "vic");
		Athlete s2 = new Swimmer("sw2", "Peters", 35, "mel");
		Athlete sa1 = new SuperAthlete("sa1", "Tec", 22, "vic", 2);
		dataSwimmer.add(s1);
		dataSwimmer.add(s2);
		dataSwimmer.add(sa1);
		return dataSwimmer;	
	}
//=======
/*	("SW01", "Shane Gould", 21, "VIC");
	("SW02", "Ian Thorpe", 24, "NSW");
	("SW03", "Dawn Fraser", 22, "QLD");
	("SW04", "Murray Rose", 21, "WA");
	("SW05", "Grant Hackett", 23, "SA");
	("SW06", "Kieren Perkins", 20, "TAS");
	("SW07", "Susie O'Neill[", 26, "VIC");
	("SW08", "Frederick Lane", 23, "NSW");
	
	("CY01", "Stuart O'Grady", 21, "VIC");
	("CY02", "Phil Anderson", 24, "NSW");
	("CY03", "Robbie McEwan", 22, "QLD");
	("CY04", "Simon Gerrans", 21, "WA");
	("CY05", "Michael Rogers", 23, "SA");
	("CY06", "Cadel Evans", 20, "TAS");
	("CY07", "Mark Renshaw", 26, "VIC");
	("CY08", "Adam Hansen", 23, "NSW");
	
	("SP01", "Billy MacPherson", 21, "VIC");
	("SP02", "Bill Cartwright", 24, "NSW");
	("SP03", "Stan Rowley", 22, "QLD");
	("SP04", "George Moir", 21, "WA");
	("SP05", "Nigel Barker", 23, "SA");
	("SP06", "William Woodger", 20, "TAS");
	("SP07", "Ron Opie", 26, "VIC");
	("SP08", "Jimmy Carlton", 23, "NSW");
	
	("SA01", "John Landy", 21, "VIC");
	("SA02", "Michael Hillardt", 24, "NSW");
	("SA03", "Alan Ozolins", 22, "QLD");
	("SA04", "Simon Doyle", 21, "WA");
	("SA05", "Peter Watson", 23, "SA");
	("SA06", "Lachlan Renshaw", 20, "TAS");
	
*/	
	

	
}
