package ch6;

import java.util.Scanner;

public class CarEx4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("회사명 >>");
		String company=sc.nextLine();
		System.out.println("모델명 >>");
		String model=sc.nextLine();
		System.out.println("색상명 >>");
		String color=sc.nextLine();
		System.out.println("최대속도 >>");
		int maxSpeed=Integer.parseInt(sc.nextLine());
		
		
	  Car3 car= new Car3(company,model,color,maxSpeed);
	System.out.println(car);
	
	
	}

}
