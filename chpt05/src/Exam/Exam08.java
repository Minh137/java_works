package Exam;

public class Exam08 {

	public static void main(String[] args) {
		int[][] array = {
				{ 95, 56 },
				{ 83, 82, 96 },
				{ 78, 83, 93, 87, 88 }
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int l = 0; l <array.length; l++) {
			for(int m = 0; m < array[l].length; m++) {
				sum += array[l][m];
				count++;
			}
		}
		
		avg = (double)sum / count;
		
		System.out.println("ÇÕÀº : "+ sum);
		System.out.println("Æò±ÕÀº : "+ avg);
	}

}
