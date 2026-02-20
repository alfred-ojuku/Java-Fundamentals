import java.util.Scanner;

public class PalindromeFor{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		// user input
		// System.out.print("Enter the english word: ");
		// String m = input.nextLine();

		String m = "detartrated";

		int len = m.length() - 1;
		Boolean isPal = true;
 
		for (int i = 0; i <= (m.length() - 1) / 2; i++){
  			char x = Character.toLowerCase(m.charAt(i));
  			char y = Character.toLowerCase(m.charAt(len - i));
  			if (x != y){
    				isPal = false;
    				break;
 			 }
		}

		if (isPal){
 			System.out.println(m + " is a palindrome"); 
		}
		else{
 		 System.out.println(m + " is not a palindrome");
		}	
	}
}
