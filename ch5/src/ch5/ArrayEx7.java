package ch5;
//참조타입에서 특정한 값이 할당되지 않은 상태: null
import java.util.Arrays;


public class ArrayEx7 {
    public static void main(String[]args) {
    	String name[]= new String[3];
    	System.out.println(name[0]); //null
    	
for (int i = 0; i < name.length; i++) {
	System.out.println(name[i]);
}

    	
   //배열 초기화 	
name[0]= "Kim";
name[1]= "Park";
name[2]=  "Yi";
System.out.println(name[0]);
System.out.println(name[0].charAt(1));

String str= "ABCDE";
System.out.println(str.charAt(3));
System.out.println(str.charAt(4));
//문자열(String) 비교 ==,!= 사용하지않음

System.out.println(str.equals("ABCDE"));       //대소문자 대소문자 포함 ㅂ;교
System.out.println(str.equalsIgnoreCase("ABCDE")); //대소문자 무시하고 비교할때 사용
    
System.out.println(str.equals("ABCDE")?"일치함": "일치하지 않음");

if(str.equals("abcde")) {
	System.out.println("일치함");
}else {
	System.out.println("일치하지 않음");
}
    }
	
}
