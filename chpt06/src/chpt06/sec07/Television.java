package chpt06.sec07;

public class Television {
	static String company = "LG";
	static String model = "OLED";
	static String info; //���� �ʵ庯���� ���� �� ��
	static {  //���� ������ �̿��� ������ 
		info = company + "-" + model;
	}
}