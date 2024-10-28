package birthdayProgram;

public class BirthdayProgramTest {
	
	public static void main(String[] args) {
		
		BirthdayProgram Test = new BirthdayProgram();
		
		// Need User Input for Class Size and Number of Runs
		int classSize = 30;
		// int numRuns = 0;
		
		Test.fillClassmates(classSize);
		Test.printClassmates();
		Test.sameBirthdayCounter();
		Test.findProbability();
	}
}
