package ch6;

import java.util.Arrays;

public class TvEx2 {

	public static void main(String[] args) {
	int[] arr= new int[3];
	
	
	arr[0] = 15;
	arr[1] = 25;
	arr[2] = 35;
	System.out.println(Arrays.toString(arr));
	
	int arr2[] = {25,35,45};
	System.out.println(Arrays.toString(arr2));
	
	//타입[] 배열명 = new 타입[개수];
	Tv2[] tvArr= new Tv2[3];
        System.out.println(tvArr[0]);
        System.out.println(tvArr[1]);
        System.out.println(tvArr[2]);
	
	tvArr[0]= new Tv2();
	tvArr[1]= new Tv2();
	tvArr[2]= new Tv2();
    System.out.println(tvArr[0].channel);
    System.out.println(tvArr[1].channel);
    System.out.println(tvArr[2].channel);
	
	Tv2 tvArr2[]= {new Tv2(), new Tv2(), new Tv2()}; 
	
	
	}

	
}
