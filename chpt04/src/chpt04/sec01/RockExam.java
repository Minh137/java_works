package chpt04.sec01;

import java.util.Random;
import java.util.Scanner;

public class RockExam {
	
	public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"가위", "바위", "보"};
        System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");

        String userChoice = scanner.nextLine();
        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];

        System.out.println("사용자 선택: " + userChoice);
        System.out.println("컴퓨터 선택: " + computerChoice);

        determineWinner(userChoice, computerChoice);

        scanner.close();
    }

	    public static void determineWinner(String userChoice, String computerChoice) {
	        if (userChoice.equals(computerChoice)) {
	            System.out.println("비겼습니다!");
	        } else if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
	                   (userChoice.equals("바위") && computerChoice.equals("가위")) ||
	                   (userChoice.equals("보") && computerChoice.equals("바위"))) {
	            System.out.println("사용자가 이겼습니다!");
	        } else {
	            System.out.println("컴퓨터가 이겼습니다!");
	        }
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("가위바위보 게임에 오신 것을 환영합니다!");
        playGame();
	}

}
