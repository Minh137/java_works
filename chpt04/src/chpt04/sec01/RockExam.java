package chpt04.sec01;

import java.util.Random;
import java.util.Scanner;

public class RockExam {
	
	public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"����", "����", "��"};
        System.out.print("����, ����, �� �� �ϳ��� �Է��ϼ���: ");

        String userChoice = scanner.nextLine();
        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];

        System.out.println("����� ����: " + userChoice);
        System.out.println("��ǻ�� ����: " + computerChoice);

        determineWinner(userChoice, computerChoice);

        scanner.close();
    }

	    public static void determineWinner(String userChoice, String computerChoice) {
	        if (userChoice.equals(computerChoice)) {
	            System.out.println("�����ϴ�!");
	        } else if ((userChoice.equals("����") && computerChoice.equals("��")) ||
	                   (userChoice.equals("����") && computerChoice.equals("����")) ||
	                   (userChoice.equals("��") && computerChoice.equals("����"))) {
	            System.out.println("����ڰ� �̰���ϴ�!");
	        } else {
	            System.out.println("��ǻ�Ͱ� �̰���ϴ�!");
	        }
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������� ���ӿ� ���� ���� ȯ���մϴ�!");
        playGame();
	}

}
