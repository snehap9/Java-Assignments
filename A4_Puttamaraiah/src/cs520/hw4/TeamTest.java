/**
 * @author Sneha Puttamariah
 */
package cs520.hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class TeamTest {
	public static Player createPlayer(String number, String name, String position, String year) {
		int num = Integer.parseInt(number);
		Player player = new Player(name);
		player.setNumber(num);
		player.setPosition(position);
		player.setYear(year);
		return player;
	}

	public static void main(String[] args) {
		List<Player> players = new ArrayList<Player>();
		Scanner scanner = null;

		File file = new File(
				"C:\\\\Users\\\\Ahens\\\\eclipse-workspace\\\\A4_Puttamaraiah\\\\src\\\\cs520\\\\hw4\\\\team.txt");

		try {
			scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String number = scanner.nextLine();
				String name = scanner.nextLine();
				String position = scanner.nextLine();
				String year = scanner.nextLine();

				// assigning the returned Player's object to the local variable player
				Player player = createPlayer(number, name, position, year);

				if (scanner.hasNextLine()) {
					scanner.nextLine();
				}
				// adding player to the players list
				players.add(player);
			}

			String[] opponents = { "BC", "Northeastern", "Harvard", "MIT", "UMass" };
			for (int i = 0; i < opponents.length; i++) {
				Game game = new Game();
				game.setTeamName("BU");
				game.setOpponentName(opponents[i]);
				game.setDate(9, 1, 2020);
				game.setPlayers(players);
				game.simulateGame();
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Something went wrong!");
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
