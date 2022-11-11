package cs520.hw6.part1;

import java.util.ArrayList;

public class SharedResults {

	private ArrayList<ResultsEntry> results;

	public SharedResults() {
		this.results = new ArrayList<ResultsEntry>();
	}

	public synchronized void addToResults(ResultsEntry res) {
		System.out.println("Thread_" + res.getTarget() + " is adding <" + res.getTarget() + "," + res.getCount() + ">");
		results.add(res);
		System.out.print("Cumulative Results are [");
		for (ResultsEntry r : results) {
			System.out.print("<" + r.toString() + ">");
		}

		System.out.print("]\n");

	}

	public synchronized int getResult() {
		int sum = 0;
		for (int i = 0; i < results.size(); i++) {
			ResultsEntry result = results.get(i);
			int input = result.getCount();
			sum += input;
		}
		return sum;
	}
}
