package cs520.hw1.part1;

import java.util.Scanner;
/**
 * 
 * @author Sneha Puttamaraiah
 *
 */
public class Demonitize {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of old 1000s:");
		String input1 = scanner.nextLine();
		int thousands = Integer.parseInt(input1);
		System.out.println("Enter no. of old 500s:");
		String input2 = scanner.nextLine();
		int fiveHundreds = Integer.parseInt(input2);

		// calculating total amount in 1000 denomination
		int totalOldThousands = thousands * 1000;
		// calculating total amount in 500 denomination
		int totalOldFiveHundreds = fiveHundreds * 500;
		// total of 1000s and 500s
		int totalAmount = totalOldThousands + totalOldFiveHundreds;
		System.out.println("Requested conversion amount: " + totalAmount);

		int newTwoThousands, newFiveHundreds, remainingAmount;
		// calculating total no. of notes in 2000 denomination
		newTwoThousands = totalAmount / 2000;
		int roundingNewTwoThousands = Math.round(newTwoThousands);
		System.out.println("New 2000 notes: " + roundingNewTwoThousands);

		// amount remaining
		remainingAmount = totalAmount - (2000 * roundingNewTwoThousands);
		System.out.println("Remaining Amount: " + remainingAmount);

		// calculating total no. of notes in 500 denomination
		newFiveHundreds = remainingAmount / 500;
		System.out.println("New 500 notes: " + newFiveHundreds);
		
		scanner.close();
	}

}
