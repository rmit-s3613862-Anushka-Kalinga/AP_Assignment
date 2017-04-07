import java.util.Random;
/**
 * @author Kalinga
 */


public class Cyclist extends Athlete {
	private int min = 500;
	private int max = 800;

	public Cyclist(String ID, String name, int age, String state) {
		super(ID, name, age, state);
	}
@Override
	public void compete() {
		Random ran = new Random();
		competeTime = ran.nextInt((max - min) + 1) + min;

	}

}
