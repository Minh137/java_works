package chpt06.sec07;

public class KoreanExam {

	public static void main(String[] args) {
		//��ü ������ �����ڿ� �ֹι�ȣ�� �̸��� ����, �ֹι�ȣ�� �ٽ� ���� �Ұ���
		Korean k1 = new Korean("123456-1234567", "ȫ�浿");
		
		//�ʵ尪 �б�
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//�ʵ尪 ����
		//k1.nation = "�̱�";
		k1.name = "ȫ���";

	}

}
