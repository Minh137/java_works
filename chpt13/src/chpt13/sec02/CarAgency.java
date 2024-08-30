package chpt13.sec02;

public class CarAgency implements Rentable<Car> {
	@override
	public Car rent() {
		return new Car();
	}
}
