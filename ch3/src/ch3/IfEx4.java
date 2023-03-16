

//		Scanner sc= new Scanner(System.in);
//		System.out.print("키를 입력해주세요: ");
//     	int height = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("몸무게를 입력해주세요: ");
////		int weight = Integer.parseInt(sc.nextLine());
//		double weight = Double.parseDouble(sc.nextLine());
//		double result= (height-100)*0.9;
//
//		if (result<weight) {
//			System.out.println("과체중");
//		}
//		else if (result==weight) {
//			System.out.println("표준");
//		}
//		else {
//			System.out.println("저체중");
//		}
//	



//int year=2023;
//
//if(year%4==0 && year%100!=0 || year%400==0) {
//	System.out.println("윤년입니다.");
//}else {
//	System.out.println("평년입니다.");
//}}}
////윤년 연도를 4로나눈 나머지가 0이고, 연도를 100으로 나눈 나머지가 0이 아니거나 연도를 400으로 나눈 나어지가0이면 




//	int rate=9800;
//	//8*9800=하루일당
//	// 8*9800+4*(9800*1.5)
//	if(hours<=8) {
//		System.out.print(hours*rate);
//	}else
//	System.out.print((int)(hours*rate)+(hours-8)*rate*1.5);


package ch3;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {

	
//continue
		//반복문 내에서만 사용
		//반복이 진행되는 도중에 continue문을 만나면 반복문의 끝으로 이동하여 다음
	    //반복문으로 넘어감
for (int i = 0; i <=10; i++) {
	if(i%3==0)continue;
	System.out.println(i);
	
}
	
}
		
	}