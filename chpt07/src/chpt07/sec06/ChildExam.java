package chpt07.sec06;

public class ChildExam {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		//parent Ÿ������ �ʵ� �޼��� ���
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		�ڽĿ��� �ִ� �ʵ�� �޼���� ���Ұ�
//		parent.field2 = "data2";
//		parent.method3();
//		
		Child child = (Child) parent;
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		parent.field2 = "data2";
		parent.method3();
	}

}
