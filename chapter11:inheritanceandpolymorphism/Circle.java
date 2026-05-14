public class Circle extends GeometricObject{
	private double radius;

	public Circle(){
	}

	public Circle(double radius){
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}

	/** return radius */
	public double getRadius(){
		return radius;
	}

	/** set new radius */
	public void setRadius(double radius){
		this.radius = radius;
	}

	/** return area */
	public double getArea(){
		return radius * radius * Math.PI;
	}

	/** return diameter */
	public double getDiameter(){
		return 2 * radius;
	}

	/** return perimeter */
	public double getPerimeter(){
		return 2 * radius * Math.PI;
	}

	/** print the circle info */
	public void printCircle(){
		System.out.println("The circle is created " + super.getDateCreated() + " and the radius is " + radius);
	}

	// override the toString method defined in the superclass
	@Override
	public String toString(){
		return super.toString() + "\nradius is " + radius;
	}
}
