package chpt05.sec02;

public class SearchStrExam {

	public static void main(String[] args) {
		
		String Sear = "�ڹ� ���α׷���";
		int index = Sear.indexOf("�ڹ�");
		if(index==-1) {
			System.out.println("�ڹٿ� ���þ��� å�Դϴ�");
		}else {
			System.out.println("�ڹٿ� ���õ� ���� �Դϴ�");
		}
		
		Boolean bl = Sear.contains("���α׷���");
		if(bl == false) {
			System.out.println("�ڹٿ� ���þ��� å�Դϴ�");
		}else {
			System.out.println("�ڹٿ� ���õ� ���� �Դϴ�");
		}

	}

}
