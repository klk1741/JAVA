package ch6;

public class CarEx2 {

	public static void main(String[] args) {
		Car2 car= new Car2();
    System.out.println("제조사 "+car.company);
    System.out.println("모델명 "+car.model);
    System.out.println("색상 "+car.color);
    System.out.println("최대속도 "+car.maxSpeed);
	System.out.println();	
		
	Car2 car2= new Car2("기아","레이","white",200);
       
    System.out.println("제조사 "+car.company);
    System.out.println("모델명 "+car.model);
    System.out.println("색상 "+car.color);
    System.out.println("최대속도 "+car.maxSpeed);
	System.out.println();	
	
	 
	
	}

}
