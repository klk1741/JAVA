package ch6;

public class Car3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

}
String company;
String model;
String color;
int maxSpeed;


 public Car3() {
	super(); 
}
	
// 목적: 인스턴스가 생성될때 호출됨, 인스턴스 초기화 담당

public Car3(String company, String model, String color) {
	super();
	this.company = company;
	this.model = model;
	this.color = color;
	}
	public Car3(String company, String model, String color, int maxSpeed) {
	//super(); 
	//this.company=company;
	//this.model = model;
	//this.color=color;
	this(company,model,color);
	this.maxSpeed= maxSpeed;
	}







void forward() {  //기능(function) 메소드
	System.out.println("전진한다. ");
}


}
	
	
	
	
	
	
	