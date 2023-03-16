package ch1;

import java.util.Scanner;

public class VariableEx6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  
	System.out.print("첫번째 수 입력: " );
	int num1 = Integer.parseInt(sc.nextLine());
	System.out.print("두번째 수 입력: " );
	int num2 = Integer.parseInt(sc.nextLine());
		
	System.out.println("num1+num2= "+(num1+num2));
	System.out.println("num1-num2= "+(num1-num2));
	System.out.println("num1*num2= "+(num1*num2));
	System.out.println("num1/num2= "+(num1/num2));

	
	
	System.out.printf("덧셈:%d\n",(num1+num2));
	System.out.printf("뺄셈:%d\n",num1-num2 );
	System.out.printf("곱셈:%d\n",num1*num2 );
	System.out.printf("나눗셈:%d\n",num1/num2 );
	}

}

