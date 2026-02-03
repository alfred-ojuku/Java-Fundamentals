import java.util.Scanner;

public class ComputeAndInterpretBMI {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		// prompt the user to enter weight in kg
		System.out.print("Enter weight in kg: ");
		double weight = input.nextDouble();

		// prompt the user to enter height in meters
		System.out.print("Enter height in meters: ");
		double height = input.nextDouble();

		double bmi = weight / (height * height);

		System.out.println("BMI is " + bmi);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		}
		else if (bmi < 25) {
			System.out.println("Normal");
		}
		else if (bmi < 30) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}
}
