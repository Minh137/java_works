package scorecard.spring.di.ui;

import scorecard.spring.di.entity.Exam;

public class JAPExamConsole implements ExamConsole {

	private Exam exam;
	
	public JAPExamConsole() {}
	
	public JAPExamConsole(Exam exam) {
		this.exam = exam;
	}
	@Override
	public void setExam(Exam exam) {
		 this.exam = exam;

		
	}
	@Override
	public void print() {
		System.out.printf("あなたは総点は%d、平均は%fです", exam.total(), exam.avg()); 

	}


	

}
