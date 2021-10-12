package ObejectClass;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(99,99);
//		System.out.println(rect1.getArea());
//		System.out.println(Rectangle.getNumberOfRectCreated());
	
		Rectangle.numOfRectangle=-999;//How to handle?
		
		System.out.println("Before change width: "+rect1.getWidth());
		boolean widthChangedSucc = rect1.setWidth(-98);
		System.out.println("Is width changed successuflly?"+widthChangedSucc);

		System.out.println("After change width: "+rect1.getWidth());
		
	
//		System.out.println(rect1.getArea());

		
//		Rectangle rect2 = new Rectangle(5,8);
//		System.out.println(rect2.getArea());
		
	}

}
