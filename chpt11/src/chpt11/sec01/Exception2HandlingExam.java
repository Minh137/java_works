package chpt11.sec01;

public class Exception2HandlingExam {
	
	
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.exception�� ���� �մϴ�.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
