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
public class IfEx2 {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//true or false로 판별되어야함  i==0, i>0, i!=10 i%2==0 i/2==!0
//if (조건)  {
//블럭실행여부는 조건이 true 일때만 
//if(조건) {
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
	
	int jumsu=70;
	char grade;
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
	}else
		grade='F';
	System.out.printf("점수: %d, 등급 : %c\n", jumsu,grade);
	
	
	int month=2;
	
	switch (month) {
	case 3:case 4:case 5:
		System.out.println("현재 계절은 봄");
		break;
	case 6:case 7: case 8:
		System.out.println("현재 계절은 여름");
		break;
	case 9:case 10: case 11:
		System.out.println("현재 계절은 가을");
	break;
	case 12:case 1: case 2:
		System.out.println("현재 계절은 겨울");
		break;
	}
	
	if(month>=3&&month<=5) {
		System.out.println("현재 계절은 봄");
	}
	else if(month>=6&&month<=8){
		System.out.println("현재 계절은 여름");
	}
	else if(month>=9&&month<=11){
		System.out.println("현재 계절은 가을");
	}
	else {
		System.out.println("현재 계절은 겨울");
	}
	
}}


