import java.util.Scanner;

public class GoalStats {
	public double[] goalStats() {
		Scanner input = new Scanner(System.in);
		double bodyWeight; //Body weight and Goal variables
		double goal[] = new double[4];
		System.out.print("Enter your body weight: ");
		bodyWeight = input.nextDouble();
		goal[0] = bodyWeight*2.5; //squat
		goal[1] = bodyWeight*2;   //bench
		goal[2] = bodyWeight*3;   //deadlift
		goal[3] = goal[0] + goal[1] + goal[2]; //total 
		System.out.println("-----------Goals-----------");
		System.out.println("Squat: " + goal[0]);
		System.out.println("Bench: " + goal[1]);
		System.out.println("Deadlift: " + goal[2]);
		System.out.println("Total: " + goal[3]);
		System.out.println("---------------------------");
		
		return (goal); //Returns goal array
	}
}
