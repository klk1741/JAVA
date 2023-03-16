package inheritance.code;

public class Time {

	//속성 - 시,분,초
private int hour;
private int minute;
private int second;
	
//메소드에서 return을 만나면 수행할 구문이 있더라도 메소드는 종료
public void setHour(int hour) {
	//0~23 사이라면 시간 변경
	if(hour<0 || hour>23) return;
	this.hour = hour;
}
public int getHour() {
	return hour;
}
public void setMinute(int minute) {
//0~59 사이면 변경
	if(minute<0|| minute>59) return;
	this.minute = minute;
}
public int getMinute() {
	return minute;
}


public void setSecond(int second) {
	if(second<0|| second>59) return;
	this.second = second;
}
public int getSecond() {
	return second;
}
//멤버 변수가 private 키워드를 사용하게 되면
//외부에서 접근 불가


}

