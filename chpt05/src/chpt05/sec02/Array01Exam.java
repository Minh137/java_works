package chpt05.sec02;

public class Array01Exam {

	public static void main(String[] args) {
		
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		//�迭�� �׸�ã��
		System.out.println("3������ 5����"+season[0]+"�Դϴ�.");
		System.out.println("6������ 8����"+season[1]+"�Դϴ�.");
		System.out.println("9������ 11����"+season[2]+"�Դϴ�.");
		System.out.println("12������ 2����"+season[3]+"�Դϴ�.");
		
		season[1] = "����";
		System.out.println("6������ 8����"+season[1]+"�Դϴ�.");
		System.out.println();
		
		//ö���� ���� 80�� , ���� 95�� , ���� 83�� , ��ǻ�� 60�� , ���� 90���� �޾ҽ��ϴ�.
		//ö�� ������ ������ ���
		int sum = 0;
		int[] chul = {80,85,83,60,90};
		for(int i : chul) {
			sum += i;
		}
		System.out.println("ö���� ���� "+chul[0]+"�� , ���� "+chul[1]+"�� , ���� "+chul[2]+"�� , ��ǻ�� "+chul[3]+"�� , ���� "+chul[4]+"���� �޾ҽ��ϴ�.");
		System.out.println("���� : "+sum);
		int avg = sum/chul.length;
		System.out.println("��� : "+avg);
		
	}

}
