package chpt06.sec01;

public class CarExam {

	public static void main(String[] args) {
		
		//Car 클래스를 이용해 객체를 생성
		Car myCar = new Car("현대","제네시스","흰색");
		
		//Car 객체의 필드값
		System.out.println("회사 : "+ myCar.company);
		System.out.println("모델명 : "+ myCar.model);
		System.out.println("색상 : "+ myCar.color);
		System.out.println("최고속도 : "+ myCar.maxSpeed);
		System.out.println("현재속도 : "+ myCar.speed);
		
		myCar.speed = 50;
		System.out.println("수정된 속도 : "+ myCar.speed);
	}

}
