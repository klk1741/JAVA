package ch4;

import java.util.Iterator;

//반복문: 어떤 작업이 반복적으로 수행되도록 할때 사용
//종류: for(주로사용),while,do-while

public class WhileEx1 {


	public static void main(String[] args) {

		int i=10;


		i=10;
		while(i>=1){
			System.out.println(i+" ");
			i--;
		}

		i=0;
		while (i<3) {
			System.out.println("HELLO");
			i++;
		}



		i=1;
		while (i<=100) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println();
		int sum=0;
		i=1;




System.out.println("1~10의 합"+ sum);	

	}
	

}


