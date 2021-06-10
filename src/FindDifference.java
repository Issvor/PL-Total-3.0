
public class FindDifference {

	public String[] findDifference() {
		OneRepMax orm = new OneRepMax(); //Object to call for OneRepMax class
		GoalStats gs = new GoalStats(); //Object to call for GoalStats class
		double a[] = orm.oneRepMax(); //This essentially calls the oneRepMax method, which returns an array, and is then stored in the a[] array.
		double b[] = gs.goalStats(); //Same as ^^^
		double diff[] = new double[4]; //New array to give the difference from the values from OneRepMax and GoalStats (which tell you how far away you are from the goal)
		String output[] = new String[4]; //I used this to make the ReadNamesFiles easier and more organized.
		
		for(int i=0; i<diff.length;i++) { //Loops through each value of the arrays to find the difference
			diff[i] = b[i] - a[i];
		}
		
		/*
			Lots of repeated logic here, can definitely merge these altogether by assigning
			a string array with "squat, bench, dead" as the variables and loop through them
			along with the results.
		*/
		
		if(diff[0] < 0) {
			diff[0] *= -1;
			output[0] = "You passed your squat goal by " + diff[0] + " pounds!";
			System.out.println(output[0]);
		}else if(diff[0] == 0) {
			output[0] = "You hit your squat goal on the dot!";
			System.out.println(output[0]);
		}else {
			output[0] = "You're " + diff[0] + " pounds away from your squat goal.";
			System.out.println(output[0]);
		}
		
		if(diff[1] < 0) {
			diff[1] *= -1;
			output[1] = "You passed your bench goal by " + diff[1] + " pounds!";
			System.out.println(output[1]);
		}else if(diff[1] == 0) {
			output[1] = "You hit your bench goal on the dot!";
			System.out.println(output[1]);
		}else {
			output[1] = "You're " + diff[1] + " pounds away from your bench goal.";
			System.out.println(output[1]);
		}
		
		if(diff[2] < 0) {
			diff[2] *= -1;
			output[2] = "You passed your deadlift goal by " + diff[2] + " pounds!";
			System.out.println(output[2]);
		}else if(diff[2] == 0) {
			output[2] = "You hit your deadlift goal on the dot!";
			System.out.println(output[2]);
		}else {
			output[2] = "You're " + diff[2] + " pounds away from your deadlift goal.";
			System.out.println(output[2]);
		}
		
		if(diff[3] < 0) {
			diff[3] *= -1;
			output[3] = "You passed your total goal by " + diff[3] + " pounds!";
			System.out.println(output[3]);
		}else if(diff[3] == 0) {
			output[3] = "You hit your total goal on the dot!";
			System.out.println(output[3]);
		}else {
			output[3] = "You're " + diff[3] + " pounds away from your total goal.";
			System.out.println(output[3]);
		}
		return (output); //Returns output array, specifically for the ReadNamesFile class
	}
}
