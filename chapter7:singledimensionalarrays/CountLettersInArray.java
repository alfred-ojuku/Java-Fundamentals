public class CountLettersInArray{
	public static void main(String[] args){
		// declare and create an array
		char[] chars = createArray();

		// display the array
		System.out.println("The lowercase letters are:");
		displayArray(chars);

		int[] counts = countLetters(chars);

		// display counts
		System.out.println();
		System.out.println("The occurences of each letter are:");
		displayCounts(counts);

	}

	/** create an array of characters */
	public static char[] createArray(){
		// declare an array of characters and create it
		char[] chars = new char[100];

		// create lowercase letters randomly and assign them to the array
		for (int i = 0; i < chars.length; i++){
			//chars[i] = RandomCharacter.getRandomLowerCaseLetter();
			chars[i] = (char)('a' + (int)(Math.random() * 26));
		}
		
		return chars;
	}

	/** display the array of characters */
	public static void displayArray(char[] chars){
		// display the characters in the array 20 on each line
		for (int i = 0; i < chars.length; i++){
			if ((i + 1) % 20 == 0){
				System.out.println(chars[i]);
			}
			else{
				System.out.print(chars[i] + " ");
			}
		}
	}

	/** count the occurences of each letter */
	public static int[] countLetters(char[] chars){
		// declare and create an array of 26 int
		int[] counts = new int[26];

		// for each lowercase letter in the array, count it
		for (int i = 0; i < chars.length; i++){
			counts[chars[i] - 'a']++;
		}

		return counts;
	}

	/** display counts */
	public static void displayCounts(int[] counts){
		for (int i = 0; i < counts.length; i++){
			if ((i + 1) % 10 == 0){
				System.out.println(counts[i] + " " + (char)(i + 'a'));
			}
			else{
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
			}
		}
	}	
}
