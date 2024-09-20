package scorecard.spring.di.entity;

public class ScoreCardExam implements Exam {
	
	private int kor;
	private int eng;
	private int hist;
	private int math;
	private int comp;
	
	public ScoreCardExam(int kor, int eng, int hist, int math, int comp) {
		this.kor = kor;
		this.eng = eng;
		this.hist = hist;
		this.math = math;
		this.comp = comp;
	}
	

	@Override
	public int total() {
		return kor + eng + hist + math + comp;
	}

	@Override
	public float avg() {
		return total() / 5.0f;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getHist() {
		return hist;
	}


	public void setHist(int hist) {
		this.hist = hist;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getComp() {
		return comp;
	}


	public void setComp(int comp) {
		this.comp = comp;
	}

}
