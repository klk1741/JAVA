package inheritance;

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
//예금하다
//void deposit(int amount) : 잔액= 잔액+입금액
public void deposit(int amount) {
	this.balance+=amount;
}




//출금하다
//int withdraw(int amount): 잔액=잔액-출금액
//잔액>출금액 경우만
//현재 잔액 리턴
public int withdraw(int amount) {
	if(this.balance>amount) {
		balance-=amount;
		}
	else {
		System.out.println("잔액이 부족합니다.");
	}
 return balance;
}





public String getAno() {
	return ano;
}
public void setAno(String ano) {
	this.ano= ano;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner= owner;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance=balance;
}







}

	