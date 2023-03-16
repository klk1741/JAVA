package collection;

import java.util.Arrays;

/*
 * Arrays클래스
 * -배열 다루는 유용한 메스드 정의되어잉ㅆ다
 * -모든 메서드는 static이다
 * 
 */
public class ArrayEx1 {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5};
		
		//toString
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		int arr2[][]={{11,23},{21,22}};
	System.out.println(arr2);
	//System.out.println(Arrays.toString(arr2)); 2차원은 x
	//deepToString():2차원배열의 요소를 문자열로  출력
	System.out.println(Arrays.deepToString(arr2));
	
	//equals(): 값비교( 두배열에 저장된 모든요소를 비교해서같으면 true,다르면 false)
	String[]str1= {"aaa","bbb"};
	String[]str2= {"aaa","bbb"};
	System.out.println(Arrays.equals(str1, str2));
	
	//deepEquals(): 2차원 배열값 비교
	String[][]str2D= {{"aaa","bbb"},{"AAA","BBB"}};
	String[][]str2D2= {{"aaa","bbb"},{"AAA","BBB"}};
	System.out.println(Arrays.deepEquals(str2D,str2D2));
	
	int arr3[]=new int[5];

	for (int i = 0; i < arr.length; i++) {
	    arr3[i] = arr[i];
	}
	System.out.println(Arrays.toString(arr3));
	
	//copyOf(원본배열, 복사할 개수), copyOfRange()
	int arr4[]= Arrays.copyOf(arr,arr.length);
	System.out.println(Arrays.toString(arr4));
	
	list= new ArrayList<>(Arrays.asList(arr3));
	}
	

}
