package chpt2.sec07;

public class NewCasting3Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ������ ���ڿ��� �⺻Ÿ������ ��ȯ
		 * 1. byte => Byte.parseByte(������);
		 * 2. short => Short.parseShort():
		 * 3. int => Integer.parseInt();
		 * 4. long => Long.parseLong();
		 * 5. float => Float.parseFloat();
		 * 6. double => Double.parseDouble();
		 * 7. boolean => Boolean.parseBoolean();
		 * 
		 * �⺻Ÿ���� ���ڿ��� ��ȯ
		 * String.valueOf(Ÿ�԰�);
		 */
		
		String num = "100";
		String pi = "3.14";
		String bl = "true";
		
		int v1 = Integer.parseInt(num);
		double v2 = Double.parseDouble(pi);
		boolean v3 = Boolean.parseBoolean(bl);

}
