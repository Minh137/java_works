package chpt07.sec01;

public class PhoneExam {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("������", "�ǹ�");
		
		//Phone���� ��ӹ��� �ʵ�
		System.out.println("�� : " + myPhone.model);
		System.out.println("���� : " + myPhone.color);

		//SmartPhone �ʵ�
		System.out.println("�������� ����"+ myPhone.wifi);
		
		//
		myPhone.bell();
		myPhone.sendVoice("��������?");
		myPhone.receiveVoice("����, ���� ����Ʈ ��ǰ�� ���ͼ� ���� ��Ⱦ��.");
		myPhone.sendVoice("���� ��ϴ�");
		myPhone.handUp();
		
		
		myPhone.setWifi(true);
		myPhone.internet();
		System.out.println("����Ʈ ��ǰ�� �˻� �մϴ�.");
		
 }

}
