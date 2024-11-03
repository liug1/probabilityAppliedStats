package montyHallProblem;

import java.util.ArrayList;
import java.util.Random;

public class gameShow {
	
	Random rng = new Random();
	ArrayList<Integer> options;
	
	public int choice(ArrayList<Integer> options){
    	int randomDoor = rng.nextInt(options.size());
        return options.get(randomDoor);
    }
	
	public double winningProbability(boolean userInputSwitchDoor, int userInputTrials) {
		
		double winCount = 0;

        for (int i = 0; i < userInputTrials; i++) {
        	options = new ArrayList<>();
        	options.add(1);
            options.add(2);
            options.add(3);
            
            int car = choice(options);
            int selected = choice(options);
            
            for (Integer door : new ArrayList<>(options)) {
                if (door != car && door != selected) {
                    options.remove(door);
                    break;
                }
            }
            
            if (userInputSwitchDoor) {
                options.remove((Integer)selected);
                selected = choice(options);
            }
            if (selected == car) {
                winCount++;
            }
        }
        return winCount / userInputTrials;
	}
	
	public void run(int userInputTrials) {
		
		boolean switchDoor;
		
		switchDoor = true;
		System.out.println("Probability of winning after switching doors: " + winningProbability(switchDoor, userInputTrials));
		switchDoor = false;
		System.out.println("Probability of winning after staying on the same door: " + winningProbability(switchDoor, userInputTrials));
	}
}