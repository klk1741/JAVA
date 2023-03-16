package abstr;

public class ManuCar extends Car {
//추상클래스 상속받는 자손클래스는 추상메소드 반드시 구현해야함
	@Override
	public void drive() {
System.out.println("사람이 주행중입니다.");		
System.out.println("사람이 핸들을 조작합니다.");	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 멈춥니다.");
		// TODO Auto-generated method stub
		
	}

}
