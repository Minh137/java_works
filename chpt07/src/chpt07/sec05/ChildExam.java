package chpt07.sec05;

public class ChildExam {

	public static void main(String[] args) {
		
		//�ڽİ�ü ����
		Child child = new Child();
		
		child.method1();  //�θ�޼ҵ� 1
		child.method2();  //�ڽĸ޼ҵ� 2
		child.method3();  //�ڽĸ޼ҵ� 3
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		//parent.method3(); //�θ� ������ ���� �ʾ� ȣ�� �Ұ���

	}

}
