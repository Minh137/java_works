package chpt06.sec02;

public class CarExam {
	public static void main(String[] args) {
		
		Car car1 = new Car("�ڰ���");
		System.out.println("car1.company :"+ car1.company);
		System.out.println("car1.model :"+ car1.model);
		System.out.println();
		
		Car car2 = new Car("�ڰ���", "����");
		System.out.println("car2.company :"+ car2.company);
		System.out.println("car2.model :"+ car2.model);
		System.out.println("car2.coler :"+ car2.color);
		System.out.println();
		
		Car car3 = new Car( "�ý�", "����", 200);
		System.out.println("car3.company :"+ car3.company);
		System.out.println("car3.model :"+ car3.model);
		System.out.println("car3.coler :"+ car3.color);
		System.out.println("car3 maxSpeed :"+ car3.maxSpeed);
		System.out.println();
		
		
	}

}