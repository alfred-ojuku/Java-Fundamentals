public class TestCircleWithPrivateDataFields{
	/** main method */
	public static void main(String[] args){
		// create circle with radius 5.0
		CircleWithPrivateDataFields c1 = new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius " + c1.getRadius() + " is " + c1.getArea());

		// increase c1's radius by 10%
		c1.setRadius(c1.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " + c1.getRadius() + " is " + c1.getArea());

		System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects());
	}
}
