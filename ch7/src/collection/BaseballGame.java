package collection;

import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        // 컴퓨터가 정한 3자리 숫자 생성
        int[] answer = generateAnswer();
        
        Scanner scanner = new Scanner(System.in);
        
        int[] guess = new int[3]; // 사용자가 입력한 숫자를 저장할 배열
        int strike = 0; // 스트라이크 개수
        int ball = 0; // 볼 개수
        
        // 게임 시작
        while (strike != 3) {
            // 사용자가 숫자 입력
            System.out.print("숫자 3개를 입력하세요: ");
            String input = scanner.nextLine();
            
            // 입력된 숫자를 정수형 배열로 변환
            for (int i = 0; i < 3; i++) {
                guess[i] = input.charAt(i) - '0';
            }
            
            // 스트라이크와 볼 개수 계산
            strike = 0;
            ball = 0;
            for (int i = 0; i < 3; i++) {
                if (guess[i] == answer[i]) { // 같은 자리에 같은 숫자
                    strike++;
                } else {
                    for (int j = 0; j < 3; j++) {
                        if (guess[i] == answer[j]) { // 다른 자리에 같은 숫자
                            ball++;
                            break;
                        }
                    }
                }
            }
            
            // 결과 출력
            if (strike == 3) {
                System.out.println("정답입니다!");
            } else if (strike == 0 && ball == 0) {
                System.out.println("낫싱");
            } else {
                System.out.printf("%d 스트라이크 %d 볼%n", strike, ball);
            }
        }
        
        scanner.close();
    }
    
    // 3자리 숫자를 랜덤하게 생성하는 메서드
    public static int[] generateAnswer() {
        int[] answer = new int[3];
        boolean[] used = new boolean[10];
        
        for (int i = 0; i < 3; i++) {
            int num;
            do {
                num = (int) (Math.random() * 10); // 0부터 9까지의 랜덤한 정수
            } while (used[num]); // 이미 사용한 숫자면 다시 뽑기
            answer[i] = num;
            used[num] = true;
        }
        
        return answer;
    }
}