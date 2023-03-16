package ch2;

/* 단항연산자 +,-,++,--,~,!
   아항연산자
       산술 : +,-,*,/,%,<<,>>,>>>
       비교 :>,<,>=,<=,==,!=
       논리 :&&,||,&,^,|
   삼항연산자 : ?, :
   대입연산자 : =
*/
public class OperaterEx1 {

	public static void main(String[] args) {
/*  int i=5;
  i++;
  System.out.println(i);
  
  i=5;
  ++i;
  System.out.println(i);
	*/	
	
	int i=5, j=0;
	j=i++;
	System.out.println("j=i++실행후 i="  + i + ", j= " +j);
	
	i=5;
	j=0;
	j=++i;
	System.out.println("j=i++실행후 i="  + i + ", j= " +j);  
	
	boolean play=true;
	System.out.println("play= "+ play);
	System.out.println("!play="+!play);
	
	
	}

}
