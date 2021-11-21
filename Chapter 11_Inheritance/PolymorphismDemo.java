package Inheritance;

import ObejectClass.Rectangle;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Object o1 = new Rectangle(7,8);
		System.out.println(o1);
		
		
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());

	}

	public static void m(Object x) {
		System.out.println(x.toString());
	}

}

class GraduateStudent extends Student {
}

class Student extends Person {

	public String toString() {
		return "Student";
	}
}

class Person extends Object {

	public String toString() {
		return "Person";
	}
}
