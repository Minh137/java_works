package chpt06.sec07;

public class Earth {
	//��� ���� �� �ʱ�ȭ
	static final double EARTH_RADIUS = 6371;
	
	//��� ����
	static final double EARTH_SURFACE_AREA;
	
	//Math.PI - �ڹٿ��� �����ϴ� �Լ�
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS * EARTH_RADIUS;
	}
	
}
