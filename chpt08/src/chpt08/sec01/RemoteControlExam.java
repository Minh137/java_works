package chpt08.sec01;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		System.out.println("�������� �ִ� ������ " + RemoteControl.MAX_VOLUME+"�Դϴ�.");
		System.out.println("�������� �ִ� ������ " + RemoteControl.MIN_VOLUME+"�Դϴ�.");
		
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		rc = new Radio();
		rc.turnOn();
		rc.setMute(true);
		rc.setMute(false);
		rc.setVolume(15);
		rc.turnOff();

	}

}
