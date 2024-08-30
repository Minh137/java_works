package chpt07.sec01;

public class PhoneExam {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "실버");
		
		//Phone에서 상속받은 필드
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);

		//SmartPhone 필드
		System.out.println("와이파이 상태"+ myPhone.wifi);
		
		//
		myPhone.bell();
		myPhone.sendVoice("여보세요?");
		myPhone.receiveVoice("고객님, 좋은 아파트 상품이 나와서 연락 드렸어요.");
		myPhone.sendVoice("월세 삽니다");
		myPhone.handUp();
		
		
		myPhone.setWifi(true);
		myPhone.internet();
		System.out.println("아파트 상품을 검색 합니다.");
		
 }

}
