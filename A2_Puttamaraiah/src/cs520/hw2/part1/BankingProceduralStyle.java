/**
 * 
 * @author Sneha Puttamaraiah
 * 
 */
package cs520.hw2.part1;

import java.lang.Math;

public class BankingProceduralStyle {

	public static void main(String[] args) {

		// Variables declared for Bank A
		int initialDepositAmount1;
		String bankName1;
		double interestRate1;
		int bankTerm1;

		// Variables initialized for Bank A
		initialDepositAmount1 = 5000;
		bankName1 = "BankA";
		interestRate1 = .04;
		bankTerm1 = 3;

		// Computing final value of CD for Bank A
		double finalValueBankA = initialDepositAmount1 * Math.pow((1 + interestRate1), bankTerm1);

		// Variables declared for Bank B
		int initialDepositAmount2;
		String bankName2;
		double interestRate2;
		int bankTerm2;

		// Variables initialized for Bank B
		initialDepositAmount2 = 5000;
		bankName2 = "BankB";
		interestRate2 = .03;
		bankTerm2 = 4;

		// Computing final value of CD for Bank B
		double finalValueBankB = initialDepositAmount2 * Math.pow((1 + interestRate2), bankTerm2);

		System.out.printf(bankName1 + " " + bankTerm1 + "-year CD of $" + initialDepositAmount1
				+ " is at 4.00%% rate is worth %.2f", finalValueBankA);
		System.out.printf("\n" + bankName2 + " " + bankTerm2 + "-year CD of $" + initialDepositAmount2
				+ " is at 3.00%% rate is worth %.2f", finalValueBankB);

		double bankAExceeds = (finalValueBankA - finalValueBankB);
		double bankBExceeds = (finalValueBankB - finalValueBankA);

		// checking which bank yields higher results
		if ((finalValueBankA - finalValueBankB) > 0) {
			System.out.printf("\nBankA's CD exceeds BankB's CD by $%.2f", bankAExceeds);
		} else if ((finalValueBankA - finalValueBankB) < 0) {
			System.out.printf("\nBankB's CD exceeds BankA's CD by $%.2f", bankBExceeds);
		} else {
			System.out.println("\nBankA's CD equals BankB's CD");
		}
	}

}
