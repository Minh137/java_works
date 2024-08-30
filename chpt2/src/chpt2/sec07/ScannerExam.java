package chpt2.sec07;

import java.util.Scanner;

public class ScannerExam {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x값을 입력하세요. >>");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		System.out.println("y값을 입력하세요. >>");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println(x + "+" + y + "=" + result +"입니다.");
		System.out.printf("%d + %d 의 결과는 %d 입니다.",x,y,result);
		
		while(true) {
			System.out.println();
			String data = sc.nextLine();
			if()
		}
//		
//		System.out.println(str);
		
		
	}
}
