package abstractPractice;


//
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

	public ComparableCircle(double radius) {
		super(radius);
	}

	
	@Override
	//Given this > o, return + : 1
	//      this object<o, return -: -1
	//      this object ==o, return 0
	public int compareTo(ComparableCircle o) {
		if(this.getRadius()>o.getRadius()) {
			return 1;
 		}
		
		else if(this.getRadius()<o.getRadius()) {
			return -1;
		}
		else {
			return 0;
		}
	}

	  @Override
	  public String toString() {
	    return  this.getRadius()+"";
	  }
}
