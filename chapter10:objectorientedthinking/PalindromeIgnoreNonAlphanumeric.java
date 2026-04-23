import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();

		//display results
		System.out.println("Ignoring nonalphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));
	}

	/** return true if a string is a palindrome*/
	public static boolean isPalindrome(String s){
		String s1 = filter(s);

		String s2 = reverse(s1);

		return s2.equals(s1);	
	}

	/** create a new string by eliminating nonalphanumeric chars */
	public static String filter(String s){
		// create a string builder
		StringBuilder stringBuilder = new StringBuilder();

		// Examine each char in the string
		for (int i = 0; i < s.length(); i++){
			if (Character.isLetterOrDigit(s.charAt(i))){
				stringBuilder.append(s.charAt(i));
			}
		}

		return stringBuilder.toString();
	}

	/** create a new string by reversing a specified string */
	public static String reverse(String s){
		StringBuilder stringBuilder = new StringBuilder(s);
		
		stringBuilder.reverse();
		return stringBuilder.toString();
	}
}
