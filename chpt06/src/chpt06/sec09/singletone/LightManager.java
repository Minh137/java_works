package chpt06.sec09.singletone;

public class LightManager {
	//������ �����ϰ� ���� private static
	private static LightManager instance;
	
	//������� ���� ����
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
		System.out.println("������ �׽��ϴ�.");
	}
	
	public void turnOffLight() {
		isLightOn = false;
		System.out.println("������ �����ϴ�.");
	}
	
	public boolean isLightOn() {
		return isLightOn;
	}
	
}
