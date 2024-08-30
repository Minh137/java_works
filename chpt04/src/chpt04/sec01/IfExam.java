package chpt04.sec01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		System.out.print("당신의 점수를 입력하세요. >>");
		
		if(score >= 90) {
			System.out.println("A등급 입니다.");
		}else if(score >= 8) {
			System.out.println("B등급 입니다.");
		}else if(score >= 70) {
			System.out.println("C등급 입니다.");
		}else if(score >= 60) {
			System.out.println("D등급 입니다.");
		}else{
			System.out.println("낙제입니다.");
			
			scanner.close();
		}
		

	}
}