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

public class ExceptionEx2 {

	public static void main(String[] args) {
//java.lang패키지의 ArithmeticException
//java.lang.ArithmeticException: / by zero
	
		try {
				System.out.println(3/0);
	
		} catch (RuntimeException e) {
	//e.printStackTrace(); //개발시 자주 쓰는 코드 형태: 예외가 발생하는 구문을 추적해서 출력
		//System.out.println("0으로 나눌 수 없습니다.");
		System.out.println(e.getMessage()); //예외 발생시 자바가 제공하는 기본메시지 출력
		}
	}

}