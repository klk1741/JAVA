package ch6;

public class DataEx {

	public static void main(String[] args) {
		
		Data d= new Data();
		d.x=10;
		Data d2= copy(d); //주소 (d.x이런식이면 값)
System.out.println("d.x= "+d.x);
System.out.println("d2.x= "+d2.x);
	}	
	static Data copy(Data d) {
		Data temp= new Data();
		temp.x=d.x;
		return temp;
	}
}
