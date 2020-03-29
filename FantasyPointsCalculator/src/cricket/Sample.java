package cricket;

import java.util.Scanner;

public class Sample {

	public static float points;
	public static boolean fiftyFlag;
	public static int fiftypoint;

	// public static int fours;
	// public static int six;
	// // Dismissal for duck (excluding
	// bowlers)
	// if else for wicket haul
	public static int runs;
	public static int balls;

	public static String match;

	public static void main(String[] args) {

		int number;

		Scanner input = new Scanner(System.in);

//    	System.out.print("Enter an integer: ");
//    	 number = input.nextInt();
//    	System.out.println("You entered " + number);

//		calculatePoints(62, 40, 2, 5, 1, 0, 0, 0, 3, 1, 1, 0, 0, (float)4.49);
		System.out.println("Enter RUNS: ");
		System.out.println("Enter balls : ");
		System.out.println("Enter fours : ");
		System.out.println("Enter six : ");
		System.out.println("Enter CATCHES : ");
		System.out.println("Enter stumpings: ");
		System.out.println("Enter runout: ");
		System.out.println("Enter direct runout: ");
		System.out.println("Enter WICKETS: ");
		System.out.println("Enter maiden overs: ");
		System.out.println("Enter three wickets: ");
		System.out.println("Enter five wickets: ");
		System.out.println("Enter seven wickets: ");
		System.out.println("Enter ECONOMY: ");

		calculatePoints(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt(), input.nextFloat());

		// calculatePoints(8, 9, 1, 10);
		// System.out.println(calcEco((float) 4.5));

	}

	public static void calculatePoints(int runs, int balls, int fours, int six, int catc, int stump, int runout,
			int dirrun, int wicket, int maiden, int wic3, int wic5, int wic7, float econ) {

		points = (float) ((runs * 0.5) + (fours * 0.5) + (six) + getfifty(runs) + getHun(runs) + getDoubHun(runs)
				+ strPoint(runs, balls) + (catc * 4) + (stump * 6) + (runout * 3) + (dirrun * 6) + (wicket * 12)
				+ (maiden * 2) + (wic3 * 3) + (wic5 * 6) + (wic7 * 9) + calcEco(econ));
		System.out.println(points);

	}

	public static int getfifty(int runs) {
		if (runs >= 50 && runs <= 99) {
			fiftypoint = 2;
		} else {
			fiftypoint = 0;
		}
//		System.out.println(fiftypoint);
		return fiftypoint;

	}

	public static int getHun(int runs) {
		if (runs >= 100 && runs <= 199) {
			fiftypoint = 4;
		} else {
			fiftypoint = 0;
		}
//		System.out.println(fiftypoint);
		return fiftypoint;

	}

	public static int getDoubHun(int runs) {
		if (runs >= 200 && runs <= 299) {
			fiftypoint = 8;
		} else {
			fiftypoint = 0;
		}
//		System.out.println(fiftypoint);
		return fiftypoint;

	}

	public static int strPoint(int runs, int balls) {
		int stpoint = 0;

		float strRate = (float) runs / balls;
		float strRate1 = strRate * 100;
		if (runs >= 20 || balls >= 10) {
			if (strRate1 < 50) {
				stpoint = -2;
			} else if (strRate1 >= 50 && strRate1 <= 74.99) {
				stpoint = -1;
			} else if (strRate1 >= 75 && strRate1 <= 99.99) {
				stpoint = 0;
			} else if (strRate1 >= 100 && strRate1 <= 149.99) {
				stpoint = 1;
			} else if (strRate1 >= 150 && strRate1 <= 199.99) {
				stpoint = 2;
			} else if (strRate1 >= 200) {
				stpoint = 3;
			}
		}

//		System.out.println(strRate1);
//		System.out.println(stpoint);
		return stpoint;

	}

	public static int calcEco(float econ) {
		int ecopts = 0;
		if (econ < 3 && econ >= 0.1)
			ecopts = 3;
		else if (econ >= 3.00 && econ <= 4.49)
			ecopts = 2;
		else if (econ >= 4.50 && econ <= 5.99)
			ecopts = 1;
		else if (econ >= 6.00 && econ <= 7.49)
			ecopts = -1;
		else if (econ >= 7.50 && econ <= 8.99)
			ecopts = -2;
		else if (econ >= 9)
			ecopts = -3;
		return ecopts;

	}
}
