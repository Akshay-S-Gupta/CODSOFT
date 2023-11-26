//TASK -- 01
//Importing Random and Scanner classes.
import java.util.Scanner;
import java.util.Random;

public class NumGame {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		//Generating a random integer between 1 and 100.
		int number = rand.nextInt(100);
		int i, n = 5;
		
		System.out.println("Guess the number between 1 & 100:\n");
		
		//Prompts untill n trials.
		for (i = 0; i < n; i++) {
			
			System.out.printf("%d trials left: ", (n-i));
			int guess = in.nextInt();
			
			//if the guess is correct.
			if (number == guess) {
				System.out.println("\nCongratulations! You guessed the number.");
				break;
			}
			
			//when guess is lower than the number.
			else if (number > guess && i != n - 1) {
				System.out.println("\nThe number is greater than " + guess);
			}
			
			//when guess is greater than the number.
			else if (number < guess && i != n - 1) {
				System.out.println("\nThe number is less than " + guess);
			}
		}

		//if the user is out if trials.
		if (i == n) {
			System.out.println("\5 trials are exhausted :(");
			System.out.println("The number was " + number);
		}
	}
}
