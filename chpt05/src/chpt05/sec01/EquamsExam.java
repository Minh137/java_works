package chpt05.sec01;

public class EquamsExam {

	public static void main(String[] args) {
			
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		
		if(str1 == str2) {
			System.out.println("�����ϴ�");
		}else {
			System.out.println("�ٸ��ϴ�");
		}
		
		
		String str3 = new String("ȫ�浿");
		if(str3 == str2) {
			System.out.println("�����ϴ�");
		}else {
			System.out.println("�ٸ��ϴ�");
		}
		
		
		//���ڿ��� ���� �ٸ��� ������ ���� equals() �̿�
		if(str3.equals(str2)) {
			System.out.println("�����ϴ�");
		}else {
			System.out.println("�ٸ��ϴ�");
		}
	}

}
