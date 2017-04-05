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
	public  ArrayList getDataSwimmingsw1 (){
		ArrayList<Athlete> dataSwimmer = new ArrayList<Athlete>();
		Athlete s1 = new Swimmer("sw1", "Andy", 23, "vic");
		Athlete s2 = new Swimmer("sw2", "Peters", 35, "vic");
		Athlete s3 = new Swimmer("sw3", "Shane Gould", 31, "nsw");
		Athlete s4 = new Swimmer("sw4", "Ian Thorpe", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa1", "Tec", 22, "qld", 2);
		Athlete sa2 = new SuperAthlete("sa2", "Dawn Fraser", 28, "qld", 2);
		dataSwimmer.add(s1);
		dataSwimmer.add(s2);
		dataSwimmer.add(s3);
		dataSwimmer.add(s4);
		dataSwimmer.add(sa1);
		dataSwimmer.add(sa2);
		return dataSwimmer;	
	}
	public  ArrayList getDataSwimmingsw2 (){
		ArrayList<Athlete> dataSwimmer = new ArrayList<Athlete>();
		Athlete s1 = new Swimmer("sw4", "Murray Rose", 23, "vic");
		Athlete s2 = new Swimmer("sw5", "Grant Hackett", 35, "vic");
		Athlete s3 = new Swimmer("sw6", "Shane Gould", 31, "nsw");
		Athlete s4 = new Swimmer("sw7", "Kieren Perkins", 24, "nsw");
		Athlete s5 = new Swimmer("sw4", "Ian Thorpe", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa3", "Tec", 22, "qld", 2);
		Athlete sa2 = new SuperAthlete("sa4", "Dawn Fraser", 28, "qld", 2);
		dataSwimmer.add(s1);
		dataSwimmer.add(s2);
		dataSwimmer.add(s3);
		dataSwimmer.add(s4);		
		dataSwimmer.add((Athlete) SuperAthleteCollection().get(0));
		dataSwimmer.add(sa2);
		return dataSwimmer;	
	}
	public  ArrayList getDataCyclingcy1 (){
		ArrayList<Athlete> dataCyclist = new ArrayList<Athlete>();
		Athlete s1 = new Swimmer("sw1", "Andy", 23, "vic");
		Athlete s2 = new Swimmer("sw2", "Peters", 35, "vic");
		Athlete s3 = new Swimmer("sw3", "Shane Gould", 31, "nsw");
		Athlete s4 = new Swimmer("sw4", "Ian Thorpe", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa1", "Tec", 22, "qld", 2);
		Athlete sa2 = new SuperAthlete("sa2", "Dawn Fraser", 28, "qld", 2);
		dataCyclist.add(s1);
		dataCyclist.add(s2);
		dataCyclist.add(s3);
		dataCyclist.add(s4);
		dataCyclist.add(sa1);
		dataCyclist.add(sa2);
		return dataCyclist;	
	}
	public  ArrayList getDataCyclingcy2 (){
		ArrayList<Athlete> dataCyclist = new ArrayList<Athlete>();
		Athlete s1 = new Swimmer("sw4", "Murray Rose", 23, "vic");
		Athlete s2 = new Swimmer("sw5", "Grant Hackett", 35, "vic");
		Athlete s3 = new Swimmer("sw6", "Shane Gould", 31, "nsw");
		Athlete s4 = new Swimmer("sw7", "Kieren Perkins", 24, "nsw");
		Athlete s5 = new Swimmer("sw4", "Ian Thorpe", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa3", "Tec", 22, "qld", 2);
		Athlete sa2 = new SuperAthlete("sa4", "Dawn Fraser", 28, "qld", 2);
		dataCyclist.add(s1);
		dataCyclist.add(s2);
		dataCyclist.add(s3);
		dataCyclist.add(s4);		
		dataCyclist.add((Athlete) SuperAthleteCollection().get(0));
		dataCyclist.add(sa2);
		return dataCyclist;	
	}
	public ArrayList swimming1(){
		ArrayList<Swimming> dataSwimmingGame = new ArrayList<Swimming>();
		Participant refsw1 = new Official("ref1", "Harry", 48, "vic", 2);
		Participant refsw2 = new Official("ref2", "Anddy", 37, "vic", 2);
		Swimming sw1 = new Swimming("S01",getDataSwimmingsw1(),refsw1);
		Swimming sw2 = new Swimming("S02", getDataSwimmingsw2(),refsw2);
		dataSwimmingGame.add(sw1);
		dataSwimmingGame.add(sw2);
		return dataSwimmingGame;
	}
	public ArrayList cycling1(){
		ArrayList<Swimming> dataCyclingGame = new ArrayList<Swimming>();
		Participant refsw1 = new Official("ref1", "Harry", 48, "vic", 2);
		Participant refsw2 = new Official("ref2", "Anddy", 37, "vic", 2);
		Swimming sw1 = new Swimming("C01",getDataCyclingcy1(),refsw1);
		Swimming sw2 = new Swimming("C02", getDataCyclingcy2(),refsw2);
		dataCyclingGame.add(sw1);
		dataCyclingGame.add(sw2);
		return dataCyclingGame;
	}
	public ArrayList SuperAthleteCollection(){
		ArrayList<Athlete> dataSuperAthlete = new ArrayList<Athlete>();
		Athlete sa1 = new SuperAthlete("sa3", "Tec", 22, "qld", 2);
		Athlete sa2 = new SuperAthlete("sa4", "Dawn Fraser", 28, "qld", 2);
		dataSuperAthlete.add(sa1);
		dataSuperAthlete.add(sa2);
		return dataSuperAthlete;
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
