import java.util.Random;
public class Cyclist extends Athelete{
	int min = 500;
	int max = 800;
	public Cyclist(String ID, String name, int age, String state){
		super(ID, name, age, state);
	}
	public int compete(){
		Random ran = new Random();
		return ran.nextInt((max - min)+1) + min ;
		}
}
