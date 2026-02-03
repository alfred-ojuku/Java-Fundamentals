import java.util.Scanner;

public class ReadLine {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a line: ");
	String s1 = input.nextLine();

	System.out.println("The line entered is " + s1);	
	}
}
