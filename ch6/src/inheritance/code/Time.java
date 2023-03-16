package inheritance.code;
//접근제어자를 사용하는 이유==> 캡슐화
// 외부로부터 데이터 보호위해
// 외부에는 불필요한, 내부적으로만 사용되는 부분 감추기위해
public class Time {

	public int hour;
	public int minute;
	public int second;
	
	// set메서드: 매개변수에 지정된 값을 검사하여 조건에 맞을때만 멤버변수의 값 변경
	//
	public void setHour(int hour) {
	if(hour<0||hour>23)return;
	//0~23일때만 실행
	this.hour=hour;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 23)return;
		this.minute=minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 23)return;
		this.second=second;
	}



}
