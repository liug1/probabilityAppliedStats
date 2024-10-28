package birthdayProgram;

import java.util.ArrayList;
import java.util.Random;

public class BirthdayProgram {
	
	private ArrayList<Person> classmates = new ArrayList<Person>();
	
	private int sameBirthdayCount;
	private int classSize;
	
	public void fillClassmates(int userInputSize) {
		
		Random rng = new Random();
		
		classSize = userInputSize;
		
		for (int i = 0; i < classSize; i++) {
			int birthday = rng.nextInt(365);
			classmates.add(new Person(birthday));
		}
	}
	
	public void printClassmates() {
		
		for (int i = 0; i < classmates.size(); i++) {
			System.out.println(classmates.get(i).birthday);
		}
	}
	
	public void sameBirthdayCounter() {
		
		for (int i = 0; i < classmates.size(); i++) {
			for (int j = i+1; j < classmates.size(); j++) {
				if (classmates.get(i).birthday == (classmates.get(j).birthday) == true)
					sameBirthdayCount++;
			}
		}
		System.out.println("Same birthday count: " + sameBirthdayCount);
	}
	
	public void findProbability() {
		
		System.out.println("Probability: " + (double)sameBirthdayCount / classmates.size());
	}
	
	public void run() {
	}
}