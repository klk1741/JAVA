package ch1;

import java.util.Scanner;

public class VariableEx5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  //System.in은 키보드를 의미,  sc.nextLine()는 문자로 입력받기
    // int num1= Integer.parseInt(sc.nextLine()); //Integer.parseInt() : 괄호안에 들어있는 문자숫자를 숫자로 변환
                                              //Integer.parseInt("78") : 78

	System.out.print("두자리 정수를 입력해 주세요 ");
	String input = sc.nextLine();
	int num2= Integer.parseInt(input);
	System.out.printf("입력숫자 : %d",num2);
	
	
	
	
	}

}

