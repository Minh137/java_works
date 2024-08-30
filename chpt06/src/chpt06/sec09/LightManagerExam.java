package chpt06.sec09;

public class LightManagerExam {

	public static void main(String[] args) {
			
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		LightManager lightManager = new LightManager();
		
		//ClassA를 실행해서 조명을 킴
		classA.performAction();
		
		String v = (lightManager.isLightOn())? "켰":"껏";
		System.out.println("조명을" + v +"습니다.");
		
		classB.performAction();
		
		String v2 = (lightManager.isLightOn())? "켰":"껏";
		System.out.println("조명을" + v2 +"습니다.");
		
	}
	

}
