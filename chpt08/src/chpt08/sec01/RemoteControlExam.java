package chpt08.sec01;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		System.out.println("리모컨의 최대 볼륨은 " + RemoteControl.MAX_VOLUME+"입니다.");
		System.out.println("리모컨의 최대 볼륨은 " + RemoteControl.MIN_VOLUME+"입니다.");
		
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
