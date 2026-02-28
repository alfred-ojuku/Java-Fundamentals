public class CircleWithPrivateDataFields{
	/** the radius of the circle */
	private double radius = 1;

	/** number of objects created */
	private static int numberOfObjects = 0;

	/** construct a circle with radius 1 */
	public CircleWithPrivateDataFields(){
		numberOfObjects++;
	}

	/** construct a circle with a specified radius */
	public CircleWithPrivateDataFields(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}

	/** return radius */
	public double getRadius(){
		return radius;
	}

	/** set new radius */
	public void setRadius(double newRadius){
		radius = (newRadius >= 0) ? newRadius : 0;
	}

	/** return number of objects */
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}

	/** return the area of this circle */
	public double getArea(){
		return radius * radius * Math.PI;
	}
}
