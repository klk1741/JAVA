package inheritance;

public class CheckingAccount extends Account {

	//은행계좌+체크카드
	private String cardNo;
	public CheckingAccount(String ano, String owner, int balance, String cardNo) {
		super(ano, owner, balance);
		this.cardNo= cardNo;
		
		}

	//체크카드 사용액 지불
	//카드번호,사용액을 매개변수로 받아서 은행잔고보다 작은경우 사용액을 지불
	//카드번호 일치 확인
	
	//은행잔고보다 크거나 카드번화가 일치하지 않으면 지불불가 메시지 출력
	
	//pay(cardNo,amount): 잔액 리턴
	int pay(String cardNo, int amount) {
		
		//잔액 = 잔액-사용액
		if(!this.cardNo.equals(cardNo)|| getBalance()<amount ) {
			System.out.println("카드번호나 잔액 확인");
			return 0;
				}
		//잔액= 잔액-사용액
//			setBalance(getBalance()-amount);
//			return getBalance();
		//부모의 메소드 호출가능
		return super.withdraw(amount);
	}
	

		
	}

	
	
	
	
	

