package chpt05.sec02;

public class MultiArrayExam {

	public static void main(String[] args) {
		
		//각 반의 학생수가 3명으로 동일하게 2차원 배열 만듬
		int[][] mathScores = new int [2][3];

		mathScores[0][0] = 80;
		mathScores[0][1] = 85;
		mathScores[0][2] = 81;
		
		mathScores[1][0] = 83;
		mathScores[1][1] = 80;
		mathScores[1][2] = 67;
		
		for(int m=0; m < mathScores.length; m++) {
			for(int n = 0; n < mathScores[m].length; n++) {
				System.out.println(m+"번째 반의"+n+"번쨰 학생 점수"+ mathScores[m][n]+"학생");
			}
		}
		
		int totals =0;
		int totalj =0;
		
		for(int i=0; i< mathScores.length; i++) {
			totals += mathScores[i].length;
			for(int j=0; j< mathScores[i].length; j++) {
				totalj += mathScores[i][j];
			}
		}
		System.out.println("전체 학생 수 : "+ totals);
		System.out.println("총점 : "+ totalj);
		
		double totalAvg = (double) totalj/totals;
		System.out.println("전체 평균 : "+ totalAvg);
		
		
		int totals0 =0;
		int totalj0 =0;
		
		for(int i=0; i< mathScores.length; i++) {
			totals0 += mathScores[0][i].length;
			for(int j=0; j< mathScores[0][i].length; j++) {
				totalj0 += mathScores[0][j];
			}
		}
		System.out.println("전체 학생 수 : "+ totals);
		System.out.println("총점 : "+ totalj);
		
		double totalAvg = (double) totalj/totals;
		System.out.println("전체 평균 : "+ totalAvg);
	}

}
