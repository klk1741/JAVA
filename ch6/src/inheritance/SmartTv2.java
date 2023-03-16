package inheritance;
//Tv 클래스를 상속받은 SmartTv
public class SmartTv2 extends Tv2 {
	boolean caption;
	public int channel;
	public String power;




	public SmartTv2(boolean power, int channel) {
		super(power,channel);  //부모의 기본생성자 호출

	}




	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}




	public void channelUp() {
		// TODO Auto-generated method stub
		
	}




	public void power() {
		// TODO Auto-generated method stub
		
	}
}
