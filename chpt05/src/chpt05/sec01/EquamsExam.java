package chpt05.sec01;

public class EquamsExam {

	public static void main(String[] args) {
			
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		if(str1 == str2) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다");
		}
		
		
		String str3 = new String("홍길동");
		if(str3 == str2) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다");
		}
		
		
		//문자열의 같고 다름을 조사할 떄는 equals() 이용
		if(str3.equals(str2)) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다");
		}
	}

}
