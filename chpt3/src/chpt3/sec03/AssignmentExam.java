package chpt3.sec03;

public class AssignmentExam {

	public static void main(String[] args) {
		
		int rs = 0;
		rs += 10;
		System.out.println(rs);
		
		rs -= 5;
		System.out.println(rs);
		
		rs *= 3;
		System.out.println(rs);

		rs /= 5;
		System.out.println(rs);
	
		rs %= 3;
		System.out.println(rs);
		
		//3항 연산
		int yourScore = 86;
		char grade = (yourScore > 90)? 'A': ((yourScore > 80)? 'B' : 'C');
		System.out.println(yourScore + "점은" + grade + "동급입니다.");
	}

}
