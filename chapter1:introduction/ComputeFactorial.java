import java.util.Scanner;

public class ComputeFactorial {
	/* Main method */
	public static void main(String[] args){
	// Create a new scanner
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a non-negative integer: ");
	int n = input.nextInt();

	// Display Factorial
	System.out.println("Factorial of " + n + " is " + factorial(n));
	}
	/*Return the factorial of the specified number*/
	public static long factorial(int n){		
		if (n == 0) //Base case
			return 1;
		else
			return n * factorial(n - 1);
	}
}

