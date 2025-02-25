package pokemonTCG;

import java.util.Random;

public class Player {

	public Player() {
		drawHand();
		checkPokemon();
	}
	
	public void drawHand() {
		Random rng = new Random();
		for(int i = 0; i < 7; i++) {
			int cardToTakeIndex = rng.nextInt(deck.size());
			Card temp = deck.get(cardToTakeIndex);
			hand.add(temp);
			deck.remove(cardToTakeIndex);
		}
	}
	
	public boolean checkPokemon() {
		// Loop through hand, if one card is a Pokemon, return true, else return false
		for(Card singleCard : hand) {
			if(singleCard instanceof Pokemon) {
				return true;
			}
		}
		return false;
	}
	
	public int reshuffleCount() {
		int reshuffleCount = 0;
		// Need for loop to count the number of reshuffles.
		// "If there is no Pokemon in your hand, you have to redraw a new hand, and the opponent gets 1 card for free"
		// Is there a Pokemon in hand?
		checkPokemon();
		successCount++;
		// while loop
		while (checkPokemon() == false) {
			reshuffleCount++;
			fillDeck();
			drawHand();
			failCount++;
		}
		return reshuffleCount;
	}
	
	public void drawCard() {
		
	}
	
	// Playing Cards
	public void addEnergy() {
		
	}
	
	public void useEnergy() {
		
	}
}
