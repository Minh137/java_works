package chpt05.sec01;

public class ReferVerExam {

	public static void main(String[] args) {
		
		int[] arr1; //배열변수 선언
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1 ,2 ,3}; //배열 {1,2,3}을 만들어서 변수 arr1에 대입했다.
		arr2 = new int[] {1 ,2 ,3}; //배열 {1,2,3}을 만들어서 변수 arr2에 대입했다.
		arr3 = arr2;
		
		System.out.println( arr1 == arr2 );
		System.out.println( arr3 == arr2 );
	}

}
