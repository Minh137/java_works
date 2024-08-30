package Exam;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		
		boolean run = true;
		int[] scores = null;
		int studentNum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택>>");
			
			int student = Integer.parseInt(sc.nextLine());
			
			switch(student) {
			case 1:
				System.out.print("학생수 입력 >> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
			break;
			case 2:
				for(int i=0; i < scores.length; i++) {
					System.out.print((i+1)+"번 학생 점수");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				break;
			case 3:
				for(int i=0; i < scores.length; i++) {
					System.out.print((i+1)+"번 학생 점수 : " + scores[i]);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				double avg =0;
				for(int i=0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i]: max;
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				
				
				break;
			case 5:
				default;
				run=false;
			

			}
			
			
			
		}

	}

}
