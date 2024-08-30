package chpt05.sec02;

public class ReplaceExam {

	public static void main(String[] args) {
		
		String str ="자바 문자열은 변하지 않아요. 왜냐하면 자바문자열은 String이니까요.";
		String newStr = str.replace("자바", "JAVA");
		
		System.out.println(str);
		System.out.println(newStr);
		
		String ssn = "990824-1230126";
		String bith = ssn.substring(0,6);
		System.out.println(bith);
		String year = ssn.substring(0,2);
		int intY = Integer.parseInt(year);
		if(0<=intY && 25>intY) {
			System.out.println("20"+year+"년");
		}else {
			System.out.println("19"+year+"년");
		}
		String month = ssn.substring(2,4);
		System.out.println(month+"월");
		String days = ssn.substring(4,6);
		System.out.println(days+"일");
		
		
		int index = str.indexOf("String");
		if(index == -1) {
			System.out.println("찾은 문자열이 없어요.");
		}else {
			System.out.println("찾은 문자열은 "+index+"위치에서 시작됩니다.");
		}
		
		
		
	}

}
