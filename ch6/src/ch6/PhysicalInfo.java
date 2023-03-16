package ch6;

public class PhysicalInfo {
//생성자 오버로딩
//오버로딩: 한 클래스에 동일한 이름의 메소드, 생성자가 존재
String name;
int age;
float height;
float weight;
//생성자 오버로딩
//생성자 이름은 같아야함
//매개변수의 개수 또는 타입이 달라야 함
public PhysicalInfo(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}


//생성자 / 메소드 오버로딩
//오버로딩: 한 클래스에 동일한 이름의 메소드,생성자가 존재
public PhysicalInfo(String name, int age, float height, float weight) {
	//super();
	//this.name = name;
	//this.age = age;
	this(name,age); //생성자에서 다른 생성자 호출
	this.height = height;
	this.weight = weight;
	//this(height,weight); //Constructor call must be the first statement in a constructor 첫줄만 저런식으로 쓰는거가능
}
public PhysicalInfo(float height, float weight) {
	super();
	this.height = height;
	this.weight = weight;
}


}
