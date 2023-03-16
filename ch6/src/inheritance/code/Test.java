package inheritance.code;

import java.util.Date;
import java.util.Scanner; 
import exam.Account;
//import문
//다른 패키지에 있는 클래스를 사용할때 필요


//java.lang 패키지에 있는 클래스 사용하려면 import구문 필요x
//자주 사용하는 패키지이기 때문에 기본적으로 사용할수 있도록 되어있음

//접근 제어자(modifier): 멤버 또는 클래스에 사용되어 해당하는 멤버 또는 클래스를 외부에서 접근하지 못하도록 제한
//public,protected,default,private
//접근 범위: public > protected > default > private
// 1)public, protected, default, private

//private:같은 클래스 내에서만 접근 가능
// 생략: 같은 패기지 내에서만 접근 가능
// protected: 같은 패키지내에서, 다른패키지의 자손클래스에서 접근가능
//public: 접근 제한이 전혀없음




//제어자
//static(공통적인)-멤버변수,메서드,초기화블럭
//final-클래스,메서드,멤버변수,지역변수
//abstract-
public class Test {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	Account account =  new Account(null,null,0);
	
	Date date= new Date();
	
	String str= "Hello";
	
	
	
	
	
}
}
