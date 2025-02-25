package pokemonTCG;

import java.util.ArrayList;
import java.util.Random;

public class CardGame {
	private ArrayList<Card> deck;
	private ArrayList<Card> hand;
	private int successCount;
	private int failCount;
	
	public CardGame() {
		deck = new ArrayList<>();
		hand = new ArrayList<>();
	}
	
	public void fillDeck() {
		
		// This adds 60 Charmander
		
		// for(int i = 0; i < 60; i++) {
		//	deck.add(new Charmander());
		// }
		
		// This adds 59 Energy cards
		
		for(int i = 0; i < 59; i++) {
			deck.add(new Energy());
		}
		
		// This adds 1 Charmander
		
		deck.add(new Charmander());
	}	
	
	public void flipCoin() {
		int heads = 0;
		int tails = 1;
	}
	
	public void draw7() {
		
	}
	
	////////
	//public void successCounter() {
	//	checkPokemon();
	//	boolean found = checkPokemon();
	//	if(found) {
	//		successCount++;
	//	}
	//}
	
	// Template, add methods here to make program run
	public void run() {
		int num_simulation = 10000;	
	}
	
	public double run(int userInputNumSimulation) {
		
		fillDeck();
		// Shuffle deck is okay, but we will do it later.
		flipCoin();
		drawHand();
		checkPokemon();
		makePrizePool();
		
		checkCoinWinner();
		playerActions();
		
		while(gameInSession) {
			player1Turn();
			
		}
		
		System.out.println("Reshuffle Count: " + reshuffleCount());
		return ((double) successCount / userInputNumSimulation) * 100;
	}
}
