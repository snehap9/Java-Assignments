package cs520.hw3.part1;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Please enter name, age, city: ");
			String input = scanner.nextLine();
			input.trim();
			int index1 = input.indexOf(',');
			String name = input.substring(0, index1);
			System.out.println("Name: " + name + " (length: " + name.length() + ")");
			int index2 = input.indexOf(',', index1 + 1);
			String ageString = input.substring(index1 + 1, index2);
			int age = Integer.parseInt(ageString);
			System.out.println("Age: " + age + "\nAge in 10 years: " + (age + 10));
			String city = input.substring(index2 + 1);
			System.out.println("City: " + city + " (length: " + city.length() + ")");
		} catch (Exception e) {
			System.out.println("Sorry, but an error has occurred. Please check your input and try again.");
		}

	}
}
