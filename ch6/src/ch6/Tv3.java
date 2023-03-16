package ch6;

public class Tv3 {
	
	private String color;
	private int channel;
	private boolean power;
	
	

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
