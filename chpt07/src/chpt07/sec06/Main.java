package chpt07.sec06;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Dog(); //자동타입변환 (업캐스팅)
		animal.sound();  //개가 웁니다.
		
		
		//dog타입으로 강제 타입변환 (다운캐스팅)
		if(animal instanceof Dog) { //타입확인
			Dog dog = (Dog) animal; //강제타입변환
			dog.sound();
			dog.fetch();
		}
		
		Animal newanimal = new Animal();
		if(newanimal instanceof Dog) {
			Dog newdog = (Dog) newanimal;
			newdog.sound();
		}else {
			System.out.println("newanimal은 Dog타입이 아닙니다.");
		}
	}

}
