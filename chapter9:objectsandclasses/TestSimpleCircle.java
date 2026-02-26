public class TestSimpleCircle{
	/** Main method */
	public static void main(String[] args){
		// create a circle with radius 1
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

		//create circle with radius 25
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

		// create circle with radius 125
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

		//modify circle radius
		circle2.radius = 100;
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	}
}

// define the circle class with 2 constructors
class SimpleCircle{
	double radius;

	/** construct a circle with a radius of 1 */
	SimpleCircle(){
		radius = 1;
	}

	/** construct a circle with a specified radius */
	SimpleCircle(double newRadius){
		radius = newRadius;
	}

	/** return the area of this circle */
	double getArea(){
		return radius * radius * Math.PI;
	}

	/** return perimeter of the circle */
	double getPerimeter(){
		return 2 * radius * Math.PI;
	}
	
	/** set a new radius for this circle */
	void setRadius(double newRadius){
		radius = newRadius;
	}
}
