package ObejectClass;

public class TestFan {

	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		f1.setOn(false);
		f1.setRadius(78);
		
		f2.setOn(true);
		f2.setRadius(3);
		
		System.out.println(f1.toString());
		System.out.println();

		System.out.println(f2.toString());

	}

}
