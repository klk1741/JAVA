package ch2;

/* 단항연산자 +,-,++,--,~,!
   아항연산자
       산술 : +,-,*,/,%,<<,>>,>>>
       비교 :>,<,>=,<=,==,!=
       논리 :&&,||,&,^,|
   삼항연산자 : ?, :
   대입연산자 : =
*/
public class OperaterEx3 {

	public static void main(String[] args) {

		
		int charCode='A';
		System.out.println(charCode);
		
		if((charCode>=65)&&(charCode<=90)) {
			System.out.println("대문자");
		}
		int x=15;
		if(x > 10 && x < 20) {
			System.out.println("x는 10~20사이에 있음");
		}
		
		
		
		
	}

}
