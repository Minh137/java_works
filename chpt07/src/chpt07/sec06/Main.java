package chpt07.sec06;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Dog(); //�ڵ�Ÿ�Ժ�ȯ (��ĳ����)
		animal.sound();  //���� ��ϴ�.
		
		
		//dogŸ������ ���� Ÿ�Ժ�ȯ (�ٿ�ĳ����)
		if(animal instanceof Dog) { //Ÿ��Ȯ��
			Dog dog = (Dog) animal; //����Ÿ�Ժ�ȯ
			dog.sound();
			dog.fetch();
		}
		
		Animal newanimal = new Animal();
		if(newanimal instanceof Dog) {
			Dog newdog = (Dog) newanimal;
			newdog.sound();
		}else {
			System.out.println("newanimal�� DogŸ���� �ƴմϴ�.");
		}
	}

}
