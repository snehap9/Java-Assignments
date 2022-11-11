package cs520.hw3.part2;

import java.util.Scanner;
import java.io.File;

public class TeamTest {
	public static double createPlayer(String number, String name, String position, String year) {
		int num = Integer.parseInt(number);
		Player player = new Player(name);
		player.setNumber(num);
		player.setPosition(position);
		player.setYear(year);
		double scoringAverage = player.computeScoringAverage();
		System.out.println(player.toString() + ": " + scoringAverage);
		return scoringAverage;
	}

	public static void main(String[] args) {
		double totalScoringAverage = 0;
		double scoringAverage;
		Scanner scanner = null;
		try {
			File file = new File(
					"C:\\\\Users\\\\Ahens\\\\eclipse-workspace\\\\A3_Puttamaraiah\\\\src\\\\cs520\\\\hw3\\\\part2\\\\team.txt");
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String number = scanner.nextLine();
				String name = scanner.nextLine();
				String position = scanner.nextLine();
				String year = scanner.nextLine();
				scoringAverage = createPlayer(number, name, position, year);
				totalScoringAverage += scoringAverage;
				if (scanner.hasNextLine()) {
					scanner.nextLine();
				}
			}
			scanner.close();
			System.out.println("Average score: " + totalScoringAverage / 10);
		} catch (Exception e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
