import java.util.Random;
/**
 * 
 */

/**
 * @author my
 *
 */
public abstract class Athlete extends Participant {
	
	private int point;
	
	public Athlete(String ID, String name, int age, String state){
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
