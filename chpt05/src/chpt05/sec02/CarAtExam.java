package chpt05.sec02;

public class CarAtExam {

	public static void main(String[] args) {
		
		String ssn = "990824-1230126";
		//성별을 구하세요.
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}

		int ssnlength= ssn.length();
		if(ssnlength != 14) {
			System.out.println("주민등록 번호가 아닙니다.");
		}else {
			System.out.println("주민등록번호 입니다.");
		}
	}

}
