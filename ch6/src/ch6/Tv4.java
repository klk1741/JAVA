package ch6;

public class Tv4 {
	
	private String color;
	private int channel;
	private boolean power;
	
	final int VOLUME=10;
	public Tv4() {
		super();
	}

	public Tv4(String color, int channel, boolean power) {
		super();
		this.color = color;
		this.channel = channel;
		this.power = power;
		//this.VOLUME은 안된다
	}

	void power() {
		power = !power;
	}

	void channelUp() {
	channel++;
        
	}
void channelDown() {
	channel--;

}

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
