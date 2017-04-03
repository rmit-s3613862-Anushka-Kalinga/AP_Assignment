import java.util.Scanner;
public class Driver {
	
	private int userinput;
	
	public static void main(String[] args) {
		Driver d1 = new Driver();
		d1.userInput();
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
	public void userInput(){		
		Scanner sc = new Scanner(System.in);
		boolean usercorrect = false;
		try{
		do{
		System.out.println("");	
		menu();
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
}
