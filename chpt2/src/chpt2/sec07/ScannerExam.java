package chpt2.sec07;

import java.util.Scanner;

public class ScannerExam {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x���� �Է��ϼ���. >>");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		System.out.println("y���� �Է��ϼ���. >>");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println(x + "+" + y + "=" + result +"�Դϴ�.");
		System.out.printf("%d + %d �� ����� %d �Դϴ�.",x,y,result);
		
		while(true) {
			System.out.println();
			String data = sc.nextLine();
			if()
		}
//		
//		System.out.println(str);
		
		
	}
}
