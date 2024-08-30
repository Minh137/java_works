package chpt08.sec01;

public interface RemoteControl {
	//필드 선언
	int MAX_VOLUME = 10;	//public static final이 된다.
	int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리 합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음모드를 해제 합니다.");
		}
	}
}
