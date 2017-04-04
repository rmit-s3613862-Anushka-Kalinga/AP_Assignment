import java.util.Random;
public class Cyclist extends Athlete{
	private int min = 500;
	private int max = 800;
	private int ranTime = 0;
	
	public Cyclist(String ID, String name, int age, String state){
		super(ID, name, age, state);
	}
	public void compete(){
		Random ran = new Random();
		ranTime =ran.nextInt((max - min)+1) + min; 
		
		}
	public int getRanTime(){
		return ranTime;
	}
		
}
