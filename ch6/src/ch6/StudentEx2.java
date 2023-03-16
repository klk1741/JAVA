package ch6;

public class StudentEx2 {
	public static void main(String[] args) {
		Student2 stuArr[]=new Student2[5];
		
		System.out.println(stuArr[0]);
		stuArr[0]=new Student2("홍길동",1,1,45,55,65);
		stuArr[1]=new Student2("성춘향",1,2,65,85,95);
		stuArr[2]=new Student2("서유기",1,3,35,55,55);
		stuArr[3]=new Student2("김미남",1,4,65,85,85);
		stuArr[4]=new Student2("이서진",1,5,15,65,65);

		for (int i = 0; i < stuArr.length; i++) {
			
		
	System.out.println("이름 :"+ stuArr[i].name);
	System.out.println("반 :"+ stuArr[i].cls);
	System.out.println("번호 :"+ stuArr[i].no);
	System.out.println("국어 :"+ stuArr[i].kor);
	System.out.println("영어 :"+ stuArr[i].eng);
	System.out.println("수학 :"+ stuArr[i].math);
	System.out.println("총점 :"+ stuArr[i].getTotal());
	System.out.println("평균 :"+ stuArr[i].getAverage());
	
		}}

}
