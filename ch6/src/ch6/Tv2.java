package ch6;
//변수 연산자 조건문 반복문 배열
// 객체지향언어- 자바
// 코드의 재사용성이 좋다, 코드 관리가 용이함, 신뢰성이 높은 프로그래밍 가능하게 함
//클래스: 객체를 정의해 놓은것 클
//클래스 용도: 객체 생성하는데 사용
//객체: 실제로 존재하는것, 사물or개념

//특정 작업을 수행하는 일련의 문장들을 하나로 묶어놓은거 수학함수와 유사
// 리턴(반환)타입 메소드명(){}
//리턴*반환) 타입 메소드명(매개변수1,...){}

public class Tv2 {
	//속성(property)==>멤버변수 : 크키,길이,높이,색상,볼륨,채널......
 	String color;
	int channel;
	boolean power;
	
	
	//기능(funciton)==> 메서드: 켜기,끄기.볼륨 높이기,채널변경.....

	void power() {
		power = !power;
	}

//채널 증가, 현재 채널 리턴	
	//int: 메소드가 실행 끝난 후 int값 갖고 돌아감
	void channelUp() {
	channel++;
}
void channelDown() {
	channel--;

}
//getter: 변수의 값 리턴하는 형태
//setter: 변수의 값 변경
public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getChannel() {
	return channel;
}

public void setChannel(int channel) {
	this.channel = channel;
}

public boolean isPower() {
	return power;
}

public void setPower(boolean power) {
	this.power = power;
}

}
