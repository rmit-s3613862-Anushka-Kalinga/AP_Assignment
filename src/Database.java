import java.util.ArrayList;
/**
 * progarame to store athletes objects 
 * @author Kalinga
 *
 */
public class Database {
	Athlete sp1 = new Sprinter("sp1", "Billy MacPherson", 23, "vic");
	Athlete sp2 = new Sprinter("sp2", "Bill Cartwright", 35, "vic");
	Athlete sp3 = new Sprinter("sp3", "Stan Rowley", 31, "nsw");
	Athlete sp4 = new Sprinter("sp4", "George Moir", 24, "nsw");

	Athlete sp10 = new Sprinter("sp10", "Nigel Barker", 23, "vic");
	Athlete sp5 = new Sprinter("sp5", "William Woodger", 35, "vic");
	Athlete sp6 = new Sprinter("sp6", "Shane Gould", 31, "nsw");
	Athlete sp7 = new Sprinter("sp7", "Ron Opie", 24, "nsw");
	Athlete sp8 = new Sprinter("sp4", "Jimmy Carlton", 24, "nsw");

	Athlete sw1 = new Swimmer("sw1", "Andy", 23, "vic");
	Athlete sw2 = new Swimmer("sw2", "Peters", 35, "vic");
	Athlete sw3 = new Swimmer("sw3", "Shane Gould", 31, "nsw");
	Athlete sw4 = new Swimmer("sw4", "Ian Thorpe", 24, "nsw");

	Athlete sw9 = new Swimmer("sw9", "Murray Rose", 23, "vic");
	Athlete sw5 = new Swimmer("sw5", "Grant Hackett", 35, "vic");
	Athlete sw6 = new Swimmer("sw6", "Shane Gould", 31, "nsw");
	Athlete sw7 = new Swimmer("sw7", "Kieren Perkins", 24, "nsw");
	Athlete sw8 = new Swimmer("sw8", "Ian Thorpe", 24, "nsw");

	Athlete cy1 = new Cyclist("cy1", "Andy", 23, "vic");
	Athlete cy2 = new Cyclist("cy2", "Peters", 35, "vic");
	Athlete cy3 = new Cyclist("cy3", "Shane Gould", 31, "nsw");
	Athlete cy4 = new Cyclist("cy4", "Ian Thorpe", 24, "nsw");

	Athlete cy5 = new Cyclist("cy5", "Murray Rose", 23, "vic");
	Athlete cy6 = new Cyclist("cy6", "Grant Hackett", 35, "vic");
	Athlete cy7 = new Cyclist("cy7", "Shane Gould", 31, "nsw");
	Athlete cy8 = new Cyclist("cy8", "Kieren Perkins", 24, "nsw");
	Athlete cy9 = new Cyclist("cy9", "Ian Thorpe", 24, "nsw");

	SuperAthlete sa1 = new SuperAthlete("sa1", "Tec", 22, "qld", 2);
	SuperAthlete sa2 = new SuperAthlete("sa2", "Dawn Fraser", 28, "qld", 2);
	SuperAthlete sa3 = new SuperAthlete("sa3", "Tec", 22, "qld", 1);
	SuperAthlete sa4 = new SuperAthlete("sa4", "John Landy", 22, "qld", 1);
	SuperAthlete sa7 = new SuperAthlete("sa7", "Michael Hillardt", 28, "qld", 1);
/**
 * 
 * @return is ArrayList of sprinters set 1
 */
	public ArrayList getDataRunningR1() {
		ArrayList<Athlete> dataRunner = new ArrayList<Athlete>();
		sa4.setType(1);
		sa7.setType(1);
		dataRunner.add(sp1);
		dataRunner.add(sp2);
		dataRunner.add(sp3);
		dataRunner.add(sp4);
		dataRunner.add(sa4);
		dataRunner.add(sa7);
		return dataRunner;
	}
/*
 * @return is ArrayList of sprinters set 2
 */
	public ArrayList getDataRunningR2() {
		ArrayList<Athlete> dataRunner = new ArrayList<Athlete>();
		sa3.setType(1);
		sa4.setType(1);
		dataRunner.add(sp10);
		dataRunner.add(sp5);
		dataRunner.add(sp6);
		dataRunner.add(sp7);
		dataRunner.add(sp8);
		dataRunner.add(sa3);
		dataRunner.add(sa4);
		return dataRunner;
	}

/*
 * @return is ArrayList of swimmers set 1
 */

	public ArrayList getDataSwimmingsw1() {
		ArrayList<Athlete> dataSwimmer = new ArrayList<Athlete>();
		sa1.setType(2);
		sa2.setType(2);
		dataSwimmer.add(sw1);
		dataSwimmer.add(sw2);
		dataSwimmer.add(sw3);
		dataSwimmer.add(sw4);
		dataSwimmer.add(sa1);
		dataSwimmer.add(sa2);
		return dataSwimmer;
	}
/*
 * @return is ArrayList of swimmers set 2
 */	
	public ArrayList getDataSwimmingsw2() {
		ArrayList<Athlete> dataSwimmer = new ArrayList<Athlete>();

		sa3.setType(2);
		sa4.setType(2);
		dataSwimmer.add(sw9);
		dataSwimmer.add(sw5);
		dataSwimmer.add(sw6);
		dataSwimmer.add(sw7);
		dataSwimmer.add(sa3);
		dataSwimmer.add(sa4);
		return dataSwimmer;
	}
/*
 * @return is ArrayList of cyclist set 1
 */
	public ArrayList getDataCyclingcy1() {
		ArrayList<Athlete> dataCyclist = new ArrayList<Athlete>();
		sa4.setType(3);
		sa2.setType(3);
		dataCyclist.add(cy1);
		dataCyclist.add(cy2);
		dataCyclist.add(cy3);
		dataCyclist.add(cy4);
		dataCyclist.add(sa4);
		dataCyclist.add(sa2);
		return dataCyclist;
	}
/*
 * @return is ArrayList of cyclist set 2
 */
	public ArrayList getDataCyclingcy2() {
		ArrayList<Athlete> dataCyclist = new ArrayList<Athlete>();

		sa3.setType(3);
		sa4.setType(3);
		dataCyclist.add(cy5);
		dataCyclist.add(cy6);
		dataCyclist.add(cy7);
		dataCyclist.add(cy8);
		dataCyclist.add(cy9);
		dataCyclist.add(sa3);
		dataCyclist.add(sa4);
		return dataCyclist;
	}
/*
 * @return ArrayList of running sport
 */
	public ArrayList running1() {
		ArrayList<Sport> dataRunningGame = new ArrayList<Sport>();
		Participant refsw1 = new Official("ref3", "Mark Renshaw", 48, "vic", 2);
		Participant refsw2 = new Official("ref4", "Jimmy Carlton", 37, "vic", 2);
		Sport sw1 = new Sport("R01", getDataRunningR1(), refsw1);
		Sport sw2 = new Sport("R02", getDataRunningR2(), refsw2);
		dataRunningGame.add(sw1);
		dataRunningGame.add(sw2);
		return dataRunningGame;
	}

/**
 * 	
 * @return ArrayList of swimming sport
 */
	public ArrayList swimming1() {
		ArrayList<Sport> dataRunningGame = new ArrayList<Sport>();
		Participant refsw1 = new Official("ref1", "Harry", 48, "vic", 2);
		Participant refsw2 = new Official("ref2", "Andy", 37, "vic", 2);
		Sport sw1 = new Sport("S01", getDataSwimmingsw1(), refsw1);
		Sport sw2 = new Sport("S02", getDataSwimmingsw2(), refsw2);
		dataRunningGame.add(sw1);
		dataRunningGame.add(sw2);
		return dataRunningGame;
	}
/*
 * @return ArrayList of cycling sport
 */
	public ArrayList cycling1() {
		ArrayList<Sport> dataCyclingGame = new ArrayList<Sport>();
		Participant refsw1 = new Official("ref6", "Michael Hillardt", 48, "vic", 2);
		Participant refsw2 = new Official("ref8", "Alan Ozolins", 37, "vic", 2);
		Sport sw1 = new Sport("C01", getDataCyclingcy1(), refsw1);
		Sport sw2 = new Sport("C02", getDataCyclingcy2(), refsw2);
		dataCyclingGame.add(sw1);
		dataCyclingGame.add(sw2);
		return dataCyclingGame;
	}

}
