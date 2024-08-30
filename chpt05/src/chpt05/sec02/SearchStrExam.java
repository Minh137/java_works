package chpt05.sec02;

public class SearchStrExam {

	public static void main(String[] args) {
		
		String Sear = "자바 프로그래밍";
		int index = Sear.indexOf("자바");
		if(index==-1) {
			System.out.println("자바와 관련없는 책입니다");
		}else {
			System.out.println("자바와 관련된 도서 입니다");
		}
		
		Boolean bl = Sear.contains("프로그래밍");
		if(bl == false) {
			System.out.println("자바와 관련없는 책입니다");
		}else {
			System.out.println("자바와 관련된 도서 입니다");
		}

	}

}
