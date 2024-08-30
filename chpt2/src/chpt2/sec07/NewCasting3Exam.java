package chpt2.sec07;

public class NewCasting3Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 숫자형 문자열을 기본타입으로 변환
		 * 1. byte => Byte.parseByte(변수명);
		 * 2. short => Short.parseShort():
		 * 3. int => Integer.parseInt();
		 * 4. long => Long.parseLong();
		 * 5. float => Float.parseFloat();
		 * 6. double => Double.parseDouble();
		 * 7. boolean => Boolean.parseBoolean();
		 * 
		 * 기본타입을 문자열로 변환
		 * String.valueOf(타입값);
		 */
		
		String num = "100";
		String pi = "3.14";
		String bl = "true";
		
		int v1 = Integer.parseInt(num);
		double v2 = Double.parseDouble(pi);
		boolean v3 = Boolean.parseBoolean(bl);

}
