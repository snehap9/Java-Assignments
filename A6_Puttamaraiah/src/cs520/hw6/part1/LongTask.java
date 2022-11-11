package cs520.hw6.part1;

public class LongTask extends Thread {
	private SharedResults sharedData;
	private StringBuffer inputData;
	private char target;

	LongTask(SharedResults sharedData, StringBuffer inputData, char target) {
		super("Thread_" + target);
		this.sharedData = sharedData;
		this.inputData = inputData;
		this.target = target;
	}

	public void run() {
		System.out.println("Thread_" + target + " running");
		int count = 0;
		// access each character in inputData
		for (int i = 0; i < inputData.length(); i++) {
			// counting the occurrences of target
			if (inputData.charAt(i) == target) {
				count++;
			}
		}
		ResultsEntry re = new ResultsEntry(count, target);
		sharedData.addToResults(re);

	}

}
