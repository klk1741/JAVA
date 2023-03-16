package lang;

public class Value {
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}
	//object가 equals()주소 비교로 넘겨줬음
	//값비교로 바꾸고 싶은 상황==>오버라이드

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value) {
			Value v= (Value) obj;
			//instanceof: 특정 객체의 인스턴스인지 확인
			//obj가 Value 객체의 인스턴스냐? 
			if(this.value ==v.value) {
				return true;
			}
		}
		return false;
	}
//toString(): Object는 패키지명.클래스명@hasCode값
//자손 toString(): 인스턴스에 대한 정보(멤버변수에 할당된 값)를 문자열로 제공하는 목적으로
	@Override
	public String toString() {
		return "Value [value="+value+"]"; 
		
	}

}
