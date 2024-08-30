package chpt2.sec07;

public class NewCastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long rs3 = v3 + v4 + v5;
		System.out.println(rs3);
		
		char v6 = 'A';
		char v7 = 1;
		int rs4 = v6 + v7;
		System.out.println(rs4);
		System.out.println((char) rs4);
		
		int v8 = 10;
		int rs5 = v8 / 4;
		double rs6 = (double) v8 / 4;  //정수 연산의 결과는 정수 -> 실수연산으로 타입변환
		System.out.println(rs5);
		System.out.println(rs6);
	}

}
