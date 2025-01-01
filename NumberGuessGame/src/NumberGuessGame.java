package app1;

import java.util.Scanner;

public class NumberGuessGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomNumber = (int) (Math.random() * 100) + 1;
		int userguess = 0;
		int guesscount = 0;
		System.out.println("Welcome to this NumberGuess Game");
		System.out.println("Enter Number between 1 to 100");
		while(userguess != randomNumber) {
			System.out.println("Enter Your Guess Number");
			userguess = sc.nextInt();
			guesscount++;
		if(userguess < randomNumber) {
			System.out.println("Too Low! Try Again");
		}
		else if(userguess > randomNumber) {
			System.out.println("Too High! Try Again");
		}
		else {
			System.out.println("Correct Guess");
			System.out.println("Guess Number: " + guesscount);
		}
		}
	}
}
