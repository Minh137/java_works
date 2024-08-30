package chpt06.sec05;

public class Car {
	//필드
	int gas;
	//메소드 (개스를 세팅)
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean viewGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. -(가스잔량 :"+gas+")");
				gas--;
			}else {
				System.out.println("멈춥니다. -(가스잔량 :"+gas+")");
				return; //while 종료
			}
		}
	}
	
	
	
}
