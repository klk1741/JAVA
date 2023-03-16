package inheritance.code;

//상속 禁止
public final class FinalTest {

	final int MAX_SIZE=10;  //상수 : 초기화 이후에는 값변경 불가함

	static final int MIN_SIZE=0;

	//오버라이딩 금지
	final void getMaxSize() {
		final int LV = MAX_SIZE;  //상수

	}
}
