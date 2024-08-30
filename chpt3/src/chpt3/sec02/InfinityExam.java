package chpt3.sec02;

public class InfinityExam {

	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0;  //infinity
		
		double rs = x / y; 
		System.out.println(rs + 3);
		
		if(Double.isFinite(rs) || Double.isNaN(rs)) {
			System.out.println("값을 산출할 수 없습니다.");
		}else{
			System.out.println(rs + 3);
		}
	}

}
