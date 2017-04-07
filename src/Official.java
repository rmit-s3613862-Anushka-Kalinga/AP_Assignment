/**
 * 
 * @author Kalinga
 *
 */
public class Official extends Participant {
	private int rank;

	public Official(String ID, String name, int age, String state, int rank) {
		super(ID, name, age, state);
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
