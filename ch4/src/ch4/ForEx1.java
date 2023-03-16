package ch4;

import java.util.Iterator;

//반복문: 어떤 작업이 반복적으로 수행되도록 할때 사용
//종류: for(주로사용),while,do-while

public class ForEx1 {

	public static void main(String[] args) {
		for (int i = 10; i >=1; i--) {
			System.out.print(i+"  ");
		}
			
		
		for (int i = 1; i <=10; i+=2) {
			System.out.print(i+"  ");
		}
		
		for (int i = 0; i <3; i++) {
			System.out.println("HELLO ");
		}
		
		for (int i = 1; i <=100; i++) {
			System.out.println(i+" ");
		}
		
		
		int sum=0;
		for (int i = 1; i <=10; i++) {
			
		
		      sum=sum+i;
		}
	System.out.println("1~10의 합"+ sum);	
	}	
	
	
	}


