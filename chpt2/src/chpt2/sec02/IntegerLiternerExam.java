package chpt2.sec02;

public class IntegerLiternerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var01 = 0b1011;//제일 앞이 0b,0B는 2진수
		int var02 = 0206; //제일 앞이 0이면 8진수
		int var03 = 356;
		int var04 = 0xB3;//제일 앞이 0x로 시작하면 16진수
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		System.out.println(var04);
		
		long var05 = 10;
		long var06 = 10L;
		long var07 = 10000000000L;//long타입 인식을 위해 L을 붙인다.
		
		char var09 = 'A'; //char은 문자를 작은 따옴표에 넣는다.
		char var10 = '가';
		
		System.out.println(var09+"+"+ var10 + "=" +(var09+var10));
	}

}
