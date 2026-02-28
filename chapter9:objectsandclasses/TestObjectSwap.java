public class TestObjectSwap{
	public static void main(String[] args){
		CircleWithPrivateDataFields circle1 = new CircleWithPrivateDataFields(1);
		CircleWithPrivateDataFields circle2 = new CircleWithPrivateDataFields(2);

		swap1(circle1, circle2);
		System.out.println("After swap1: circle1 = " + circle1.getRadius() + " circle2 = " + circle2.getRadius());

	
		swap2(circle1, circle2);
		System.out.println("After swap2: circle1 = " + circle1.getRadius() + " circle2 = " + circle2.getRadius());
	}

	public static void swap1(CircleWithPrivateDataFields x, CircleWithPrivateDataFields y){
		CircleWithPrivateDataFields temp = x;
		x = y;
		y = temp;
	}

	public static void swap2(CircleWithPrivateDataFields x, CircleWithPrivateDataFields y){
		double temp = x.getRadius();
		x.setRadius(y.getRadius());
		y.setRadius(temp);
	}
} 
