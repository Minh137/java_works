package chpt05.sec01;

public class ReferVerExam {

	public static void main(String[] args) {
		
		int[] arr1; //�迭���� ����
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1 ,2 ,3}; //�迭 {1,2,3}�� ���� ���� arr1�� �����ߴ�.
		arr2 = new int[] {1 ,2 ,3}; //�迭 {1,2,3}�� ���� ���� arr2�� �����ߴ�.
		arr3 = arr2;
		
		System.out.println( arr1 == arr2 );
		System.out.println( arr3 == arr2 );
	}

}
