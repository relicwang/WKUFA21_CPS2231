package Inheritance;

public class TestAbstract {

	public static void main(String[] args) {

//		GeometricObject geo2 = new GeometricObject();
//		geo2.getArea();
		
		
//		GeometricObject[] geos = new GeometricObject[100];
//		geos[0]=new Triangle();
//		geos[1]=new Triangle();
//		geos[2]=new Rectangle();
//      Saved all geo children objects in the array
		
		
//		for(int i=0;i<geos.length;i++) {
//			geos[i].getArea();
//		}
		
//		System.out.println(go1.getArea());
			
		GeometricObject geo1 = new Triangle();
		
		
		
		
		
		
		if(geo instanceof Circle) {
			((Circle)geo1).getArea();
		}
		else if(geo instanceof Rectangle) {
			((Rectangle)geo1).getArea();
		}
		else if(geo instanceof Triangle) {
			((Triangle)geo1).getArea();
		}
		
		.args.cl
	}

}
