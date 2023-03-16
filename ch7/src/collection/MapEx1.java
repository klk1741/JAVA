package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx1 {

    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();

        //put(): 요소 추가
        map.put("myId1", "1234");
        map.put("myId2", "1234");
        map.put("myId3", "1234");
        map.put("myId4", "1234");

        Scanner sc= new Scanner(System.in);
        while(true) {
           
            System.out.print("아이디를 입력하세요: "); // key에 해당하는 id 입력받기
            String id = sc.next();       // value에 해당하는 password 입력받기
            System.out.print("비밀번호를 입력하세요: ");
            String password = sc.next();
            // map에 입력받은 id가 존재하지 않는 경우 "입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요" 출력후 다시 id 입력받기
            if (!map.containsKey(id)) {
                System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요.");
            } else {
                // map에 입력받은 id가 존재하는 경우 비밀번호를 입력받기
                String storedPassword = map.get(id);
                // 입력받은 비밀번호가 일치하는지 확인한후 비밀번호가 일치하면 프로그램 종료, 일치하지 않는경우 "다시 입력해 주세요" 출력후 재입력받기
                if (storedPassword.equals(password)) {
                    System.out.println("로그인에 성공했습니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
                }
            }
        }
    }
}