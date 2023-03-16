package thread;

public class Calculator {
private int memory;

public int getMemory() {
	return memory;
}


public void setMemory(int memory) {
	this.memory=memory;
	
	Thread.sleep(20);
	
	System.out.println(Thread.currentThread().getName()+": "+this.memory);
}
}
