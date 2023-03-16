package thread;
/*
 * 프로세스: 실행중인 프로그램
 * 프로세스안에는 최소한 하나 이상의 쓰레드가 존재(둘 이상의 쓰레드를 가진 프로세스를 멀티 쓰레드 프로세스)
 * 
 */
public class ThreadEx1 {

	public static void main(String[] args) {
//멀티 스레드로 동작할 인스턴스 생성
		SmallLetters t1= new SmallLetters();
		t1.start();
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

}
