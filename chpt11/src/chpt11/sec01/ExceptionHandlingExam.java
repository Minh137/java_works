package chpt11.sec01;

public class ExceptionHandlingExam {

	public static void printLength(String data) {
		try {
		int result = data.length();
		System.out.println("문자 수 : " + result);
		}catch(NullPointerException e){
			System.out.println("에러발생");
			System.out.println(e.getMessage());
//			e.toString();
//			e.printStackTrace();
		}finally {
			System.out.println("무조건 실행");
		}
	}
	public static void main(String[] args) {
		System.out.println("프로그램 발생");
		System.out.println("Java Is Funny");
		System.out.println("프로그램 종료");
	}

}
