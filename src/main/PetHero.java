package main;

public class PetHero {
	
	public static boolean playing;

	public static void main(String[] args) {
		startGame();
	}
	
	public static void startGame() {
		// run game loop
		playing = true;
		while(playing) {
			System.out.println("main loop running");
			break;
		}
	}
	
	public static void quitGame() {
		
	}
	
	public static void goAdventuring() {
		
	}
	
	public static void goTraining() {
		
	}
	
	public static void goResting() {
		
	}

}
