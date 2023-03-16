package ch1;
//형 변환
//정수==>실수형  강제형변환(casting), 자동형변환(작은==>큰)
//실수형==>정수형   byte==>short, char==>int==>long==>float==>double  boolean 제외 나머지 서로 형변환 가능
public class VariableEx8 {
public static void main(String[] args) {
   int i = 91234567;
   float f = (float)i;   //큰 타입을 작은 타입에 담을 때에는 오류가 남
   int i2 = (int)f;   //변경타입을 앞에다 서줘야 함 (캐스팅)
   
   System.out.printf("i=%d\n",i);
   System.out.printf("f=%f i2=%d\n",f,i2);
   
   
   //자동 형변환 : 변경 타입 생략 가능
   byte byteValue = 10;
   int intVal = byteValue;
   System.out.printf("intVal = %d\n",intVal);

char charVal = 'a';
intVal = charVal;
System.out.printf("intVal = %d\n",intVal);
System.out.printf("charVal = %c\n",charVal);

double d = 5.5;
double result = intVal + d;

System.out.printf("result = %f\n",result);
System.out.println("abc\\def");

}

}

