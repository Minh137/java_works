package chpt07.sec02;

public class SuperSonucAirplane extends Airplane{
	//상수
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//상태 필드
	public int flyMode = NORMAL;
	
	//메소드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행 합니다.");
		}else {
		super.fly();
		}
	}
}
