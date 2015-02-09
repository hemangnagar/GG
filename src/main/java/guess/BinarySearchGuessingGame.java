package guess;

import java.util.Scanner;

/*
 * 
 * The number guessing game is a classical binary search problem that we will be implementing
 */

public class BinarySearchGuessingGame {

	// Provide lower and upper bounds for the guesses
	private static int min = 0;
	private static int max = 100;

	public static void main(String[] args) {

		int guess = min;
		int tries = 0;
		System.out.println("Type \"ready\"  to start \n, "
				+ "and think about a number between 0 to 100, type \"lower\" if your number is lower \n than the guessed number and \"higher\" if"
				+ " the number is higher. \nIf the number is correct, enter \"yes\"");
		Scanner in = new Scanner(System.in);
		String isReady = in.next();
		String response = new String();

		while (!response.equalsIgnoreCase("yes")) {
			if (isReady.equalsIgnoreCase("ready")) {

				tries++;
				guess = (min + max) / 2;

				System.out.println("Is the number " + guess + "?");
				response = in.next();
				System.out.println("response is :" + response);

				if (response.equalsIgnoreCase("yes")) {
					System.out.println("Found in " + tries);
					in.close();
					System.exit(0);
				} else if (response.equalsIgnoreCase("lower")) {
					max = guess - 1;

				} else if (response.equalsIgnoreCase("higher")) {
					min = guess + 1;
				} else if (response.equalsIgnoreCase("end")) {
					System.out.println("I give up");
					System.exit(0);
				}

			} else {
				System.out.println("Please type ready");
				isReady = in.next();
			}
		}

	}

}
