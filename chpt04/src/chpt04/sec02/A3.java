package chpt04.sec02;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 0;
		for(int i =1; i<=100; i++) {
			if(i % 3 == 0) {
				A += i;
			}
		}
		System.out.println(A);
	}

}
