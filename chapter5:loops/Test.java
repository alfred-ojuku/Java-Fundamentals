import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int sum = 0, number;
		do {
			System.out.println("Enter an integer " + "the input ends if it is 0");
			number = input.nextInt();

			sum += number;
		} while (number != 0);

		System.out.println("The sum is " + sum);
	}
}
