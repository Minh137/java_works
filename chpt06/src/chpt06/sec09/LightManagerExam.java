package chpt06.sec09;

public class LightManagerExam {

	public static void main(String[] args) {
			
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		LightManager lightManager = new LightManager();
		
		//ClassA�� �����ؼ� ������ Ŵ
		classA.performAction();
		
		String v = (lightManager.isLightOn())? "��":"��";
		System.out.println("������" + v +"���ϴ�.");
		
		classB.performAction();
		
		String v2 = (lightManager.isLightOn())? "��":"��";
		System.out.println("������" + v2 +"���ϴ�.");
		
	}
	

}
