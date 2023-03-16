package ch1;

//변수의 범위   변수: 지역변수,인스턴스변수, 클래스 변수
//모든 변수는 유효범위 존재함
//지역변수는 자기가 속해있는 범위를 못벗어남
public class VariableEx9 {
public static void main(String[] args) {
   
	int i=4;
	
	//i의 유효범위는? main메소드 안에서만 가능 
	
	{
		int j=5;
		System.out.println(j);
	}
	
	System.out.println(i);
	System.out.println(i);

}


}

