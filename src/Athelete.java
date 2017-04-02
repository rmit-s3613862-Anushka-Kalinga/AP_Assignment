import java.util.Random;

public abstract class Athelete extends Participant {
	
	private int point;
			
	public Athelete(String ID, String name, int age, String state){
		super(ID, name, age, state);
		
	}
	
	protected abstract int compete();

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}	
	
	
}
