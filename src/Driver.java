import java.util.Scanner;
import java.util.ArrayList;
/**
 * 
 */

/**
 * @author my
 *
 */
public class Driver {
		
	public static void main(String[] args){
		Driver drive = new Driver();
		Ozlympic starter = new Ozlympic();
		Database db = starter.makeGame();
	    ArrayList<Swimming> SwimmingGame = db.swimming1();
		String predictID = null;
		int gameNumber =0;
		Scanner sc = new Scanner(System.in);
		int userinputNum = drive.userInput();
		do{			
			if (1 == userinputNum){
			System.out.println("working");
			System.out.println("1. Running"+ "\n" + "2. Swimming" + "\n" + "3. Cycling");
			System.out.println("Please Select Game Category");
			int category = sc.nextInt();
				if(category == 1){					
				}
				else if (category == 2){
					System.out.println("1. Swimming Game" + "S01");
					System.out.println("Name" + "             "+ "ID");
					for(int i= 0; i < 6; i++){
						ArrayList<Athlete> a1 = (ArrayList<Athlete>) SwimmingGame.get(0).getAthlete();
						System.out.println(a1.get(i).getName()+ "              "+ a1.get(i).getID());
											
					}					
				}
				else if(category == 3){
					
				}
				else{
					System.out.println("You haven't select a category");
				}
				
				System.out.println("Please Enter Selected Game Number as 1, 2 etc:");
				gameNumber = sc.nextInt();
				userinputNum = drive.userInput();
				
				
		}else if (2 == userinputNum){
			System.out.println("Please enter your predicting winner ID");
			predictID = sc.next();
			System.out.println("You have selected  " + predictID);	
			userinputNum = drive.userInput();
		}
		 else if (3 == userinputNum){
			if (predictID != null){
			System.out.println("Game started!");
				SwimmingGame.get(gameNumber-1).startGame();				
				if (SwimmingGame.get(gameNumber-1).getWinner().getID().equals(predictID)){
					System.out.println("Congratzz Your Prdiction Correct!");
				}
				else{
					System.out.println("Bad Luck!");
				}
			}
			userinputNum = drive.userInput();
		}
		 else if (4 == userinputNum){
			 System.out.println("1. Swimming Game" + "S01");
				System.out.println("Name" + "             "+ "ID");
				for(int i= 0; i < 6; i++){
					ArrayList<Athlete> a1 = (ArrayList<Athlete>) SwimmingGame.get(0).getAthlete();
					System.out.println(a1.get(i).getName()+ "              "+ a1.get(i).getID()+"  "+ a1.get(i).getCompeteTime());
										
				}
			 userinputNum = drive.userInput(); 
		 }
		}while(true);
		
	}
	
	public void menu(){
		System.out.println("Ozlympic Game");
		System.out.println("========================");
		System.out.println("1. Select a game to run");
		System.out.println("2. Predict the winner of the game");
		System.out.println("3. Start the game");
		System.out.println("4. Display the final results of all games");
		System.out.println("5. Display the points of all athletes");
		System.out.println("6. Exit");		
	}
	
	public int userInput(){	
		int userInputNum = 0;
		Scanner sc = new Scanner(System.in);
		boolean usercorrect = false;
		try{
		do{
		System.out.println("");
		menu();		
		System.out.print("Enter an option:");
		int userin = sc.nextInt();		
		if(1 <= userin && userin <= 6 ){
			userInputNum = userin;				
			usercorrect = false;			
		}else{
			System.out.println("");
			System.out.println("Please enter valid number");
			usercorrect = true;			
		} 
		}while(usercorrect);
		}
		catch (Exception e) {
			System.out.println("Error");
		}
		return userInputNum;
	}
	
}
