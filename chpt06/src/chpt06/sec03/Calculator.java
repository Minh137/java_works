package chpt06.sec03;

public class Calculator {
	void powerOn(){
		System.out.println("������ ��ϴ�.");
	}
	void powerOff(){
		System.out.println("������ ���ϴ�.");
	}
	//plus ȣ���ϸ� �� �������� �޾Ƽ� ���ϱ�
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}	
	//divide ȣ���ϸ�
	double divide(int x, int y) {
	double result = (double)x / y;
	return result;
	}
}
	

 