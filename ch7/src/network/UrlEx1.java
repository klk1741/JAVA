package network;

import java.net.URL;

/*
 * URL(Uniform Resource Locator)
 * https://m.sports.naver.com/game/20230315SKLT02023/record,https://cafe.naver.com/as6060?iframe_url_utf8=%2FArticleRead.nhn%253Fclubid%3D10799390%2526articleid%3D1628281
 호스트명: www.naver.com, serach.naver.com(서버이름)
 프로토콜: https(자원에 접근하기 위해 서버에 통신하는데 필요한 통신규약)
 경로명: 접근하려는 자원이 저장된 서버상의 위치
 파일명: Scanner.html
 쿼리: url에서 ?이후의 부분    ex)iframe_url_utf8=%2FArticleRead.nhn%253Fclubid%3D10799390%2526articleid%3D1628281       

 *
 *
 *
 *
 *
 *
 */

public class UrlEx1 {

	public static void main(String[] args) {
		try {
			URL url= new URL("https://cafe.naver.com/as6060?iframe_url_utf8=%2FArticleRead.nhn%253Fclubid%3D10799390%2526articleid%3D1628281");

			System.out.println("url.getAuthority(): "+ url.getAuthority());
			System.out.println("url.getContent(): "+ url.getContent());
			System.out.println("url.getDefaultPort(): "+ url.getDefaultPort());
			System.out.println("url.getPort(): "+ url.getPort());
			System.out.println("url.getFile(): "+ url.getFile());
			System.out.println("url.getHost(): "+ url.getHost());
			System.out.println("url.getPath(): "+ url.getPath());
			System.out.println("url.getProtocol(): "+ url.getProtocol());
			System.out.println("url.getQuery(): "+ url.getQuery());
			System.out.println("url.getUserInfo(): "+ url.getUserInfo());
			System.out.println("url.toExternalForm(): "+ url.toExternalForm());
			System.out.println("url.toURI(): "+ url.toURI());





		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
