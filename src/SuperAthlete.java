import java.util.Random;
public class SuperAthlete extends Athelete {
	
	int type;
	
	public SuperAthlete(String ID, String name, int age, String state, int type){
		super(ID, name, age, state);
		this.type = type;
	}
	public int compete(){
	int ranTime = 0;	
	if (type == 1){
		ranTime = getRandom(10, 20); 
	}
	else if(type == 2){
		ranTime = getRandom(100, 200);
	}
	else if (type == 3){
		ranTime = getRandom(500, 800);
	}
	else {
		ranTime = 0;
	}
	return ranTime;	
	}
	public int getRandom(int min, int max){
		Random ran = new Random();
		return ran.nextInt((max - min)+1) + min;
	} 
}
