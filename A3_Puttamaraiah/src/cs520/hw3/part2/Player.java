package cs520.hw3.part2;

import java.util.Random;

public class Player {
	private int number;
	private String name;
	private String position;
	private String year;
	
	public Player() {
		
	}
	public Player(String name) {
		this.name=name;
	}
	public void setNumber(int number) {
		this.number = number;
		
	}
	public int getNumber() {
			return number;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
			return name;
	}
	public void setPosition(String position) {
		this.position = position;
		
	}
	public String getPosition() {
			return position;
	}
	public void setYear(String year) {
		this.year = year;
		
	}
	public String getYear() {
			return year;
	}
	public double computeScoringAverage() {
		Random random = new Random();
		double r = random.nextDouble();
		return r;
	}
	public String toString() {
		return ("#"+number+": "+name+" ("+position+", "+year+")");
	}
	
}
