import java.util.Random;

/**
 * programe to compare compete times and abstract of athletes
 * @author Kalinga
 *
 */

/**
 * 
 * Athletes compete time win points related functions
 *
 */
public abstract class Athlete extends Participant implements Comparable<Athlete> {

	private int point; // athlete winner points
	public int competeTime; // athlete compete time

	public Athlete(String ID, String name, int age, String state) {
		super(ID, name, age, state);

	}

	protected abstract void compete();

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getCompeteTime() {
		return competeTime;
	}

	/**
	 * override compareTo method in Comparable interface
	 */
	@Override
	public int compareTo(Athlete o) {
		if (this.getCompeteTime() < o.getCompeteTime()) {
			return -1;
		} else if (this.getCompeteTime() > o.getCompeteTime()) {
			return 1;
		}
		return 0;
	}

}
