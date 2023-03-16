package network;

import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressEx1 {

	public static void main(String[] args) {
//IntetAddress클래스: ip주소를 다루기위한 클래스
		InetAddress ip = null;
		InetAddress[] ipArr= null;
		
		try {
			ip=InetAddress.getByName("www.naver.com");
			System.out.println("getHostName(): "+ip.getHostName());
			System.out.println("getHostAddress():" +ip.getHostAddress());
			System.out.println("toString(): "+ip.getHostName());
			
			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress() : "+Arrays.toString(ipAddr));
			
			String result="";
			
			for (int i = 0; i < ipAddr.length; i++) {
				result+=(ipAddr[i]<0 ? ipAddr[i]+256: ipAddr[i]+".");
			} 
			System.out.println("getAddress()+256: "+result);
			System.out.println();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
