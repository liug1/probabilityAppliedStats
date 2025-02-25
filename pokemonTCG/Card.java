package pokemonTCG;

public class Card {
	
	private String name;
	
	public Card () {
		setName("Default Card Name");
	}
	
	public void setName(String userInputName) {
		name = userInputName;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
