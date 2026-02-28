public class CircleWithStaticMembers{
	// radius of the circle
	double radius;

	// number of objects created
	static int numberOfObjects = 0;

	// construct circle with radius 1
	CircleWithStaticMembers(){
		radius = 1;
		numberOfObjects++;
	}

	// construct a circle with a specified radius
	CircleWithStaticMembers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}

	// return number of objects
	static int getNumberOfObjects(){
		return numberOfObjects;
	}

	// return the area of this circle
	double getArea(){
		return radius * radius * Math.PI;
	}
}

