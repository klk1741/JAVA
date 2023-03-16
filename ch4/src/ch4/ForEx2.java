package ch4;

import java.util.Iterator;
import java.util.Scanner;

//반복문: 어떤 작업이 반복적으로 수행되도록 할때 사용
//종류: for(주로사용),while,do-while

public class ForEx2 {

	public static void main(String[] args) {
		
//	for (int i=0; i<5; i++) {
//			int dice1=(int)(Math.random()*6)+1;
//			System.out.println(dice1);
//		}
//
//	int mul=0;
//	for (int i=1; i<10; i++) {
//		
//		mul=mul*i;
//		System.out.printf("5 * %d =%d\n",i,5*i );
//	}
//	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("출력을 원하는 단을 입력하세요");
//     int num= Integer.parseInt(sc.nextLine());
//     
//     for(int i=1; i<10; i++) {
//    	 
//    	 
//    	 System.out.printf("%d * %d =%d\n",num,i,num*i );
//    	 
//     }
//     
//	
	
     
//     int sum=0;
//     for (int i = 1; i <=100; i++) {
//		
//    	 if(i%3==0 ||i%5==0) {
//    		 sum+=i;
//    	 }
//		
//	}
//	System.out.println("3과 5의 배수 합: "+sum);
//	
	int sum=0;
    for (int i = 1; i <=100; i++) {
		
   	 if(i%3==0 && i%9!=0) {
   		 sum+=i;
   	 }
		
	}
	System.out.println("9의배수 뺀 3의배수: "+sum);
	
	
	}	


}


