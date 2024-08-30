package chpt06.sec05;

public class CarExam {

	public static void main(String[] args) {
		
		//Car를 객체로 생성
		Car myCar = new Car();
		myCar.setGas(10);
		if(myCar.viewGas()) {
			System.out.println("출발합니다.");
			
			//run()메소드 호출
			myCar.run();
			
		}
		System.out.println("gas를 주유해 주세요.");

	}

}
