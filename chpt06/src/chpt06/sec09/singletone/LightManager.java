package chpt06.sec09.singletone;

public class LightManager {
	//변수를 유일하게 선언 private static
	private static LightManager instance;
	
	//조명상태 저장 변수
	private boolean isLightOn;
	
	//
	private LightManager() {
		this.isLightOn = false;
		
	}
	
	public static synchronized LightManager getInstance() {
		if(instance == null) {
			instance = new LightManager();
		}
		return instance;
	}
	
	public void turnOnLight() {
		isLightOn = true;
		System.out.println("조명을 켰습니다.");
	}
	
	public void turnOffLight() {
		isLightOn = false;
		System.out.println("조명을 껐습니다.");
	}
	
	public boolean isLightOn() {
		return isLightOn;
	}
	
}
