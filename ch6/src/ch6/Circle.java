package ch6;

public class Circle {
//속성  
	//반지름
	double radius;
	
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}



	double getArea() {
		return radius*radius*3.14;
	}
	//기능
	//원의넓이 구하기
}
