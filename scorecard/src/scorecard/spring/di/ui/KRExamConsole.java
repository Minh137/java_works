package scorecard.spring.di.ui;

import scorecard.spring.di.entity.Exam;

public class KRExamConsole implements ExamConsole {
   
   private Exam exam;
   
   public KRExamConsole() {}
   
   public KRExamConsole(Exam exam) {
      this.exam = exam;
   }
   
   @Override
   public void setExam(Exam exam) {
      this.exam = exam;
   }

   @Override
   public void print() {
      System.out.printf("당신은 총점은 %d, 평균은 %f 입니다.", exam.total(), exam.avg());
   }

}
