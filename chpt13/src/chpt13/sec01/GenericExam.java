package chpt13.sec01;

public class GenericExam {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<String>();
		box1.content = "제네릭입니다.";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 1000;
		int num = box2.content;
		System.out.println(num);

	}

}
