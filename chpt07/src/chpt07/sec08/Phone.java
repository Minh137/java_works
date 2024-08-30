package chpt07.sec08;

public abstract class Phone {

	//필드 선언
	String owner;
	
	//생성자
	Phone(String owner){
		this.owner = owner;
	}
	
	//메서드
	void turnOn() {
		System.out.println("폰 전원을 켠다");
	}
	void trenOff() {
		System.out.println("폰 전원을 끈다");
	}
	
}
