package ch5;

import java.util.Scanner;

public class ArrayEx9 {
	public static void main(String[]args) {
		//사용자에게 답변을 받을 수있도록 코드 작성
		//답과 비교할때 equals 써서 true인 경우 정답입니다.
		//                      false인 경우 틀렸습니다. 정답은 ~~입니다.
		
		String words[][]= {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};

        Scanner sc= new Scanner(System.in);   
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d) %s의 뜻은? ",i+1, words[i][0]);
		   String answer= sc.nextLine();
		
		   if(answer.equals(words[i][1])) {
			   System.out.println("정답입니다!");
		   }
		   else {
			   System.out.printf("틀렸습니다. 정답은 %s입니다.\n", words[i][1]);
		   }
		
		
		}

	}


}


