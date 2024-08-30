package chpt07.sec01;

public class SmartPhone extends Phone{
	//필드선언
	public boolean wifi;
	
	//생성자선언
	public SmartPhone(String model, String color) {
		super(model, color);
		//부모인 phone으로 부터 상속받은 필드를 초기화
		System.out.println("SmartPhone에서 초기화를 담당하고  super에 매개변수를 전달");
	}
	
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
