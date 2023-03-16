package lang;

public class StringEx4 {

    public static void main(String[] args) {
        String names[] = {"Queen", "Tod", "Park", "Kim", "Hong"};
        System.out.println(findKim(names));
        //출력결과: 김씨 성은 4번째에 있다
    }

    public static String findKim(String[] seoul) {
        int index = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) { // Kim을 찾았을 때
                index = i; // 해당 인덱스를 기록하고
                break; // 반복문을 종료합니다.
            }
        }
        return "김씨 성은 " + (index + 1) + "번째에 있다"; // 인덱스를 반환합니다.
    }
}