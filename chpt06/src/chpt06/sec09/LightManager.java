package chpt06.sec09;

public class LightManager {
	//���� ���¸� Ȯ���ϴ� �ʵ�
	private boolean isLightON;
	
	
	public void turnOnLight() {
		isLightON = true;
		System.out.println("������ �׽��ϴ�.");
	}
	
	public void turnOffLight() {
		isLightON = false;
		System.out.println("������ �����ϴ�.");
	}
	
	public boolean isLightOn() {
		return isLightON;
	}
}
