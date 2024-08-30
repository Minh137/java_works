package chpt06.sec03;

public class CalculaterExam {

	public static void main(String[] args) {
		
		 Calculator myCalc = new Calculator();
		 
		 myCalc.powerOn();
		 
		 int sum = myCalc.plus(5, 8);
	        System.out.println("5 + 8 = " + sum);
	        
	     int x = 11;
	     int y = 4;
	     double rs2 = myCalc.divide(x, y);
	     System.out.println("x / y ="+ rs2);

	     myCalc.powerOff();
	}

}
