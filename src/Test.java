import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		Athelete a1 = new Swimmer("S1", "swimm1", 34, "vic");
		Athelete a2 = new SuperAthlete("Sa1", "super1", 22, "vic", 3);
		a1.setPoint(5);
		a2.setPoint(1);
		System.out.println(a1.compete());
		System.out.println("point" + a1.getPoint());
		System.out.println(a2.compete());
		System.out.println("point" + (a2.getPoint()+6));
		
		ArrayList<String> a = new ArrayList<>();
		a.add("sdlkfj");
	}

}

