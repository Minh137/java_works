package chpt04.sec02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료 하려면 q를 입력 하세요.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
			
		}while( ! inputString.equals("q"));
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
