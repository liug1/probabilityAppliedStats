package pokemonTCG;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Random;

public class PokemonMonteCarlo {
	private Stack<Card> deck;
	private ArrayList<Card> hand;
	
	public PokemonMonteCarlo() {
		deck = new Stack<Card>();
		hand = new ArrayList<Card>();
	}
	
	//YAY?
	public void fillDeck(int inputNumPokemon) {
		
		// Number of Pokemon in deck from 1 to inputNumPokemon
		for (int fillPokemon = 1; fillPokemon <= inputNumPokemon; fillPokemon++) {
			deck.push(new Pokemon());
			//System.out.println("Pokemon " + fillPokemon);
		}
			
		// Number of Energy is filled from (60-inputNumPokemon) to 0
		for (int fillEnergy = 1; fillEnergy <= (60 - inputNumPokemon); fillEnergy++) {
			deck.push(new Energy());
			//System.out.println("Energy " + fillEnergy);
		}
		 //System.out.println("Deck size: " + deck.size());
	}
	
	public void buildDeck() {
		for(int i=0; i<60;i++) {
			deck.push(new Pokemon());
		}
	}
	
	public void printDeck() {
		for (Card singleCard : deck) {
			System.out.println(singleCard);
		}
	}
	
	public void simpleCheck() {
		//draw 7 check poke
		buildDeck();
		drawHand();
		checkPokemon();
	}
	
	public void trialRuns(int inputNumRuns) {
		
		// Start with 1 Pokemon and go to 60 Pokemon
		for(int numPokemon = 1; numPokemon <= 60; numPokemon++) {
			
			System.out.println("Starting with " + numPokemon + " Pokemon...");
			
			int numMulligans = 0;
			
			// Start with 1 run and go to inputNumRuns
			for (int j = 1; j <= inputNumRuns; j++) {
				
				// Make a new deck
				deck = new Stack<>();
				
				// Fill deck with Pokemon
				fillDeck(numPokemon);
				drawHand();
				if (!checkPokemon()) {
					numMulligans++;
				}
			}
			double mulliganRate = ((double) numMulligans / inputNumRuns) * 100;
			System.out.println("Number of mulligans" + numMulligans);
			System.out.println("Mulligan Rate " + mulliganRate);
			System.out.println();
		}
	}	
	
	public void drawHand() {
		for (int i = 0; i < 7; i++) {
			if (!deck.isEmpty()) {
				hand.add(deck.pop());
			}
		}
	}
	
	public void drawCard() {
		if (!deck.isEmpty()) {
			hand.add(deck.pop());
		}
	}
	
	public boolean checkPokemon() {
		// for each Card card element in hand
		for (Card card : hand) {
			//if (card instanceof Pokemon) {
			//System.out.println(card + " My card");
			if 	(card.toString().equals("Pokemon")) {
				//System.out.println("I have a poke");
				return true;
			}
		}
		//System.out.println("I do not have a poke");
		return false;
	}
	
	public void shuffleDeck() {
		deck = new Stack<>();
		
		//for (Card card : hand) {
		//	deck.push(card);
		//}
		//for(Card card : deck) {
		//	card(random value)
		//}
	}
	
	// mulliganRate
	// first count number of mulligans
	// then divide mulligans over trials
	
	// public double mulliganRate(int inputNumRuns) {
		 
	//	checkPokemon();
	//	boolean found = checkPokemon();
		
	//	int mulliganCount = 0;
	//	if (!found) {
	//		mulliganCount++;
	//	}
		
	//	return (double) mulliganCount / inputNumRuns;
	// }
	
	public void run() {
		
		int numRuns = 500;
		
		trialRuns(numRuns);
		
		//System.out.println(mulliganRate(numRuns));
	}
}
