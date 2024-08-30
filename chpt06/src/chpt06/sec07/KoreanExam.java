package chpt06.sec07;

public class KoreanExam {

	public static void main(String[] args) {
		//객체 생성시 생성자에 주민번호와 이름을 주입, 주민번호는 다시 수정 불가능
		Korean k1 = new Korean("123456-1234567", "홍길동");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//필드값 변경
		//k1.nation = "미국";
		k1.name = "홍길순";

	}

}
