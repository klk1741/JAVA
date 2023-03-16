package inheritance.code;

import modifier.Account;

public class Modifier1{ //참조타입은 null로 세팅
	Account acc=new Account(); 
	String str;
	int age;

	void print() {
		
		String ano=acc.getAno();
		System.out.println("ano: "+ano);
		
		acc.setAno("111-22");
		System.out.println("ano: "+acc.getAno());
	}

	public static void main(String[] args) {
		Modifier1 modifier1= new Modifier1();
		modifier1.print();
	}

}
