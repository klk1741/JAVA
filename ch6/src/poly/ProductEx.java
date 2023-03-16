package poly;

public class ProductEx {

	public static void main(String[] args) {
		Buyer buyer= new Buyer();
		//tv구매하다
		//Tv1 tv1 = new Tv1();
		//buyer.buy(tv1);
		
	buyer.buy(new Tv1());
		
		//  Computer computer= new Computer();
	//buyer.buy(computer);
	buyer.buy(new Computer());
	System.out.println("현재 남은 돈은"+ buyer.money+"만원입니다.");
	System.out.println("현재 보너스 점수는"+ buyer.bonusPoint+"만원입니다.");
	}

}
