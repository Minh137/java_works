package coffee;

import java.util.Scanner;

public class Coffee_Machine {

	public static void main(String[] args) {

		final int price = 300;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("커피 자판기에 금액을 넣으세요.");
		int insertMoney = scanner.nextInt();
		
		if(insertMoney >= price) {
			int coffees = insertMoney / price;
			int remainMoney = insertMoney % price;
			
            System.out.println("커피 " + coffees + "잔을 제공합니다.");
            System.out.println("남은 잔액은 " + remainMoney + "원입니다.");
			}else {
			System.out.println("금액이 부족합니다.");
		}
		scanner.close();
	}
}
