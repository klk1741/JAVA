package ch5;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[]args) {

    	int[] numArr = {0,1,2,3,4,5,6,7,8,9};
    	System.out.println(Arrays.toString(numArr));
   
    for (int i = 0; i < 100; i++) {
		//0~9사이의 임의의값 구하기
    	int a = (int)(Math.random()*10);
    
    	
    int temp=numArr[0];
    numArr[0]=numArr[a];
    numArr[a]=temp;
    
    }
    System.out.println(Arrays.toString(numArr));
    }

	
}
