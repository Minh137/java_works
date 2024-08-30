package chpt13.sec02;

public class GenericTExam {
	
	//제네릭 메소드
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}

	public static void main(String[] args) {
		
		//제네릭 메소드 호출
		Box<Integer> box1 = boxing(100);
		int intVal = box1.getT();
		System.out.println(intVal);
		
		Box<String> box2 = boxing("김철수");
		String strVal = box2.getT();
		System.out.println(strVal);

	}

}
