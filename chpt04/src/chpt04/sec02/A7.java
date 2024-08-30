package chpt04.sec02;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = (true);
		int total = 0;
		
		while(run) {	
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("예금액>");
					total += sc.nextInt();
				break;
				case 2:
					System.out.print("출금액>");
					int sss= sc.nextInt();
					if((total-sss)<0) {
						System.out.println("잔고가 부족합니다.");
					}else{
						total -= sss;
					}
				break;
				case 3:
					System.out.println("잔고>"+total);
				break;
				case 4:
					System.out.println();
					System.out.println("프로그램 종료");
					run = false;
				break;
			}
		}
	}

}
