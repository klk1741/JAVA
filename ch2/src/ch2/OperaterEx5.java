package ch2;
import java.util.Scanner;

/* 단항연산자 +,-,++,--,~,!
   아항연산자
       산술 : +,-,*,/,%,<<,>>,>>>
       비교 :>,<,>=,<=,==,!=
       논리 :&&,||,&,^,|
   삼항연산자 : ?, :
   대입연산자 : =
*/
public class OperaterEx5 {

	public static void main(String[] args) {
		
		//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌때 학생 한명당 몇개를 가질수 있고, 연필의 나머지는 몇개인지 출력하기
		//출력 학생 한명당 :30
		// 남은 연필 수: 5
		
		
		int pencil=534, student=30;
		
		int result1=pencil/student;
		int result2=pencil%student;
		
		System.out.println("학생 한명당: "+ result1);
		System.out.println("남은 연필 수: "+ result2);
		
		double a=5d,b=10d,c=7d;
		 
		System.out.println("사다리꼴 넓이 :"+ ((a+b)*c)/2);
		
		//한달월급 10년동안 저축할때 최종 저축금액
Scanner sc = new Scanner(System.in);
System.out.println("한달 월급을 입력하세요: ");
int salary= Integer.parseInt(sc.nextLine());
int deposit= salary*12*10;
System.out.println("10년 저축 금액:" +deposit);
		
		

int fahr=100;
double cels= 5/(double)9 *(fahr-32);
System.out.println("섭씨온도: "+cels);

	// int num=10 num이 양수or음수or0

int num=10;
String result=num>0 ? "양수":(num<0 ? "음수": "0");
System.out.println(result);


	System.out.print("숫자를 입력해주세요: " );	
int input=Integer.parseInt(sc.nextLine());
       result= input%2==0?"짝수":"홀수";
    	   System.out.println(result);

	}

	
		
	}

