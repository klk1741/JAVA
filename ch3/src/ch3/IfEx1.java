package ch3;

import java.util.Scanner;

/* 조건문 
 * 조건식과 실행될 하나의 문장 또는 블럭으로 구성됨
   종류 :if(주로 사용),switch
 *
 *
 *
 *1.if
 *1)if
 *2)if~else
 *3)if~else if
 *
 */






public class IfEx1 {

	public static void main(String[] args) {
		
		//true or false로 판별되어야함  i==0, i>0, i!=10 i%2==0 i/2==!0
		//if (조건)  {
			//블럭실행여부는 조건이 true 일때만 
		

	
////if(조건) {
//true일때
//	}else {
//false일때
//		}
//	
//	성적 90이상일때 A, 성직이 80이상일때 B, 70 C.....
//	
//	
//if(조건1) {
//	
//	}else if(조건2) {
//	
//	}else if(조건3) {
//
//	}
	
	
	int num=1;
	if(num==0) {
		System.out.println("num=0");
	}
	
	if(num!=0)
	{
		System.out.println("num=!0");
	}
	
	
	Scanner sc = new Scanner(System.in);
	int score=Integer.parseInt(sc.nextLine());
	if(score>=60) {
		System.out.println("합격");
	}else {
		System.out.println("불합격");
	}
	
	int jumsu=70;
	char grade=' ';
	if(jumsu>=90) {
		grade='A';
	}else if(jumsu>=80) {
		grade='B';
	}else if(jumsu>=70) {
		grade='C';
	}else if(jumsu>=60) {
		grade='D';
	}else if(jumsu>=50) {
		grade='E';
	}
	System.out.printf("점수: %d, 등급 : %c\n", jumsu,grade);
	
	
	}
}

