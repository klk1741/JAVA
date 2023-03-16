package ch1;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 메뉴판
        System.out.println("===== Menu =====");
        System.out.println("1. 아메리카노 - 1500원");
        System.out.println("2. 카페라떼 - 2000원");
        System.out.println("3. 카푸치노 - 2500원");
        System.out.println("=================");

        // 주문
        System.out.print("주문하실 음료 번호를 입력하세요: ");
        int menuNum = scanner.nextInt();

        System.out.print("주문하실 수량을 입력하세요: ");
        int quantity = scanner.nextInt();

        // 계산
        int totalPrice = 0;
        String menuName = "";

        switch(menuNum) {
            case 1:
                totalPrice = 1500 * quantity;
                menuName = "아메리카노";
                break;
            case 2:
                totalPrice = 2000 * quantity;
                menuName = "카페라떼";
                break;
            case 3:
                totalPrice = 2500 * quantity;
                menuName = "카푸치노";
                break;
            default:
                System.out.println("잘못된 번호입니다.");
                System.exit(0);
        }

        // 영수증 출력
        System.out.println("===== Receipt =====");
        System.out.println("주문하신 음료: " + menuName);
        System.out.println("주문 수량: " + quantity);
        System.out.println("총 가격: " + totalPrice + "원");
        System.out.println("==================");

        scanner.close();
    }
}