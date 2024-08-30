package chpt13.sec02;

public class HomeAgency implements Rentable<House> {
	@override
	public House rent() {
		return new House();
	}
	
}
