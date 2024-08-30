package chpt06.sec09.singletone;

public class ClassA {
	public void performAction() {
		LightManager lightManager = LightManager.getInstance();
		lightManager.turnOnLight();
		String v = (lightManager.isLightOn())? "Ä×":"²¯";
		System.out.println("ClassA Á¶¸íÀ»" + v +"½À´Ï´Ù.");

	}
}
	
