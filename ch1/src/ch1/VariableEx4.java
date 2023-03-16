package ch1;

public class VariableEx4 {

	public static void main(String[] args) {
		long big = 100_000_000_000L;
        float f = 0.14159f;
        double d = 0.141592d;                        //리터럴들
	
	int octNum = 010;     //8진수 10을 10진수로 출력
	int hexNum = 0x10;    //16진수 10  
	int binNum = 0b10;      //2진수 10
	System.out.println(octNum);
	System.out.println(hexNum);
	System.out.println(binNum);
	
	int i = 'A';
	System.out.println(i);
	
	String name = "hong"; // string은 참조타입
	name = name + " 77";
	System.out.println(name);
	
	String num= 7+7+"7";
	System.out.println(num);
	
	int age=25;
	System.out.println("age=" + age);
	System.out.printf("age=%d\n",age);
	
	
	char ch1='a';
	String str1 = "abcd";
	double d1= 3.1415192;
	
	System.out.printf("ch1=%c\n",ch1);
	System.out.printf("str1=%s\n",str1);
	System.out.printf("%-10s\n",str1);
	System.out.printf("d1=%.3f",d1);

	
	}

}
