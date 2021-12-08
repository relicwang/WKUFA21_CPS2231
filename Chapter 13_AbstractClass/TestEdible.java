package abstractPractice;

public class TestEdible {

	public static void main(String[] args) {
		
		String s1 ="wku";
		
		String s2 = "w1kucs";
		
		System.out.println(s1.compareTo(s2));
		
	    Object[] objects = {new Tiger(), new Chicken(), new Apple()};
	    for (int i = 0; i < objects.length; i++) {
	      if (objects[i] instanceof Edible)
	        System.out.println(((Edible)objects[i]).howToEat());

	      if (objects[i] instanceof Animal) {
	        System.out.println(((Animal)objects[i]).sound());
	      }
	    }
	  }
	}

	abstract class Animal {
	  private double weight;
	  
	  public double getWeight() {
	    return weight;
	  }
	  
	  public void setWeight(double weight) {
	    this.weight = weight;
	  }
	  
	  /** Return animal sound */
	  public abstract String sound();
	}

	class Chicken extends Animal implements Edible  {
	  @Override
	  public String howToEat() {
	    return "Chicken: Fry it";
	  }
	    
	  @Override
	  public String sound() {
	    return "Chicken: cock-a-doodle-doo";
	  }
	}

	class Tiger extends Animal {
	  @Override
	  public String sound() {
	    return "Tiger: RROOAARR";
	  }
	}

	abstract class Fruit implements Edible {
	  // Data fields, constructors, and methods omitted here
		 //1. Implement that abstract method
		 
		 //2. Make your class to be abstract
	 }

	class Apple extends Fruit {
	  @Override
	  public String howToEat() {
	    return "Apple: Make apple cider";
	  }
	}

	class Orange extends Fruit {
	  @Override
	  public String howToEat() {
	    return "Orange: Make orange juice";
	  }
	}