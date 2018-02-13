package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.PetHero;

class PetHeroTest {

	@Test
	void WhenQuitGameThenEndMainLoop() {
		//PetHero.startGame();
		PetHero.quitGame();
		assertEquals(false, PetHero.playing);
	}
	
	@Test
	void WhenNumberEnteredIsValidCommand() {
		assertTrue(PetHero.isValidInput("1"));
		assertTrue(PetHero.isValidInput("2"));
		assertTrue(PetHero.isValidInput("3"));
		assertTrue(PetHero.isValidInput("4"));
		assertTrue(PetHero.isValidInput("5"));
	}
	
	@Test
	void WhenNum() {
		
	}

}
