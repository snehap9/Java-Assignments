package cs520.hw1.part2;

import java.util.Scanner;
/**
 * 
 * @author Sneha Puttamaraiah
 *
 */
public class Looping {

	public static void main(String[] args) {
		String input;
		int total = 0;
		Scanner scanner= new Scanner(System.in);
		
		for(int counter=1;counter<=3;counter++) {
			System.out.println("Please enter the value #"+counter+":");
			input = scanner.nextLine();
			int n = Integer.parseInt(input);
			total = total + n;	
		}
		System.out.println("Total:"+total);
		
		if (total<100) {
			System.out.println("It is under 100.");
		}
		else if (total>=100 && total<=200) {
			System.out.println("It is between 100 and 200.");
		}
		else {
			System.out.println("It is above 200.");
		}
		scanner.close();
	}

}
