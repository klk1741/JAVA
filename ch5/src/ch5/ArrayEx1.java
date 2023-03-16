package ch5;
//배열(array)
//같은 타입의 여러 변수를 하나의 묶음으로 다루는 방법
//int score1=98,score2=88, .........30명의 점수를 저장할수있다.

// ==>int score[]; // 배열을 선언
//==> score = new int[30]; //배열 생성

public class ArrayEx1 {

	public static void main(String[] args) {
		//연속된 공간에 int 값을 저장할 수 있는 30개의 공간 생성 
		//index를 이용해서 접근 할수있음
		//int타입은 0으로 초기화 됨
		int score[]=new int[30];
		
 System.out.println(score[0]); //0~29인덱스로 접근
 System.out.println(score[15]); //0~29인덱스로 접근

 //새로운 값 할당
 score[0]=98;
 score[1]=88;
 //배열선언,생성,초기화
 //10명에 대한 점수를 배열로 다루기
int score2[]= {98,88,78,68,54,34,65,32};
	
	System.out.println("5번째 학생 점수: "+ score2[4]);
	
	
	double score3[]= {98.2,88.2,78.6,82.9,54.2,34.8,65.1,32,22,12};
	
	for (int i=0; i<score3.length; i++) {
		System.out.println((i+1)+ "번째 학생 점수 "+score3[i]);
	}
	
	
	System.out.println("1번째 학생점수 "+score3[0]);
	System.out.println("2번째 학생점수 "+score3[1]);
	System.out.println("3번째 학생점수 "+score3[2]); 
	System.out.println("4번째 학생점수 "+score3[3]);
	System.out.println("5번째 학생점수 "+score3[4]);
	System.out.println("6번째 학생점수 "+score3[5]);
	System.out.println("7번째 학생점수 "+score3[6]);
	System.out.println("8번째 학생점수 "+score3[7]);
	System.out.println("9번째 학생점수 "+score3[8]);
	System.out.println("10번째 학생점수 "+score3[9]);
	
	
	//char 5개 담는 배열
	char chArr[]= {'a','b','c','d','e'};
	
	//byte,char,short,int,long,float,double,boolean ==> 배열타입 가능
	String strArr[]= {"abc","efg"};
	
	//System.out.println(strArr[2]);  ==>Arr[0]=abc, Arr[1]=efg 이지만 Arr[2]=없기때문에 오류발생
	}
	
	
	

}
