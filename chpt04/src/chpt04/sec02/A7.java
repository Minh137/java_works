package chpt04.sec02;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = (true);
		int total = 0;
		
		while(run) {	
			System.out.println("--------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------------");
			System.out.print("����>");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("���ݾ�>");
					total += sc.nextInt();
				break;
				case 2:
					System.out.print("��ݾ�>");
					int sss= sc.nextInt();
					if((total-sss)<0) {
						System.out.println("�ܰ� �����մϴ�.");
					}else{
						total -= sss;
					}
				break;
				case 3:
					System.out.println("�ܰ�>"+total);
				break;
				case 4:
					System.out.println();
					System.out.println("���α׷� ����");
					run = false;
				break;
			}
		}
	}

}
