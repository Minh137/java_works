package chpt2.sec01;

public class VExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 5;
		System.out.println("x : "+ x + ", y : " + y);
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x : "+ x + ", y : " + y);
	}

}
