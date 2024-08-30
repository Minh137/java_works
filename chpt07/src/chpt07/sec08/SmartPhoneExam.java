package chpt07.sec08;

public class SmartPhoneExam {

	public static void main(String[] args) {
		
		//Phone phone = new Phone("홍길동");
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();	//Phone 메소드
		smartPhone.internetSearch(); 	//자기자신 메소드
		smartPhone.trenOff();	//Phone 메소드
		
	}

}
