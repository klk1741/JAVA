package ch6;

//클래스 구성요소
public class Calc2 {
//+,-,*,/
// +: 두 개의 숫자를 받아서 더하기 한 후 결과를 보내기
int add(int a,int b) {
	return a+b;
}
float add(int a,float b) {
	return a+b;
}
int add(int[] arr) {
int result=0;
	for (int i = 0; i < arr.length; i++) {
	result+=arr[i];
}	
return result;
}

}



