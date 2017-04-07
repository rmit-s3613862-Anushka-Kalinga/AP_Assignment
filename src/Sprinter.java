import java.util.Random;

/**
 * 
 * @author Kalinga
 *
 */
public class Sprinter extends Athlete {
	int min = 10;
	int max = 20;

	public Sprinter(String ID, String name, int age, String state) {
		super(ID, name, age, state);
	}

	@Override
	public void compete() {
		Random ran = new Random();
		competeTime = ran.nextInt((max - min) + 1) + min;
	}
}
