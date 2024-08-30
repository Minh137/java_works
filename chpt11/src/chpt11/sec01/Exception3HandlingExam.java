package chpt11.sec01;

public class Exception3HandlingExam {

	public static void main(String[] args) {
		String[] array = {"100", "Ioo"};
		
		for(int i = 0; i<=array.length;i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("arrat["+i+"] :" + value);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스가 초가됨 " + e.getMessage());
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음" + e.getMessage());
			}
//			catch(Exception e){
//				System.out.println("에러자나"+ e.getMessage());
//				}
		}

	}

}
