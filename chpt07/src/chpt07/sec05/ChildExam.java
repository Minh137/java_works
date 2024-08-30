package chpt07.sec05;

public class ChildExam {

	public static void main(String[] args) {
		
		//자식객체 생성
		Child child = new Child();
		
		child.method1();  //부모메소드 1
		child.method2();  //자식메소드 2
		child.method3();  //자식메소드 3
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		//parent.method3(); //부모가 가지고 있지 않아 호출 불가능

	}

}
