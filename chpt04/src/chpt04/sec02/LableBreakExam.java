package chpt04.sec02;

public class LableBreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
					System.out.println(upper + "-" + lower);
					if(lower == 'g') {
						break Outter;
					}
			}
		}
	}

}
