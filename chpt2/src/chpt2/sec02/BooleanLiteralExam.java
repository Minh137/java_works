package chpt2.sec02;

public class BooleanLiteralExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x =20;
//		boolean result1 =(x == 20);
//		System.out.println(result1);
//		
//		boolean result2 =(x != 20);
//		System.out.println(result2);
//		
//		boolean result3 =(x > 20);
//		System.out.println(result3);
//		
//		boolean result4 =(0 < x && x < 20);
//		System.out.println(result4);
		int y = 30;
		boolean z = (y < 20);
		
		if(z) {	
			System.out.println("중지합니다.");
		}else if(y >= 30) {
			System.out.println("y의 값은 "+y+" 입니다.");
		}
	}

}
