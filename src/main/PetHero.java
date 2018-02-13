package main;

import java.util.Scanner;

public class PetHero {
	
	public static boolean playing;

	public static void main(String[] args) {
		startGame();
	}
	
	public static void startGame() {
		// run game loop
		playing = true;
		while(playing) {
			System.out.println("Welcome, please type in one of the following numbers:");
			System.out.println("1: Adventure");
			System.out.println("2: Train");
			System.out.println("3: Rest");
			System.out.println("4: Quit");
			
			Scanner userInput = new Scanner(System.in);
			String input = userInput.nextLine();
			
			while(!isValidInput(input)) {
				
			}
				
			
		}
	}
	
	public static boolean isValidInput(String input) {
		if (input.equals("1") || input.equals("2") || input.equals("3") ||
				input.equals("4") || input.equals("5")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void quitGame() {
		playing = false;
	}
	
	public static void goAdventuring() {
		
	}
	
	public static void goTraining() {
		
	}
	
	public static void goResting() {
		
	}

}
