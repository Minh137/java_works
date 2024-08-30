package chpt07.sec01;

public class Phone {
	//필드
	public String model;
	public String color;
	
	//매개변수를 갖는 생성자 선언
	public SmartPhone(String model, String color) {
		
	}
	
	
	
	//메소드
	public void bell() {
		System.out.println("벨이 울림");
	}
	public void sendVoice(String message) {
		System.out.println("나 : "+ message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방 : "+ message);
	}
	public void handUp() {
		System.out.println("전화 끊습니다.");
	}
}
