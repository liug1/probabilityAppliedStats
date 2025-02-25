package pokemonTCG;

public class Charmander extends Pokemon{
	
	public Charmander() {
		setName("Charmander");
		setHp(50);
		setType("Fire");
	}
	
	public void scratch() {
		setAttack(10);
	}
	
	public void ember() {
		setAttack(30);
	}
}
