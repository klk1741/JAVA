package ch5;
//참조타입에서 특정한 값이 할당되지 않은 상태: null
import java.util.Arrays;


public class ArrayEx8 {
    public static void main(String[]args) {
    //2차원 배열
    	
    	int[][] score=new int[4][3];
    	int[] score2[]=new int[2][3];
    	int score3[][]=new int[5][2];
    	
    	System.out.println(score2[0][0]);
    	System.out.println(score2[1][2]);
    	
    	//2차원 길이: 행길이
    	System.out.println("행 길이"+score2.length);
    	System.out.println("열 길이"+score2[0].length);
    	for (int i = 0; i < score2.length; i++) {
			for (int j = 0; j < score2[i].length; j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();
		}

    	//2차원 배열 선언,생성,초기화
    	int[] score4[]= {
    			{10,11,12},{20,21,22},{23,24,25}
    };
//향상된 for2차원배열 접근
    	for(int arr[]:score4) {
    		for(int j:arr);
    	}
}
}