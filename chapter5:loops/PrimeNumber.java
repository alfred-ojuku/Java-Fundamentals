public class PrimeNumber{
	public static void main(String[] args){
		final int NUMBER_OF_PRIMES = 50; // Number of primes to display
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int count = 0; // count the number of prime numbers
		int number = 2; // a number to be tested for primeness

		System.out.println("The first 50 prime numbers are \n");

		// repeatedly find prime numbers
		while (count < NUMBER_OF_PRIMES){
			// assume the number is prime
			boolean isPrime = true; // is the current number prime?

			// Test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++){
				if (number % divisor == 0){ // if true, number is not prime
					isPrime = false; // set isPrime to false
					break; // exit from the lopp
				}
			}
			if (isPrime){
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
					// display the number and advance to the new lin
					System.out.println(number);
				}
				else{
					System.out.print(number + " ");
				}
			}
			number++;
		}
	}
}
