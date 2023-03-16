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
  예외 던지기 
*/

public class ExceptionEx4 {

	public static void main(String[] args) {
//참조형 초기화
//null:아직 값이 할당되지않음
		
		String data= null;
		Account account= null;
		
		int[] arr= null;
		
		System.out.println(data);
		System.out.println(account);
		System.out.println(arr);
		
		//참조변수가 가리ㅣ키고 있는 곳을 접근시 java,lang.NullPointerException
if(data!=null) {
	System.out.println(data.length());
}
	
	}
}