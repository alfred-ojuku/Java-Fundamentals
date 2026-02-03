import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
		// Generate two randowm single-digit integers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		Scanner input = new Scanner(System.in);

		// if number1 < number2, swap number1 with number2
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		// Prompt the student to answer what is number1 - number2?
		System.out.print("What is " + number1 + " - " + number2 + "? ");
		int answer = input.nextInt();

		// grade the answer and display result
		if (number1 - number2 == answer) {
			System.out.println("Your answer is correct!");
		}
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
		}
	}
}
