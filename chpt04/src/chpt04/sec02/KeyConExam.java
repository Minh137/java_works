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
			System.out.println("1. ���� | 2. ���� | 3. ����");
			System.out.println("-------------------------");
			System.out.print("���� >>>");
			
			String strNum = sc.nextLine();
			if(strNum.equals("1")) {
				speed++;
				System.out.println("����ӵ� = "+speed);
			}else if(strNum.equals("2")){
				speed--;
				System.out.println("����ӵ� = "+speed);
			}else if(strNum.equals("3")){
				run = false;
			}else {
				System.out.println("�߸��߾��, �ٽ� �����ϼ���");
			}
		}
	}

}
