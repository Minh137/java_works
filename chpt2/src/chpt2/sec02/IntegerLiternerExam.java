package chpt2.sec02;

public class IntegerLiternerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var01 = 0b1011;//���� ���� 0b,0B�� 2����
		int var02 = 0206; //���� ���� 0�̸� 8����
		int var03 = 356;
		int var04 = 0xB3;//���� ���� 0x�� �����ϸ� 16����
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		System.out.println(var04);
		
		long var05 = 10;
		long var06 = 10L;
		long var07 = 10000000000L;//longŸ�� �ν��� ���� L�� ���δ�.
		
		char var09 = 'A'; //char�� ���ڸ� ���� ����ǥ�� �ִ´�.
		char var10 = '��';
		
		System.out.println(var09+"+"+ var10 + "=" +(var09+var10));
	}

}
