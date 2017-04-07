import java.util.Random;

/**
 * 
 * @author Kalinga
 *
 */
public class Swimmer extends Athlete {
	private int min = 100;
	private int max = 200;

	public Swimmer(String ID, String name, int age, String state) {
		super(ID, name, age, state);
	}

	@Override
	public void compete() {
		Random ran = new Random();
		competeTime = ran.nextInt((max - min) + 1) + min;

	}

}
