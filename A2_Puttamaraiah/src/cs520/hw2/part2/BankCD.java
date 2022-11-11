/**
 * 
 * @author Sneha Puttamaraiah
 * 
 */
package cs520.hw2.part2;

/**
 * 
 *
 */
import java.lang.Math;

public class BankCD {
	// declaring instance variables
	private String bankName;
	private int initialDeposit;
	private double rate;
	private int numberOfYears;

	// including a no-argument constructor explicitly
	BankCD() {
		// values for instance variables are initialized here
		bankName = "none";
		initialDeposit = 0000;
		rate = 0.0;
		numberOfYears = 0;
	}

	// constructor with one argument
	BankCD(String bankName) {
		this.bankName = bankName;
	}

	// mutator methods for instance variables
	public void setInitialDeposit(int initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	// accessor methods for instance variables
	public int getInitialDeposit() {
		return initialDeposit;
	}

	public double getRate() {
		return rate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	// gets the final value of CD
	public double getFinalValue() {
		double finalValue = initialDeposit * Math.pow((1 + rate), numberOfYears);
		// formatting double value to two decimal places
		return Math.round(finalValue * 100.0) / 100.0;
	}

	public void printCDDetails() {
		System.out.println(this.bankName + " " + this.numberOfYears + "-year CD of $" + this.initialDeposit + " at "
				+ rate * 100 + "0% rate is worth $" + this.getFinalValue());
	}

}
