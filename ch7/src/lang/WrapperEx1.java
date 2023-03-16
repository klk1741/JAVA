package lang;


/*타입
 * 1)기본형: byye,short,int,long.float,double,boolean.char
 * 2)참조형: 배열,클래스,인터페이스
 * 
 */
public class WrapperEx1 {
	public static void main(String[] args) {
//정수형을 다룰때
		//기본형
		int a =3;
	//참조형: 클래스 만들어져있다
		Integer i = new Integer(3);
	Integer i2=3;
	Integer i3=3;
	Character ch2= 'a';
	Byte b2= '4';
	Float f2= 4.15f;
	Double d2= 4.5;
	Boolean b4= false;
	Long l2= 123L;
	
	System.out.println(i2.equals(i3));
	System.out.println(i2==i3);
	
	System.out.println("문자형태의 숫자를 정수로 Integer.parseInt()"+Integer.parseInt("10"));
	System.out.println("문자형태의 숫자를 실수로 Double.parseInt()"+Double.parseDouble("10"));

	
	//기본형으로 선언된 변수를 참조형에 바로 대입 가능
	Integer i4 =a;
	
	}

}
