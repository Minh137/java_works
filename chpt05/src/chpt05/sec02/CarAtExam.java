package chpt05.sec02;

public class CarAtExam {

	public static void main(String[] args) {
		
		String ssn = "990824-1230126";
		//������ ���ϼ���.
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("���� �Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("���� �Դϴ�.");
			break;
		}

		int ssnlength= ssn.length();
		if(ssnlength != 14) {
			System.out.println("�ֹε�� ��ȣ�� �ƴմϴ�.");
		}else {
			System.out.println("�ֹε�Ϲ�ȣ �Դϴ�.");
		}
	}

}
