package chpt04.sec02;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "B";
		int score1 = switch (grade) {
	    case "A" = 100;
	    case "B" = 100 - 20;
	    default = 60;
	};
	}

}
