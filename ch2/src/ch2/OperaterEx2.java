package ch2;

/* 단항연산자 +,-,++,--,~,!
   아항연산자
       산술 : +,-,*,/,%,<<,>>,>>>
       비교 :>,<,>=,<=,==,!=
       논리 :&&,||,&,^,|
   삼항연산자 : ?, :
   대입연산자 : =
*/
public class OperaterEx2 {

	public static void main(String[] args) {
int num1=10;
int num2=10;

System.out.println(num1==num2);
System.out.println(num1!=num2);
System.out.println(num1>=num2);
System.out.println(num1<=num2);

boolean result= num1 == num2;
System.out.println(result);


char ch1='A';
char ch2='B';
System.out.println("ch1==ch2 = " + (ch1==ch2));
System.out.println("ch1>=ch2 = " + (ch1>=ch2));
System.out.println("ch1<=ch2 = " + (ch1<=ch2));
System.out.println("ch1!=ch2 = " + (ch1!=ch2));

double d1=0.4;
float f1=0.4f;
System.out.println("d1==f1 "+(d1==f1));
System.out.println("d1!=f1 "+(d1!=f1));
System.out.println("d1>=f1 "+(d1>=f1));
System.out.println("d1<=f1 "+(d1<=f1));

	}

}
