import java.util.Scanner;

public class OneRepMax {

	public double[] oneRepMax() {
		double stored[] = {295.0, 220.0, 315.0}; //Hardcoded values, will make dynamic eventually
		Calc c = new Calc(); //Object to call the calculator class
		Scanner input = new Scanner(System.in);
		String answer = null;
		System.out.println("Lets find your one rep maxes for the big 3!");
		System.out.println("Squat: " + stored[0]
						+ "\nBench: " + stored[1]
						+ "\nDeadlift: " + stored[2]);
		System.out.print("Are these your current numbers? ");
		answer = input.nextLine();
		if(answer.equalsIgnoreCase("yes") || (answer.equalsIgnoreCase("y"))) {
			double maxBigThree[] = new double[4]; //Estimated Max stats
			maxBigThree[0] = stored[0]; // squat
			maxBigThree[1] = stored[1]; // bench
			maxBigThree[2] = stored[2]; // deadlift
			maxBigThree[3] = maxBigThree[0] + maxBigThree[1] + maxBigThree[2]; // total
			return (maxBigThree);
		}else {
			String bigThree[] = {"squat", "bench", "deadlift"}; //Array to assign maxBigThree variables some names
			double maxBigThree[] = new double[4]; //Estimated Max stats
			int reps;
			double weight = 0;
			
			for(int i = 0; i<bigThree.length; i++) {
				System.out.println("Enter your weight lifted for " + bigThree[i] + ": ");
				weight = input.nextDouble();
				
				System.out.println("How many reps? ");
				reps = input.nextInt();
				
				while (reps > 12 || (reps < 1)) {
					System.out.println("Please enter a valid number (1-12)");
					reps = input.nextInt();
				}
				
				c.calc(weight, reps);
				maxBigThree[i] = Math.round(c.calc(weight, reps));
				maxBigThree[3] += maxBigThree[i]; //[3] is the total variable, and this for loop allows each variable (0-2) to add up into [3]
			}
			System.out.println("Estimated 1RM for: ");
			System.out.println("\tSquat: " + maxBigThree[0]);
			System.out.println("\tBench: " + maxBigThree[1]);
			System.out.println("\tDeadlift: " + maxBigThree[2]);
			System.out.println("Estimated PL Total: " + maxBigThree[3]);
			return (maxBigThree);
		}
	}
}
