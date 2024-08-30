package chpt04.sec02;

import java.util.Random;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random RD = new Random();
		int A;
		int B;
		
		do {
			A= RD.nextInt(6)+1;
			B= RD.nextInt(6)+1;
			System.out.println("A = "+A+", B = " +B );
			}while(A + B !=5);
		}
	}


