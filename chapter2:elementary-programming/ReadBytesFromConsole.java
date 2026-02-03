import java.util.Scanner;

public class ReadBytesFromConsole {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Enter a byte value: ");
   byte byteValue = input.nextByte();
 
   System.out.println("Byte value entered is " + byteValue);
  }
}
