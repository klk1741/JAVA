package ch6;

public class TvEx3 {

	public static void main(String[] args) {
	//객체 생성
		Tv3 tv= new Tv3();
		Tv3 tv2= new Tv3();

	System.out.println("현재 채널 "+ tv2.getChannel());
	System.out.println("현재 색상 "+ tv2.getColor());
	System.out.println("현재 전원 여부 "+ tv2.isPower());
	
	tv2.setChannel(150); //tv2채녈 변경
	System.out.println("현재 채널 "+tv2.getChannel());
	
	//tv 속성값 변경
	//색상변경
	//메소드 호출시 void인 경우 호출만 가능
	//syso에 넣지못함
	tv.setColor("black");
	
	System.out.println("tv color "+ tv.getColor());
	System.out.println("현재 전원 여부 "+ tv.isPower());
	}

}
