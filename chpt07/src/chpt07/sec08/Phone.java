package chpt07.sec08;

public abstract class Phone {

	//�ʵ� ����
	String owner;
	
	//������
	Phone(String owner){
		this.owner = owner;
	}
	
	//�޼���
	void turnOn() {
		System.out.println("�� ������ �Ҵ�");
	}
	void trenOff() {
		System.out.println("�� ������ ����");
	}
	
}
