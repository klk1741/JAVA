package ch6;

//상품관리
public class GoodStock {
//속성
	String node;//상품코드(p123456)
	int stockNum;//재고수량
	
	
	//생성자 하나도 명시x, 기본 생성자 알아서 생성
	public GoodStock(String node, int stockNum) {
		super();
		this.node = node;
		this.stockNum = stockNum;
	}
	
	
	//기능
	//재고수량 감소
	void addStock() {
		System.out.println("재고수량 증가");
	}
	//재고수량 증가
	void subtrackStock() {
		System.out.println("재고수량 감소");
	}
}
