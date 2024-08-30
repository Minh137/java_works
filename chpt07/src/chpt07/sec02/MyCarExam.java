package chpt07.sec02;

public class MyCarExam {

	public static void main(String[] args) {
		
		Car superCar = new SuperCar();
		Car thumpTruck = new ThumpTruck();
		Car autoBycle = new AutoBycle();
		
		System.out.println(superCar.cracktion());
		System.out.println(thumpTruck.cracktion());
		System.out.println(autoBycle.cracktion());
	}

}
