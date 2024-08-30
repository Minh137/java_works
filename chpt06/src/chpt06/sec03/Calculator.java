package chpt06.sec03;

public class Calculator {
	void powerOn(){
		System.out.println("전원을 겹니다.");
	}
	void powerOff(){
		System.out.println("전원을 끕니다.");
	}
	//plus 호출하면 두 정수값을 받아서 더하기
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}	
	//divide 호출하면
	double divide(int x, int y) {
	double result = (double)x / y;
	return result;
	}
}
	

 