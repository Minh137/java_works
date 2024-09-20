package scorecard.spring.di.ui;

import scorecard.spring.di.entity.Exam;

public class ENGExamConsole implements ExamConsole {

	private Exam exam;
	
	public ENGExamConsole() {}

	public ENGExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void setExam(Exam exam) {
		 this.exam = exam;

		
	}
	
	@Override
	public void print() {
		System.out.printf("You have a total score of %d and an average of %f.", exam.total(), exam.avg()); 

	}


	

}
