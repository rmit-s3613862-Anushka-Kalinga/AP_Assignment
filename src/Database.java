import java.util.ArrayList;

public class Database {	
	public  ArrayList getDataRunningR1 (){
		ArrayList<Athlete> dataRunner = new ArrayList<Athlete>();
		Athlete s1 = new Sprinter("sp1", "Billy MacPherson", 23, "vic");
		Athlete s2 = new Sprinter("sp2", "Bill Cartwright", 35, "vic");
		Athlete s3 = new Sprinter("sp3", "Stan Rowley", 31, "nsw");
		Athlete s4 = new Sprinter("sp4", "George Moir", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa4", "John Landy", 22, "qld", 1);
		Athlete sa2 = new SuperAthlete("sa7", "Michael Hillardt", 28, "qld", 1);
		dataRunner.add(s1);
		dataRunner.add(s2);
		dataRunner.add(s3);
		dataRunner.add(s4);
		dataRunner.add(sa1);
		dataRunner.add(sa2);
		return dataRunner;	
	}
	public  ArrayList getDataRunningR2 (){
		ArrayList<Athlete> dataRunner = new ArrayList<Athlete>();
		Athlete s1 = new Sprinter("sp10", "Nigel Barker", 23, "vic");
		Athlete s2 = new Sprinter("sp5", "William Woodger", 35, "vic");
		Athlete s3 = new Sprinter("sp6", "Shane Gould", 31, "nsw");
		Athlete s4 = new Sprinter("sp7", "Ron Opie", 24, "nsw");
		Athlete s5 = new Sprinter("sp4", "Jimmy Carlton", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa3", "Tec", 22, "qld", 1);
		Athlete sa2 = new SuperAthlete("sa4", "Dawn Fraser", 28, "qld", 1);
		dataRunner.add(s1);
		dataRunner.add(s2);
		dataRunner.add(s3);
		dataRunner.add(s4);		
		dataRunner.add(sa1);
		dataRunner.add(sa2);
		return dataRunner;	
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
		dataSwimmer.add(sa1);
		dataSwimmer.add(sa2);
		return dataSwimmer;	
	}
	public  ArrayList getDataCyclingcy1 (){
		ArrayList<Athlete> dataCyclist = new ArrayList<Athlete>();
		Athlete s1 = new Cyclist("cy1", "Andy", 23, "vic");
		Athlete s2 = new Cyclist("cy2", "Peters", 35, "vic");
		Athlete s3 = new Cyclist("cy3", "Shane Gould", 31, "nsw");
		Athlete s4 = new Cyclist("cy4", "Ian Thorpe", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa1", "Tec", 22, "qld", 3);
		Athlete sa2 = new SuperAthlete("sa2", "Dawn Fraser", 28, "qld", 3);
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
		Athlete s1 = new Cyclist("cy4", "Murray Rose", 23, "vic");
		Athlete s2 = new Cyclist("cy5", "Grant Hackett", 35, "vic");
		Athlete s3 = new Cyclist("cy6", "Shane Gould", 31, "nsw");
		Athlete s4 = new Cyclist("cy7", "Kieren Perkins", 24, "nsw");
		Athlete s5 = new Cyclist("cy4", "Ian Thorpe", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa3", "Tec", 22, "qld", 3);
		Athlete sa2 = new SuperAthlete("sa4", "Dawn Fraser", 28, "qld", 3);
		dataCyclist.add(s1);
		dataCyclist.add(s2);
		dataCyclist.add(s3);
		dataCyclist.add(s4);		
		dataCyclist.add(sa1);
		dataCyclist.add(sa2);
		return dataCyclist;			
	}
	public ArrayList running1(){
		ArrayList<Sport1> dataRunningGame = new ArrayList<Sport1>();
		Participant refsw1 = new Official("ref3", "Mark Renshaw", 48, "vic", 2);
		Participant refsw2 = new Official("ref4", "Jimmy Carlton", 37, "vic", 2);
		Sport1 sw1 = new Sport1("R01",getDataRunningR1(),refsw1);
		Sport1 sw2 = new Sport1("R02", getDataRunningR2(),refsw2);
		dataRunningGame.add(sw1);
		dataRunningGame.add(sw2);
		return dataRunningGame;
	}
	public ArrayList swimming1(){
		ArrayList<Sport1> dataRunningGame = new ArrayList<Sport1>();
		Participant refsw1 = new Official("ref1", "Harry", 48, "vic", 2);
		Participant refsw2 = new Official("ref2", "Andy", 37, "vic", 2);
		Sport1 sw1 = new Sport1("S01",getDataSwimmingsw1(),refsw1);
		Sport1 sw2 = new Sport1("S02", getDataSwimmingsw2(),refsw2);
		dataRunningGame.add(sw1);
		dataRunningGame.add(sw2);
		return dataRunningGame;
	}
	public ArrayList cycling1(){
		ArrayList<Sport1> dataCyclingGame = new ArrayList<Sport1>();
		Participant refsw1 = new Official("ref6", "Michael Hillardt", 48, "vic", 2);
		Participant refsw2 = new Official("ref8", "Alan Ozolins", 37, "vic", 2);
		Sport1 sw1 = new Sport1("C01",getDataCyclingcy1(),refsw1);
		Sport1 sw2 = new Sport1("C02", getDataCyclingcy2(),refsw2);
		dataCyclingGame.add(sw1);
		dataCyclingGame.add(sw2);
		return dataCyclingGame;
	}

}
