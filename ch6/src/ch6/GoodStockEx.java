package ch6;

public class GoodStockEx {

	public static void main(String[] args) {
	 //티셔츠 상품관리
     //객체 생성 ==> 생성자 자동 호출
		GoodStock good = new GoodStock("p123456",150); //기본 생성자 호출
		
		System.out.println("현재 재고수량 "+good.stockNum);
	
	//if상품 판매 10
		good.subtrackStock();
	
	}

}
