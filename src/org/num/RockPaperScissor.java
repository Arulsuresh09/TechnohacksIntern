package org.num;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		//Scanner Class
		System.out.println("Welcome to RPS Game");
		Scanner scan =new Scanner(System.in);
		
		//Iterating While Loop
		while(true) {
			String[] key = {"rock","paper","scissor"};
			String computerPlay = key[new Random().nextInt(key.length)];
			String playerMove;
			while(true) {
				System.out.println("Enter your move");
				System.out.println("1.ROCK");
				System.out.println("2.PAPER");
				System.out.println("3.SCISSOR");
				playerMove = scan.next();
				
				//UnWanted input
				if(playerMove.equals("rock")||playerMove.equals("paper")||playerMove.equals("scissor")){
					break;
				}
					System.out.println(playerMove + "is a inValid Move.");
					System.out.println("Valid move is Rock,Paper,Scissor");
				}
			
				//game tie
				System.out.println(computerPlay + " computer move");
				if(computerPlay.equals(playerMove)) {
					System.out.println("Oops! This Game is Tie.");
				}
				
				//Player input Rock
				else if(playerMove.equals("rock")) {
					if(computerPlay.equals("scissor")) {
						System.out.println("You Win");
					}
					else if(computerPlay.equals("paper")) {
						System.out.println("You Lose");		
					}		
				}
				
				//Player Input paper
				else if(playerMove.equals("paper")) {
					if(computerPlay.equals("rock")) {
						System.out.println("You Win");
					}
					else if(computerPlay.equals("scissor")) {
						System.out.println("You Lose");		
					}	
				}
				
				//Player input scissor
				else if(playerMove.equals("scissor")) {
					if(computerPlay.equals("paper")) {
						System.out.println("You Win");
					}
					else if(computerPlay.equals("rock")) {
						System.out.println("You Lose");		
					}		
			}
			
			//play Again Game
			System.out.println("play Again? (y/n)");
			scan.nextLine();
			String playAgain = scan.nextLine();
			
			if(!playAgain.equals("y")) {
				System.out.println("Game Over");
				break;
			}
		}
	}	
}
