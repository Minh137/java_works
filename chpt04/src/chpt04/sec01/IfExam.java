package chpt04.sec01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		System.out.print("����� ������ �Է��ϼ���. >>");
		
		if(score >= 90) {
			System.out.println("A��� �Դϴ�.");
		}else if(score >= 8) {
			System.out.println("B��� �Դϴ�.");
		}else if(score >= 70) {
			System.out.println("C��� �Դϴ�.");
		}else if(score >= 60) {
			System.out.println("D��� �Դϴ�.");
		}else{
			System.out.println("�����Դϴ�.");
			
			scanner.close();
		}
		

	}
}