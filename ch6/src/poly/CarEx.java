package poly;

public class CarEx {

	public static void main(String[] args) {
     
		//Car car1= new FireEngine();
	    Car car= null;
	    
	    FireEngine fireEngine= new FireEngine();
	    FireEngine fireEngine2= null;
		
		fireEngine.water();
		car= fireEngine;
		
		fireEngine2=(FireEngine)car;
		fireEngine2.water();
		
		
		//FireEngine fe= (FireEngine)new Car();
	     //fe.drive();
		//Car car2= new Ambluance();
		
		FireEngine fe = (FireEngine)new Car();
	fe.drive();
	}

}
