import java.util.Scanner;

/**
 * 
 */

/**
 * @author my
 *
 */

public class Ozlympic {

	/**
	 * @param args
	 */
	/*private int userinput;
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
	
	public void userInput(){		
		Scanner sc = new Scanner(System.in);
		boolean usercorrect = false;
		try{
		do{
		System.out.println("");
		menu();
		//menu();
		System.out.print("Enter an option:");
		int userin = sc.nextInt();		
		if(1 <= userin && userin <= 6 ){
			userinput = userin;	
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
	}
	
	public static void main(String[] args) {
		
		Ozlympic run = new Ozlympic();
		run.menu();
		Ozlympic d1 = new Ozlympic();
		d1.userInput();

	}
*/
	public Database makeGame(){
		Database dataCollection = new Database();
		//d1.swimming1();
		return dataCollection;
	}
}
