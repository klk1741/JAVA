package ch7;
/*컴파일 에러: 컴파일 시에 발생하는 에러
 *런타임 에러: 실행시에 발생하는 에러
  논리적 에러: 실행은 되지만, 의도와 다르게 동작하는것

  에러(error): 코드에 의해 수숩될수 없는 심각한 오류 ex)메모리부족, stackoverflow
  예외(exception): 코드에의해 수습될수있는 미약한 오류
  
  
  exception: 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
  RuntimeException: 프로그래머의 실수로 발생하는 예외
  -배열 범위 벗어나기, NullPointerException, ClassCastException...
  
  exception 처리
  try~catch 
*/

public class ExceptionEx3 {

	public static void main(String[] args) {
//if(args.length==1) {
//		System.out.println(args[0]);//배열 인덱스 오류
//	}else {
//		System.out.println("실행방법 확인");
//	}
try {

	System.out.println(args[0]);
	System.out.println(3/0);
} catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("실행방법 확인");
} catch (ArithmeticException e) {
System.out.println("0으로 나눌수 없음");
} catch (Exception e) {
	System.out.println("오류 발생");
}}
}