package ch3;

import java.util.Scanner;


public class SwitchEx4 {

	public static void main(String[] args) {
//+,-,/,*
//사용자로부터 두개의 피연산자와 연산자를 입력받기
//연산을 수행한 후 출력
		
		Scanner sc= new Scanner(System.in);
		System.out.print("첫번째 피연산자를 입력해주세요: ");
		int num1= Integer.parseInt(sc.nextLine());
		System.out.print("두번째 피연산자를 입력해주세요: ");
		int num2= Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력해주세요: ");
		 String operator=sc.nextLine();
	
		int result=0;
	switch (operator) {
	case "+":
		result=num1+num2;
		break;
	case "-":
		result=num1-num2;		
		break;
	case "*":
		result=num1*num2;		
		break;
	case "/":
		result=num1/num2;		
		break;
    default:
    	result=num1%num2;
		break;
	}
	System.out.printf("%d %s %d = %d",num1,operator,num2,result);
	}
}