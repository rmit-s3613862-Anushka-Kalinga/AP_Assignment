import java.util.Scanner;
import java.util.ArrayList;

/**
 * main method class
 */

/**
 * @author Kalinga
 *
 */
public class Driver {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		String predictID = null; // user predict athlete ID
		int gameNumber = 0; // user selected game number
		int userselectcat = 0; // user selected category
		boolean value = true; // while condition checker
		Driver drive = new Driver();
		Database db = Ozlympic.makeGame();
		ArrayList<Sport> runningGame = null; // arraylist of running games from database												
		ArrayList<Sport> swimmingGame = null;// arraylist of swimming games from database												
		ArrayList<Sport> cyclingGame = null;// arraylist of cycling games from database											
		Display dis = new Display();
		Scanner sc = new Scanner(System.in);
		int userinputNum = drive.userInput(); // user selected menu number and menu display												
		try {
			do {
				if (1 == userinputNum) { // select game category
					System.out.println("working");
					userselectcat = drive.categorySelection();
					gameNumber = sc.nextInt();
					System.out.println("You have selected " + gameNumber + " Game");
					userinputNum = drive.userInput();
				} else if (2 == userinputNum) { // user prediction
					System.out.println("Please enter your predicting winner ID");
					predictID = sc.next();
					System.out.println("You have selected  " + predictID);
					userinputNum = drive.userInput();
				} else if (3 == userinputNum) {// start game
					if (predictID != null) {
						System.out.println("Game started!");
						GameLoad gameL = new GameLoad();
						if (userselectcat == 1) {
							runningGame = db.running1(); // assign running games arraylist															
							gameL.gameLoding(runningGame, gameNumber, predictID);
						} else if (userselectcat == 2) {
							swimmingGame = db.swimming1();// assign swimming games arraylist														
							gameL.gameLoding(swimmingGame, gameNumber, predictID);
						} else if (userselectcat == 3) {
							cyclingGame = db.cycling1(); // assign cycling games arraylist														
							gameL.gameLoding(cyclingGame, gameNumber, predictID);
						}
					} else {
						System.out.println("Please Predict a winner for Game by pressing 2");
					}
					userinputNum = drive.userInput();
				} else if (4 == userinputNum) {// display final results of games
					if (runningGame != null)
						dis.displayResult(runningGame, "Running", "R0");
					if (swimmingGame != null)
						dis.displayResult(swimmingGame, "Swimming", "S0");
					if (cyclingGame != null)
						dis.displayResult(cyclingGame, "Cycling", "C0");
					userinputNum = drive.userInput();
				} else if (5 == userinputNum) {// display all athletes points
					dis.displayAthletePoint(db.running1(), "Running", "R0");
					dis.displayAthletePoint(db.swimming1(), "Swimming", "S0");
					dis.displayAthletePoint(db.cycling1(), "Cycling", "C0");
					userinputNum = drive.userInput();
				} else if (6 == userinputNum) {
					value = false; // user exit
				}
			} while (value);
			System.out.println("Nice to Play with you");
		} catch (Exception e) {
			System.err.println("Error");
		}
	}

	/**
	 * display menu
	 */
	public void menu() {
		System.out.println("Ozlympic Game");
		System.out.println("========================");
		System.out.println("1. Select a game to run");
		System.out.println("2. Predict the winner of the game");
		System.out.println("3. Start the game");
		System.out.println("4. Display the final results of all games");
		System.out.println("5. Display the points of all athletes");
		System.out.println("6. Exit");
	}

	/**
	 * 
	 * @return is user input menu number
	 */
	public int userInput() {
		int userInputNum = 0;
		Scanner sc = new Scanner(System.in);
		boolean usercorrect = false;
		try {
			do {
				System.out.println("");
				menu();
				System.out.print("Enter an option:");
				int userin = sc.nextInt();
				if (1 <= userin && userin <= 6) {
					userInputNum = userin;
					usercorrect = false;
				} else {
					System.out.println("");
					System.out.println("Please enter valid number");
					usercorrect = true;
				}
			} while (usercorrect);
		} catch (Exception e) { // user input not an integer
			System.out.println("Error");
		}
		return userInputNum;
	}

	/**
	 * 
	 * @return user selected category number
	 */
	public int categorySelection() {
		Ozlympic starter = new Ozlympic();
		ArrayList<Sport> runningGame = starter.makeGame().running1();
		ArrayList<Sport> swimmingGame = starter.makeGame().swimming1();
		ArrayList<Sport> cyclingGame = starter.makeGame().cycling1();
		Display dis = new Display();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Running" + "\n" + "2. Swimming" + "\n" + "3. Cycling");
		System.out.println("Please Select Game Category");
		int category = sc.nextInt();
		if (category == 1) {
			dis.categorySelectDisplay(runningGame, "Running", "R0");
		} else if (category == 2) {
			dis.categorySelectDisplay(swimmingGame, "Swimming", "S0");
		} else if (category == 3) {
			dis.categorySelectDisplay(cyclingGame, "Cycling", "C0");
		} else {
			System.out.println("You haven't select a category");
		}
		System.out.println();
		System.out.println("Please Enter Selected Game Number as 1, 2 etc:");
		return category;
	}

}
