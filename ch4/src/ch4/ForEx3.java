package ch4;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
	     int num= Integer.parseInt(sc.nextLine());
	int fac=1;
	     for (int i = num; i >0; i--) {
	    	 fac = fac * i;
	}
	 	System.out.println(num + "! = " + fac);
	
	
	
	}

}
