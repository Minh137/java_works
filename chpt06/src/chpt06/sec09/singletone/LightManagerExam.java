package chpt06.sec09.singletone;

public class LightManagerExam {

	public static void main(String[] args) {
		
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();

		
		classA.performAction();
		
		LightManager lightManager = LightManager.getInstance();
		
		String v = (lightManager.isLightOn())? "Ä×":"²¯";
		System.out.println("Á¶¸íÀ»" + v +"½À´Ï´Ù.");
		
		classB.performAction();
		
		String v2 = (lightManager.isLightOn())? "Ä×":"²¯";
		System.out.println("Á¶¸íÀ»" + v2 +"½À´Ï´Ù.");
	}

}
