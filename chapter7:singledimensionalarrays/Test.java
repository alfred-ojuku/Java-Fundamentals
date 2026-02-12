public class Test{
	public static void main(String[] args){
		int x = 1; // an int value
		int y[] = new int[10];

		m(x, y); // invoke m with arguments x and y

		System.out.println("x is " + x);
		System.out.println(y[0] + y[1]);
	}

	public static void m(int number, int numbers[]){
		number = 1001; // assign a new value to a number
		numbers[0] = 5555; // assing a new value to numbers[0]
	}
}
