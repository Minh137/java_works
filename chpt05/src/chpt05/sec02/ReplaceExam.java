package chpt05.sec02;

public class ReplaceExam {

	public static void main(String[] args) {
		
		String str ="�ڹ� ���ڿ��� ������ �ʾƿ�. �ֳ��ϸ� �ڹٹ��ڿ��� String�̴ϱ��.";
		String newStr = str.replace("�ڹ�", "JAVA");
		
		System.out.println(str);
		System.out.println(newStr);
		
		String ssn = "990824-1230126";
		String bith = ssn.substring(0,6);
		System.out.println(bith);
		String year = ssn.substring(0,2);
		int intY = Integer.parseInt(year);
		if(0<=intY && 25>intY) {
			System.out.println("20"+year+"��");
		}else {
			System.out.println("19"+year+"��");
		}
		String month = ssn.substring(2,4);
		System.out.println(month+"��");
		String days = ssn.substring(4,6);
		System.out.println(days+"��");
		
		
		int index = str.indexOf("String");
		if(index == -1) {
			System.out.println("ã�� ���ڿ��� �����.");
		}else {
			System.out.println("ã�� ���ڿ��� "+index+"��ġ���� ���۵˴ϴ�.");
		}
		
		
		
	}

}
