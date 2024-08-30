package chpt06.sec05;

public class CalculExam {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		double rs1 = myCalc.areaRect(14);
		
		double rs2 = myCalc.areaRect(12, 15);
		
		System.out.println(rs1);
		System.out.println(rs2);

	}

}
