package abstractPractice;

public class TestAbstract {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		
		Circle c2 = new Circle(7);
		
		Parent[] msgs = new Parent[2];
		msgs[0]=new ChildMsg1();
		msgs[1]=new ChildMsg2();
		
		System.out.println(msgs[0].message());
		System.out.println(msgs[1].message());

		
	}

}
