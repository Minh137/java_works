package chpt11.sec01;

public class ExceptionHandlingExam {

	public static void printLength(String data) {
		try {
		int result = data.length();
		System.out.println("���� �� : " + result);
		}catch(NullPointerException e){
			System.out.println("�����߻�");
			System.out.println(e.getMessage());
//			e.toString();
//			e.printStackTrace();
		}finally {
			System.out.println("������ ����");
		}
	}
	public static void main(String[] args) {
		System.out.println("���α׷� �߻�");
		System.out.println("Java Is Funny");
		System.out.println("���α׷� ����");
	}

}
