package ch6;

public class TimeEx {

	public static void main(String[] args) {
		Time time= new Time();
        System.out.println("현재상태");
        System.out.println(time.getHour()+":"+ time.getMinute()+":"+ time.getSecond());
	
	
	time.setHour(5);
	time.setMinute(12);
	time.setSecond(12);
	
	System.out.println("바꾼 후 상태");
    System.out.println(time.getHour()+":"+ time.getMinute()+":"+ time.getSecond());
	}

}
