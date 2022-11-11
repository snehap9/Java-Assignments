/**
 * 
 * @author Sneha Puttamaraiah
 * 
 */
package cs520.hw2.part2;

public class BankingObjectStyle extends BankCD {

	public static void main(String[] args) {
		/*
		 * calling a no argument constructor that prints default values initialized
		 * BankCD bankCD = new BankCD(); bankCD.printCDDetails();
		 */

		// initializing values for BankA
		BankCD bank1CD = new BankCD("BankA");
		bank1CD.setInitialDeposit(5000);
		bank1CD.setRate(.04);
		bank1CD.setNumberOfYears(3);
		bank1CD.printCDDetails();

		// initializing values for BankA
		BankCD bank2CD = new BankCD("BankB");
		bank2CD.setInitialDeposit(5000);
		bank2CD.setRate(.03);
		bank2CD.setNumberOfYears(4);
		bank2CD.printCDDetails();

		// checking which bank yields higher results
		if ((bank1CD.getFinalValue() - bank2CD.getFinalValue()) < 0) {
			System.out.printf("BankB's CD exceeds BankA's CD by $%.2f",
					(bank2CD.getFinalValue() - bank1CD.getFinalValue()));
		} else if ((bank1CD.getFinalValue() - bank2CD.getFinalValue()) > 0) {
			System.out.printf("BankA's CD exceeds BankB's CD by $%.2f",
					(bank1CD.getFinalValue() - bank2CD.getFinalValue()));
		} else {
			System.out.println("BankA's CD equals BankB's CD");
		}
	}

}
