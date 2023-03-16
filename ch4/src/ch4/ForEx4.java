package ch4;

import java.util.Scanner;
//중첩 for문 for문안에 for문 포함
public class ForEx4 {

	public static void main(String[] args) {

		// 1) 바깥 for int i = 1;
		// 2) i<6;
		// 3) 안쪽 for int j = 0;
		// 4) j<10;
		// 5) System.out.print("*");
		// 6) j++ j=1
		// 7) j<10;
		// 8) System.out.print("*");
		// 9) 6~8반복
		// 10) j가 10이되면 안쪽 for 거짓이 됨 ==> 안쪽 for 종료
		// 11) System.out.println();
		// 12) 바깥쪽 for i++ i=2
		// 13) i < 6 조건 비교
		// 14) 안쪽 for 문 10번 수행
		// 15) 계속 반복되다가 i가 6이 되는 순간 for문 종료 
		for (int i = 1; i <6; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	




		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}




		//4x+5y=60의 모든해
		//x,y는 10이하 자연수
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=10; j++) {
				if(4*i+5*j==60) {
					System.out.printf("(%d,%d)\n",i,j);
				}
			}}


		//break;
		//자신이 포함된 가장 가까운 반복문을 벗어나게 됨(주로 if와 같이 사용됨)




		for(int i =0; i<10; i++) {
			System.out.println(i);
			if(i==5) break;
		}





	}
}



