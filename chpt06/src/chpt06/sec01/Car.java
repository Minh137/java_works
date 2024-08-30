package chpt06.sec01;

public class Car {
	//필드
	
	
//		String company = "현대자동차";
//		String model = "현대";
//		String color = "빨강";
//		int maxSpeed = 120;
//		int speed;
	int maxSpeed= 130;
	int speed;
	String company;
	String model;
	String color;
	
	Car(){}
	Car(String company){
		this.company= company;
	}
	Car(String company, String model){
		this.company = company;
		this.model = model;
	}
	
	Car(String company, String model, String color){
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	
}
