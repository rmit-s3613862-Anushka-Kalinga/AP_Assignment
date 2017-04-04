import java.util.Random;
public class Swimmer extends Athlete{
	private int min = 100;
	private int max = 200;
	private int ranTime =0;

	public Swimmer(String ID, String name, int age, String state){
		super(ID, name, age, state);		
	}
	
	public void compete(){
		Random ran = new Random();
		ranTime = ran.nextInt((max - min)+1) + min;	
		competeTime = ranTime;
		}
	public int getRanTime(){
		return ranTime;
	}
	
}
