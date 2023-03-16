package ch6;

public class Student2 {
//학생이름 name ex)홍길동
//반   ex)1
//번호  ex)1
//국어점수 kor ex)78
//영어점수 eng ex)88
//수학점수 math ex)65
	
	String name;
	int cls;
	int no;
	int kor;
	int eng;
	int math;
	
	
	
	public Student2(String name, int cls, int no, int kor, int eng, int math) {
		super();
		
		this.name = name;
		this.cls = cls;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
int getTotal() {
	return this.kor+this.eng+this.math;
}
double getAverage() {
	return getTotal()/ 3.0;
}





	@Override
public String toString() {
	return "Student2 [name=" + name + ", cls=" + cls + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math=" + math
			+ "]";
}
//	String info(){
//		
//		int sum= this.kor+this.eng+this.math;
//	    double avg= (double)sum/3.0;
//	    
//	    
//		return this.name+","+this.cls+","+
//		        this.no+","+this.kor+","+this.eng+","+this.math+","+sum+","+avg;
//	}
//	
//
}
//	
//	

