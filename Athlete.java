
public class Athlete {
	static int nextBibNumber;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;

	Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		this.bibNumber = nextBibNumber;
		nextBibNumber+=2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Athlete j = new Athlete("Joe", 22);
		Athlete p = new Athlete("Pepe", 75);
		System.out.println(j.bibNumber);
		System.out.println(p.bibNumber);
	}

}
