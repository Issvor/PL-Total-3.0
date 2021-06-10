import java.io.*;
import java.util.*;

public class reading {

	private String names[];
	private double weight[];
	private int reps[];
	
	private Scanner x;
	public void openFile() {
		try {
			x = new Scanner(new File("PLNumbers.txt"));
		}
		catch(Exception e) {
			System.out.println("Could not find file!");
		}
	}
	
	public void readFile() {
		while(x.hasNext()) {
			for(int i = 0; i<names.length; i++) {
				System.out.println(names[i]);
				
				names[i] = x.next();
				weight[i] = x.nextDouble();
				reps[i] = x.nextInt();
			
				System.out.println(names[i] + " " + weight[i] + " " + reps[i]);
			}
		}
	}
	
	public void closeFile() {
		x.close();
	}
}
