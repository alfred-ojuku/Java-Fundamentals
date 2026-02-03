import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter radius (Real number): ");
    double radius = input.nextDouble();

    double area = 3.14159 * radius * radius;

    System.out.println("The area for the circle of radius " + radius + " is " + area);
  }
}
