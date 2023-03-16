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

public class ExceptionEx5 {

	public static void main(String[] args) {
int arr[]= new int[0];
	try {	getAverage(arr);
	}catch (Exception e) {
		// e.printStackTrace();
System.out.println(e.getMessage());
	}
	}
	//getAverage 메서드에 예외선언
	//getAverage 호출하면 예외가발생 가능
	static double getAverage(int arr[])throws Exception{
		//강제로 예외발생
		if(arr.length == 0) {
			throw new Exception("비어있는 배열입니다.");
			//실행시 예외
			//throw new RuntimeException("비어있는 배열입니다.");
	}
	return getTotal(arr)/arr.length;
}
static int getTotal(int arr[]) {
	int total=0;
	for (int i = 0; i < arr.length; i++) {
		total+= arr[i];
	}
	return total;
}}
