package chpt06.sec07;

public class Television {
	static String company = "LG";
	static String model = "OLED";
	static String info; //정적 필드변수를 선언 한 후
	static {  //정적 블록을 이용해 변수를 
		info = company + "-" + model;
	}
}
