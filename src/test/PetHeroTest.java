package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.PetHero;

class PetHeroTest {

	@Test
	void WhenQuitGameThenEndMainLoop() {
		PetHero.startGame();
		PetHero.quitGame();
		assertEquals(false, PetHero.playing);
	}

}
