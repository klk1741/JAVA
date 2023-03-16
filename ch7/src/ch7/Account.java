package ch7;

public class Account {
	//속성
	private String ano;//계좌번호(110-10-10000) accountNo
	private String owner;//계좌주(홍길동) owner
	private int balance;//잔액(정수) balance

	//기능- 예금(deposit),인출(withdraw)
	//예금: 현재잔액=잔액+예금액
	//인출: 현재잔액=잔액-출금액, 현재 잔액= 잔액-출금액
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	int deposit(int amount) {
		 {
			balance= balance+amount;
			return balance;
		}
	}
	int withdraw(int amount) {
		if(balance < amount) {
			//throw new RuntimeException("잔액부족");
		      throw new BalanceInsufficientException("잔액부족");
		}			
		balance-=amount;
			return balance;
		}
	}
