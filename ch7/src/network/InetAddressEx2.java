package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressEx2 {

	public static void main(String[] args) {
//IntetAddress클래스: ip주소를 다루기위한 클래스
		InetAddress ip = null;
		
		
		try {
			ip=InetAddress.getLocalHost();
			System.out.println("getHostName(): "+ip.getHostName());
			System.out.println("getHostAddress():" +ip.getHostAddress());
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
		
		InetAddress ipArr[]= InetAddress.getAllByName("www.naver.com");
		
		for (int i = 0; i < ipArr.length; i++) {
			System.out.println("ipArr["+i+"] : "+ ipArr[i]);
		} 
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
