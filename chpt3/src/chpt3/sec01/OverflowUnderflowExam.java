package chpt3.sec01;

public class OverflowUnderflowExam {

	public static void main(String[] args) {
		
		byte var1 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			if(var1 == 127) {
				System.out.println("�����÷ο� �߻�");
			}
			System.out.println("var1 : "+ var1);
		}
System.out.println("--------------------");
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--;
			if(var2 == -128) {
				System.out.println("����÷ο� �߻�");
			}
			System.out.println("var2 : "+ var2);
		}
	
	}
	
	}
	
	


