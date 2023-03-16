package lang;

import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDataFormatEx1 {

	public static void main(String[] args) {
		
		
	Date date= new Date();
	System.out.println(date);
	
	SimpleDateFormat sdf = new SimpleDateFormat();
	System.out.println(sdf.format(date));
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		System.out.println(sdf.format(date));
//y:년도 M:월 D:일 H:시간 M
	}

}
