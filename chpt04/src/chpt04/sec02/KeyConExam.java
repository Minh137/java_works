package chpt04.sec02;

import java.util.Scanner;

public class KeyConExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1. 가속 | 2. 감속 | 3. 중지");
			System.out.println("-------------------------");
			System.out.print("선택 >>>");
			
			String strNum = sc.nextLine();
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재속도 = "+speed);
			}else if(strNum.equals("2")){
				speed--;
				System.out.println("현재속도 = "+speed);
			}else if(strNum.equals("3")){
				run = false;
			}else {
				System.out.println("잘못했어요, 다시 선택하세요");
			}
		}
	}

}
