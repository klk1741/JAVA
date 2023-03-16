package ch5;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"가위", "바위", "보"};

        while (true) {
            System.out.print("가위, 바위, 보 중에 하나를 선택하세요: ");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("종료")) {
                break;
            }

            int computerChoiceIndex = random.nextInt(choices.length);
            String computerChoice = choices[computerChoiceIndex];

            System.out.printf("당신은 %s 선택했고, 컴퓨터는 %s 선택했습니다.\n", userChoice, computerChoice);

            int result = getWinner(userChoice, computerChoice);

            if (result == 0) {
                System.out.println("비겼습니다.");
            } else if (result == 1) {
                System.out.println("당신이 이겼습니다!");
            } else {
                System.out.println("컴퓨터가 이겼습니다.");
            }
        }
    }

    public static int getWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return 0; // 비김
        } else if (userChoice.equals("가위") && computerChoice.equals("보")
                || userChoice.equals("바위") && computerChoice.equals("가위")
                || userChoice.equals("보") && computerChoice.equals("바위")) {
            return 1; // 사용자 승
        } else {
            return -1; // 컴퓨터 승
        }
    }
}