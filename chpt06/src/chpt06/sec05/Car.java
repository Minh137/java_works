package chpt06.sec05;

public class Car {
	//�ʵ�
	int gas;
	//�޼ҵ� (������ ����)
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean viewGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�. -(�����ܷ� :"+gas+")");
				gas--;
			}else {
				System.out.println("����ϴ�. -(�����ܷ� :"+gas+")");
				return; //while ����
			}
		}
	}
	
	
	
}
