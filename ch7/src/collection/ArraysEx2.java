package collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {

	public static void main(String[] args) {
int arr[] = {34,24,5,23,54,78,97,54,34};
String strArr[]= {"cat","Dog","lion","tiger"};

//오름차순 정렬
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));

//사전 순으로 정렬(공백,숫자,대문자,소문자 순으로 정렬)
Arrays.sort(strArr);
System.out.println(Arrays.toString(strArr));

//내림차순 정렬
//sort(T a[], Comparator<? super T>c)
//Arrays.sort(strArr,new DescComp());
	// comparator.reverseOrder(): 내림차순 Comparator.naturalOrder():오름차순
Arrays.sort(strArr, Comparator.reverseOrder());
System.out.println(Arrays.toString(strArr));
	
	
	}

}

//정렬기준 새롭게 작성시
class DescComp implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*-1;
	}

}
