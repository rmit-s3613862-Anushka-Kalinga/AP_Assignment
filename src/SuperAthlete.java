import java.util.Random;

/**
 * 
 * @author Kalinga
 *
 */
public class SuperAthlete extends Athlete {

	private int type; // super athlete sprinter, swimmer or cyclist selection
	private int ranTime = 0; // random time

	/**
	 * 
	 * @param ID
	 * @param name
	 * @param age
	 * @param state
	 * @param type
	 */
	public SuperAthlete(String ID, String name, int age, String state, int type) {
		super(ID, name, age, state);
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public void compete() {
		if (type == 1) {
			ranTime = getRandom(10, 20);
			competeTime = ranTime;
		} else if (type == 2) {
			ranTime = getRandom(100, 200);
			competeTime = ranTime;
		} else if (type == 3) {
			ranTime = getRandom(500, 800);
			competeTime = ranTime;
		} else {
			ranTime = 0;
		}

	}

	/**
	 * random time generator
	 * 
	 * @param min is compete time minimum value	             
	 * @param max is compete time max value	            
	 * @return
	 */
	public int getRandom(int min, int max) {
		Random ran = new Random();
		return ran.nextInt((max - min) + 1) + min;
	}
}
