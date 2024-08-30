package chpt06.sec03;

public class ComputerExam {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		int sum1 = myCom.sum(1,2,3);
		int sum2 = myCom.sum(1,2,3,4,5);
		System.out.println(sum1);
		System.out.println(sum2);
		
		int[] val = {1,2,3,4,5,6,7};
		int sum3 = myCom.sum(val);
		System.out.println(sum3);
		
		
	}

}
