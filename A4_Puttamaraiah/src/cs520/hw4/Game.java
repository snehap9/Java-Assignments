/**
 * @author Sneha Puttamariah
 */
package cs520.hw4;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private int day;
	private int month;
	private int year;
	public String teamName;
	private String opponentName;
	public List<Player> players = new ArrayList<Player>();

	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setOpponentName(String opponentName) {
		this.opponentName = opponentName;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getOpponentName() {
		return opponentName;
	}

	public void simulateGame() {
		int teamPoints = 0;
		System.out.println(
				"Game played on " + this.month + "/" + this.day + "/" + this.year + " vs. " + this.opponentName);

		for (Player player : this.players) {
			//generates a random number between 1 and 10 
			int points = (int) ((Math.random() * 10) + 1);
			teamPoints += points;
			System.out.println(player.toString() + " scored " + points + " points");
		}
		//generates a random number between 1 and 100 for opponent teams
		int opponentPoints = (int) ((Math.random() * 100) + 1);
		System.out.printf("Final score: %s %s, %s %d", teamName, teamPoints, opponentName, opponentPoints);
		System.out.println();
	}

	public void setPlayers(List<Player> players) {
		this.players = new ArrayList<Player>(players);
	}

}
