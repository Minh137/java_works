package chpt06.sec05;

public class CarExam {

	public static void main(String[] args) {
		
		//Car�� ��ü�� ����
		Car myCar = new Car();
		myCar.setGas(10);
		if(myCar.viewGas()) {
			System.out.println("����մϴ�.");
			
			//run()�޼ҵ� ȣ��
			myCar.run();
			
		}
		System.out.println("gas�� ������ �ּ���.");

	}

}
