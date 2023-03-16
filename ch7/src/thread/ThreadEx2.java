package thread;

public class ThreadEx2 {

	public static void main(String[] args) {

		
		Thread t1= new BigLetters();
		SmallLetters t2= new SmallLetters();
		
		t1.start();
		t2.start();
	}

}
