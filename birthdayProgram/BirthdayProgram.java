package birthdayProgram;

import java.util.ArrayList;
import java.util.Random;

public class BirthdayProgram {
	
	private ArrayList<Person> classmates;
	private int classSize;
	
	public void fillClassmates(int userInputSize) {
		Random rng = new Random();
		classmates = new ArrayList<>();
		classSize = userInputSize;
		
		for (int i = 0; i < classSize; i++) {
			int birthday = rng.nextInt(365);
			classmates.add(new Person(birthday));
		}
	}
	
	public boolean sameBirthdayCheck() {
		for (int i = 0; i < classmates.size(); i++) {
			for (int j = i+1; j < classmates.size(); j++) {
				if (classmates.get(i).birthday == (classmates.get(j).birthday) == true)
					return true;
			}
		}
		return false;
	}
	
	public void run(int userInputSize, int userInputTrials) {
		int count = 0;
		for (int i = 0; i < userInputTrials; i++) {
			fillClassmates(userInputSize);
			if (sameBirthdayCheck()) {
				count++;
			}
		}
		System.out.println("Probability: " + (double)count / userInputTrials);
	}
}