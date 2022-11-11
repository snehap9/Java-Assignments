package cs520.hw6.part1;

public class ResultsEntry {
	private int count;
	private char target;

	ResultsEntry(int count, char target) {
		this.count = count;
		this.target = target;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setTarget(char target) {
		this.target = target;
	}

	public int getCount() {
		return count;
	}

	public char getTarget() {
		return target;
	}

	public String toString() {

		return target + "," + count;

	}
}
