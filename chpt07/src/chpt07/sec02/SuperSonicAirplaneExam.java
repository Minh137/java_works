package chpt07.sec02;

public class SuperSonicAirplaneExam {

	public static void main(String[] args) {
		
		SuperSonucAirplane sa = new SuperSonucAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperSonucAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperSonucAirplane.NORMAL;
		sa.fly();
		sa.land();
		
	}

}
