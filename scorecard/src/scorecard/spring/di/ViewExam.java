package scorecard.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import scorecard.spring.di.ui.ExamConsole;


public class ViewExam {

	public static void main(String[] args) {
		
		//Exam exam = new ScoreCardExam();
		
		//ExamConsole console = new KRExamConsole(exam);
		//ExamConsole console = new JAPExamConsole(exam);
		//ExamConsole console = new ENGExamConsole(exam);
		
		//
		
		ApplicationContext context = new ClassPathXmlApplicationContext("scorecard/spring/di/entity/spring-config.xml");
		ExamConsole console = (ExamConsole) context.getBean("consolekr");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();

		
		
	}

}
//ApplicationContext -->
//
//-- ClassPathXmlApp... : 클래스 경로에 있는 XML파일을 로드
//-- FileSystemXmlApp...  : 파일시스템 경로로 부터 xml파일을 로드
//   예) ("/path/to/spring-context.xml")
//-- XmlWebApp... :  주로 Spring MVC와 함께 사용 //특정 위치(주로WEB-INF)에서 XML을 로드
//                         Spring의 DispatcherServlet 과 같이 동작
//                        예) 
//                         <servlet>
//                             <servlet-name>spring</servlet-name>
//                             <servlet-class>org.springframework.....  DispatcherServlet</servlet-class>
//                             <init-param>
//                                 <param-name>contextConfiguration</param-name>
//                                 <param-value>/WEB-INF/spring-context.xml</param-value>
//                             </init-param>
//                          </servlet>
//
//-- AnnotationConfigApp... : xml을 사용하지 않고 java 기반 어노테이션을 사용하여 빈을 설정
//  예)ApplicationContext context = new AnnotationConfigApp...(AppConfig.class);
