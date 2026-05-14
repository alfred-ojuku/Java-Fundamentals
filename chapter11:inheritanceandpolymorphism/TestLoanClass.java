import java.util.Scanner;

public class TestLoanClass{
	/** Main method */
	public static void main(String[] args){
		// create a scanner
		Scanner input = new Scanner(System.in);

		// Enter annual interest rate
		System.out.println("Enter annual interest rate, for example, 8.25: ");
		double annualInterestRate = input.nextDouble();

		// Enter number of years
		System.out.println("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();

		// Enter loan amount
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();

		// create loan object
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

		// print Loan string
		System.out.println("Loan String: " + loan.toString());

		// display loan date, monthly payment and total payment
		System.out.println("The loan was created on " + loan.getLoanDate().toString());
		System.out.println("The monthly paymnet is " + loan.getMonthlyPayment());
		System.out.println("The total payment is " + loan.getTotalPayment());
	}
}
