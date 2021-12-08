package Inheritance;

public class C {

	public static void main(String[] args) {
		B b = new B();
	}
}

class A {
	public A() {
		System.out.println("A's no-arg constructor is invoked");
	}
}

class B extends A {
}
