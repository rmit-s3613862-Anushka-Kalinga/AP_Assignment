import java.util.Random;
public class Swimmer extends Athlete {
	int min = 100;
	int max = 200;	

	public Swimmer(String ID, String name, int age, String state){
		super(ID, name, age, state);		
	}
	
	public int compete(){
		Random ran = new Random();
		return ran.nextInt((max - min)+1) + min ;
		}
	
}
