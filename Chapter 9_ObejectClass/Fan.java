package ObejectClass;

public class Fan {
	//3 Constants:
	//   SLOW, MEDIUM, and FAST  --> 1, 2, 3
	final int SLOW =1;
	final int MEDIUM =2;
	final int FAST =3;
	
	/**Data Fields**/
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	/**Constructor**/
	Fan(){
		
	}
	
	
	/**Signature: setSpeed: int --> boolean
	 * Purpose:   Set the speed of the fan if the 
	 *            speed given by user is valid (speed:
	 *             SLOW, MEDIUM, FAST) and return true;
	 *             Otherwise, return false.
	 */
	boolean setSpeed(int speed) {
		if(speed>=SLOW&&speed<=FAST) {
			this.speed=speed;
			return true;
		}
		else {
			return false;
		}
	}
	
	/**Signature: getSpeed:  --> int
	 * Purpose:   Return the speed of the fan  (speed:
	 *             SLOW, MEDIUM, FAST) .
	 */
	int getSpeed() {
		return  this.speed;
	}
	
	
	/**Signature: setOn: boolean(on/off) --> boolean(whether we set succes.)
	 * Purpose:   Set the status of the fan on or off(using true or false).
	 *            If the original status == new status, --> return false(shows not changed_
	 *            If the original status != new status, --> change the status, and true.
	 */
	boolean setOn(boolean on) {
		if(this.on!=on) {
			this.on = on;
			return true;
		}
		return false;
	}
	
	/**Signature: getOn:  --> boolean 
	 * Purpose:   Return the status of the fan  .
	 */
	boolean getOn() {
		return this.on;
	}
	
	
	/**Signature: setRadius: double --> boolean
	 * Purpose:   Set the radius of the fan if the 
	 *            radius given by user is valid (radius
	 *            >0) and return true;
	 *             Otherwise, return false.
	 */
	boolean setRadius(double radius) {
		if(radius>0) {
			this.radius = radius;
			return true;
		}
		return false;
	}
	
	/**Signature: getRadius:  --> double 
	 * Purpose:   Return the radius of the fan  .
	 */
	double getRadius() {
		return this.radius;
	}
	
	/**Signature: setColor: String --> boolean
	 * Purpose:   Set the color of the fan and return ture;
	 *
	 */
	boolean setColor(String color) {
		this.color = color;
		return true;
	}
	
	
	/**Signature: getColor:  --> String 
	 * Purpose:   Return the Color of the fan  .
	 */
	String getColor() {
		return this.color;
	}
	

	
	/**Sigature: toString:   -> String
	 * Purpose:
	 * Returns a string description for the fan. 
	 * If the fan is on, returns the fan speed, color, and radius in one combined string. 
	 * If the fan is not on,returns the fan color and radius along with the string ¡°fan is off¡± in one combined string.
	 */
//	
//	public String toString() {
//		//If the fan is on,
//		//returns the fan speed, color, and radius in one combined string. 
//		if(on) {
//			return speed+" "+ color+" "+radius;
//		}
//		//If the fan is not on,
//		//returns the fan color and radius along with the string ¡°fan is off¡± in one combined string.
//		else {
//			return color+" "+radius+"fan is off";
//		}
//		
//	}
	
}
