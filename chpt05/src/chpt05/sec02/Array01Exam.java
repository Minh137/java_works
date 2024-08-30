package chpt05.sec02;

public class Array01Exam {

	public static void main(String[] args) {
		
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		//배열의 항목찾기
		System.out.println("3월부터 5월은"+season[0]+"입니다.");
		System.out.println("6월부터 8월은"+season[1]+"입니다.");
		System.out.println("9월부터 11월은"+season[2]+"입니다.");
		System.out.println("12월부터 2월은"+season[3]+"입니다.");
		
		season[1] = "여름";
		System.out.println("6월부터 8월은"+season[1]+"입니다.");
		System.out.println();
		
		//철수는 국어 80점 , 수학 95점 , 영어 83점 , 컴퓨터 60점 , 역사 90점을 받았습니다.
		//철수 성적의 총점과 평균
		int sum = 0;
		int[] chul = {80,85,83,60,90};
		for(int i : chul) {
			sum += i;
		}
		System.out.println("철수는 국어 "+chul[0]+"점 , 수학 "+chul[1]+"점 , 영어 "+chul[2]+"점 , 컴퓨터 "+chul[3]+"점 , 역사 "+chul[4]+"점을 받았습니다.");
		System.out.println("총점 : "+sum);
		int avg = sum/chul.length;
		System.out.println("평균 : "+avg);
		
	}

}
