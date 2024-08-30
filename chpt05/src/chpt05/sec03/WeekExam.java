package chpt05.sec03;

import java.util.Calendar;

public class WeekExam {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Week today = null;  //Week 열거 타입 변수 선언

		//오늘의 요일 얻기
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//1.월  7.일요일
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		if(today == Week.FRIDAY) {
			System.out.println("불금에는 홍대로~~~~~~!!!");
		}else {
			System.out.println("");
		}
		
	}

}
