package chpt06.sec09.singletone;

public class ClassA {
	public void performAction() {
		LightManager lightManager = LightManager.getInstance();
		lightManager.turnOnLight();
		String v = (lightManager.isLightOn())? "��":"��";
		System.out.println("ClassA ������" + v +"���ϴ�.");

	}
}
	