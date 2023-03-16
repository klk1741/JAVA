package ch6;

public class MethodEx1 {
 //반환타입 메스드 이름(타입 변수명.....){
//    메서드 호출 시 수행될 코드
//    }

	
	void add1() {
		return;
	}
	void add2() {
		return;
	}
	int add3() {
		//돌아갈때 int값 갖고 돌아감
		return 0; 
	}
	String add4() {
		//돌아갈때 String값 갖고 돌아감
		return "";
	}
	double add5() {
		//돌아갈때 double값 갖고 돌아감
		return 0.0;
	}
	char add6() {
		//돌아갈때 char값 갖고 돌아감
		return 'a';
	}
	int[] add7() {
		//돌아갈때 int[](배열) 값 갖고 돌아감
		return new int[] {10,11,12};
	}
	//매개변수가 있는 메소드
	void add8(int a,int b) {
	//a,b에 값이있어야 함==> 메소드 호출시 처리
	//매개변수를 이용한 어떤 작업을 주로함
     System.out.println(a+b);
	}


	int add9(int a,int b) {
		//a,b에 값이있어야 함==> 메소드 호출시 처리
		//매개변수를 이용한 어떤 작업을 주로함
		//a+b를 한후 리턴
		return a+b;
			}

double add10(int a, double b) {
	return a+b;
}
	
	
}
