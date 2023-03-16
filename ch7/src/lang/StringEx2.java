package lang;

import java.util.Arrays;

public class StringEx2 {

	public static void main(String[] args) {
		//String 생성자 
		// new String(char value[])'
		char c[]= {'H','E','E','I','O'};
		String str1 =  new String(c); 

		String str2 = "Hello";

		//length() : 
		System.out.println("length(): 문자열 길이 "+str1.length());

		// charAt(int index) : char => charAt 호출 시 int 매개변수를 넣어서 호출하고 결과값은 char받는다.
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(str1.length()-1));

		String str3= "자바 프로그래밍";

		//str3 문자열 '프' 문자가 들어있는지 확인 : length(),for,charAt()


		for (int i = 0; i < str3.length(); i++) {
			if(str3.charAt(i)=='프') {
				System.out.println("프가 들어있음");
				break;
			}
		}


		int cnt=0; //프 문자 갯수 세는 별수
		for (int i = 0; i < str3.length(); i++) {
			if(str3.charAt(i)=='프') {
				cnt++;

			}
			}
	System.out.println(cnt>0? "프가 들어있음": "");
					

//indexOf(int ch) : 주어진 문자 ch가 문자열에 들어있는지 확인하고 위치를 리턴(못찾으면 -1리턴)
//String str2= "Hello";
		
	
System.out.println("indexOf(int ch): "+str2.indexOf('o'));
System.out.println("indexOf(String str): "+str2.indexOf("o"));
System.out.println("indexOf(String str): "+str2.indexOf("llo"));
System.out.println("indexOf(int ch, int fromIndex): "+str2.indexOf('e',0));   //1
System.out.println("indexOf(int ch, int fromIndex): "+str2.indexOf('e',2));   //-1

//lastIndexOf():위치를 찾을때 오른쪽 끝 부터 찾음
System.out.println("lastIndexOf(int ch) :"+ str2.lastIndexOf('o'));

//str3 문자열에 '프'문자가 들어있는지 확인: indexOf()사용해서
System.out.println(str3.indexOf('프')>-1?"프가 들어있음":"");

//subString() : 범위에 해당하는 문자열 얻기
String ssn = "880515-1222012";
//subString(int beginIndex,int endIndex) : endIndex 미포함
String result= ssn.substring(3);
	System.out.println(result);
	System.out.println("subString(int beginIndex,int endIndex) "+ssn.substring(3,8));
	
	//concat(String str): +와 같은 역할
	String result2 = str2.concat("안녕하세요");
	System.out.println(result2);  //Hello 안녕하세요
	
	//startsWith(String prefix) : prefix로 시작하냐?
	//startsWith(String prefix, int toOffset): prefix로 시작하냐?
	String str4= "java.lang.Object";
	System.out.println("startsWith(String prefix) "+ str4.startsWith("java"));
	System.out.println("startsWith(String prefix) "+ str4.startsWith("python"));
	System.out.println("startsWith(String prefix,int toOffset) "+ str4.startsWith("java",3));
	
	//endWith(String suffix) : suffix로 끝나냐?
	System.out.println("endWith(String prefix) "+str4.startsWith("java"));
	
	//contains(CharSequence s): s문자열이 포함되었나 검사
	System.out.println("contains(CharSequence s) "+ str2.contains("Hello"));
	
	//replace()
	String str5= "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
	System.out.println(str5.replace("자바","java"));    //replace()결과를 새로운 문자열로 리턴
	//원본 문자열 변경하기 원한다면 새로운 문자열로 리턴되는 값을 다시 담아야한다
  str5= str5.replace("자바","java");
  System.out.println(str5);
	
  System.out.println(str2.replace('H','h'));
System.out.println(str5.replaceFirst("java","자바"));
System.out.println(str5.replaceAll("java","자바"));

//공백도 문자
//trim(): 양쪽 공백 제거(중간 공백은 제거x)
String str6= "  Hello World    ";
System.out.println(str6);
System.out.println(str6.length());
System.out.println(str6.equals("Hello World"));
System.out.println("trim() "+str6.trim());


// satatic==> 클래스이름.메소드명, 클래스이름,상수
//static String valueOf(): 지정된값을 문자열로 변환하여 반환
System.out.println(String.valueOf(true));   //"true"
System.out.println(String.valueOf('c'));    //"c"
System.out.println(String.valueOf(100));    //"100" ==>Integer.paserint("100")

int a=100;
String str7 = true+"";

//toLowerCase(): 모든문자열을 소문자로/ toUpperCase(): 모든문자열을 대문자로 변경
System.out.println("toLowerCase() "+str2.toLowerCase());
System.out.println("toUpperCase() "+str2.toUpperCase());

//split()
String animals = "dog,cat,bear";
//regex : Regular expression(정규 표현식)
String[]arr = animals.split(",");
System.out.println(arr);
	
//for
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}

//split(String regex, int limit): regex로 나누되, limit 갯수로 나누기
arr=animals.split(",",2);
	System.out.println(Arrays.toString(arr));
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
//compareTo(String str): 문자열 비교(사전순서)
//같으면 0, 사전순으로 이전이면 음수, 이후면 양수
System.out.println("aaa".compareTo("aaa"));
System.out.println("aaa".compareTo("bbb"));
System.out.println("bbb".compareTo("aaa"));


//join(): 특정 문자열로 결합
arr= animals.split(",");
System.out.println(Arrays.toString(arr));
String str8= String.join("-", arr);
System.out.println("join() "+str8);



	}   
	
}














