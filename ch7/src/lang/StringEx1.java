package lang;

public class StringEx1 {

	/* String 클래스
	 * -변경 불가능한(immutable)클래스
	 */
	public static void main(String[] args) {
//String 클래스의 동작구현
//문자열을 다루는 일이 많기 때문에 new사용 않고도 인스턴스 생성할수있도록 되어있음
//문자열 만들기 1)문자열 리터럴 지정 2) new		
		String str2= "Hello"; //1) 문자열 리터럴 지정: 문자열 재사용함
		String str4= "Hello";
		String str= new String("안녕하세요");
		String str3= new String("안녕하세요");
		//str2=str2+str;
		
		//문자열 비교
		//String 클래스에 equals 오버라이딩(값 비교) 되어있음
		System.out.println(str2.equals(str));
		System.out.println(str2.equalsIgnoreCase(str));
		System.out.println(str == str3);// 문자열 비교시에는 ==말고 equals사용
		System.out.println(str2 == str4);// 문자열 비교시에는 ==말고 equals사용
	}

}
