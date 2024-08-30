package chpt06.sec09;

public class LightManager {
	//조명 상태를 확인하는 필드
	private boolean isLightON;
	
	
	public void turnOnLight() {
		isLightON = true;
		System.out.println("조명을 켰습니다.");
	}
	
	public void turnOffLight() {
		isLightON = false;
		System.out.println("조명을 껐습니다.");
	}
	
	public boolean isLightOn() {
		return isLightON;
	}
}
