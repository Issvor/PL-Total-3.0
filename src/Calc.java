
public class Calc {
	public double calc(double weight, int reps) {
		double max = 0;
		
		switch(reps) {
			case 1:
				max = weight;
				break;
			case 2:
				max = weight/.95;
				break;
			case 3:
				max = weight/.93;
				break;
			case 4:
				max = weight/.90;
				break;
			case 5:
				max = weight/.87;
				break;
			case 6:
				max = weight/.85;
				break;
			case 7:
				max = weight/.83;
				break;
			case 8:
				max = weight/.80;
				break;
			case 9:
				max = weight/.77;
				break;
			case 10:
				max = weight/.75;
				break;
			case 11:
				max = weight/.73;
				break;
			case 12:
				max = weight/.70;
				break;
		}
		return max;
	}
}
