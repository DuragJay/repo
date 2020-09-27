package jfotsoAssgnment2;

import java.util.Scanner;
public class RandomNumberGuesser {

	public static void main(String[] args) {
		
	//declare variables
		int lowGuess = 0;
		int highGuess = 100;
		int userGuess;
		int numOfGuesses = 0;
		//scannr object for userinput
		Scanner userInput  = new Scanner(System.in); 
		String userResponse = null;
		boolean InputValue = false;
		//ask user for first guess
		System.out.println("Enter your first guess");
		//store the random numnr
		int randNum;
		randNum = RNG.rand();
		//while userinput isnt correct keeps on doing it
		do 
		{
			System.out.println("Guess: ");
			userGuess = userInput.nextInt();
			numOfGuesses++;
			
			InputValue = RNG.inputValidation(userGuess, lowGuess, highGuess);
			System.out.println("Number of guesses is " + RNG.getCount());
			//it is greater 
			if(userGuess > randNum)
			{
				highGuess = userGuess;
				System.out.println("Number is too high");
				System.out.println("   >>> Guess must be between "+lowGuess+" and "+highGuess+
						   ".  Try again");
				
				InputValue = false;
			}
			
			else if (userGuess < randNum)
			{
				lowGuess  = userGuess;
				System.out.println("Number is too low");
				System.out.println("   >>> Guess must be between "+lowGuess+" and "+highGuess+
						   ".  Try again");
				
				InputValue = false;
				
			}
			//if the userinput correct
			else if (userGuess == randNum)
			{
				System.out.println("Congratulations, you guessed correctly!");
				System.out.println("Try again? (yes or no)");
				userResponse = userInput.next();
				//if the user decides to stop playing
				if(!userResponse.equals("yes"))
				{
					System.out.println("Thanks for playing....");
					InputValue = true;
					System.out.println("Programmer Name: Jason Fotso-Puepi");
					break;
				}
				else
				{
					//reset the count and change the random number
					RNG.resetCount();
					randNum = RNG.rand();
					lowGuess = 0;
					highGuess = 100;
					
				}
				InputValue = false;
			}
		}while(InputValue == false);
		
		// TODO Auto-generated method stub

	}

}
