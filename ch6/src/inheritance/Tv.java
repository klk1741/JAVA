package inheritance;
//클래스 작성시 부모 지정x 최상위 부모는 object 클래스 존재

public class Tv {
boolean power;
int channel;

void power() {
	power=!power;
}
void channelUp() {
	channel++;
}
void channelDown() {
	channel--;
}


}
