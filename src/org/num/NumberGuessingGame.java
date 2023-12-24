package org.num;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	
	public static void main(String[] args) {
		
		//Import Random Class
		Random rand=new Random();
		
		//Logic
		int randomNumber=rand.nextInt(100)+1;
//		System.out.println( "Random Number is "+randomNumber);
		
		//Get Input from the USER
		Scanner scan =new Scanner(System.in);
		System.out.println("Welcome to NUMBER GUESSING GAME :)");
		System.out.println("");	
		System.out.println();
		
		//Rules of the game
		System.out.println("Rules of the GAME:");
		System.out.println("-----------------");
		System.out.println("RULE 1:Guess any Number in the Range og 1-100");
		System.out.println("RULE 2:do not Enter ALPHABET");
		System.out.println("");
		
		//Count the number of steps
		int tryCount=0;
		
		//Generate this game until find the answer
		while(true) {
			
			System.out.println("Enter The GUESSING NUMBER In The Range of 1-100:");
			int guessingNumber=scan.nextInt();
			tryCount++;			
			//Number Equal
			if(guessingNumber == randomNumber) {
				System.out.println("CONGRATS! YOU WIN");
				System.out.println("Hey You have find this number in "+tryCount+" steps.");
				break;
			}			
			//Number is Greater
			else if(randomNumber>guessingNumber) {
				System.out.println("Nope! The number is GREATER.Try again.");
				System.out.println();
			}			
			//Number is Lower
			else{
				System.out.println("Nope! The number is LOWER.Try again.");
				System.out.println();
			}		
		}
		scan.close();
	}	
}
