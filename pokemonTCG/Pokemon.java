package pokemonTCG;

public class Pokemon extends Card{
	
	private int hp;
	private int attack;
	private String type;
	
	public Pokemon() {
		setName("Pokemon");
	}
	
	// HP Things
	public void setHp(int userInputHp) {
		hp = userInputHp;
	}
	
	public int getHp() {
		return hp;
	}
	
	// Attack Things
	public void setAttack(int userInputAttack) {
		attack = userInputAttack;
	}
	
	public int getAttack(int userInputAttack) {
		return attack;
	}
	
	// Type Things
	public void setType(String userInputType) {
		type = userInputType;
	}
	
	public String getType() {
		return type;
	}
}
