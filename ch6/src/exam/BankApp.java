package exam;

import java.util.Scanner;

import ch6.Account;

public class BankApp {

	public static Account[] accountArray= new Account[10];
	public static Scanner scanner =  new Scanner(System.in);


private static void createAccount() {
	//계좌생성, Account 인스턴스를 생성하기 값을 입력받기
	System.out.println("계좌번호>> ");
	String ano= scanner.nextLine();
	
	System.out.println("예금주 >>");
    String owner = scanner.nextLine();
    
    System.out.println("잔액 >> ");
    int balance = Integer.parseInt(scanner.nextLine());
	//for문 돌려서 i 에 해당하는 배열 초기값이 null이면 수행
	//한번만 수행되고 빠져 나오도록 해야함
    for (int j = 0; j < accountArray.length; j++) {
		
    	if(accountArray[j]==null)
    	accountArray[j]= new Account(ano,owner,balance); 
    	System.out.println("계좌가 생성되었습니다.");
    	break;
}
	}
	
private static void accountList() {
	
	System.out.println();
	System.out.println("계좌목록");
	System.out.println("----------------");
	
	
	for (int j = 0; j < accountArray.length; j++) {
			
	    	if(accountArray[j]!=null)
	    	  	System.out.printf("%s\t%s\t%d\n",accountArray[j].getAno(),accountArray[j].getOwner(),accountArray[j].getBalance());
	    	
}
private static void deposit() {
	//예금하다 - 계좌번호,예금액 입력받기
	System.out.println("계좌번호 >> ");
	String ano= scanner.nextLine();
	System.out.println("예금액>> ");
	int amount = Integer.parseInt(scanner.nextLine());
	
	for (int i = 0; i < accountArray.length; i++) {
		if(accountArray[i]!=null) {
		if(accountArray[i].getAno().equals(ano)) {
			accountArray[i].setBalance(accountArray[i].getBalance()+amount);
		}
		}
		}
	}
	//accountArray 에서 일치하는 계좌를 찾아 잔액= 잔액+예금액
	
}
private static void withdraw() {

System.out.println("계좌번호 >> ");
String ano= scanner.nextLine();
System.out.println("출금액>> ");
int amount = Integer.parseInt(scanner.nextLine());

for (int i = 0; i < accountArray.length; i++) {
	if(accountArray[i]!=null) {
	if(accountArray[i].getAno().equals(ano)) {
		accountArray[i].setBalance(accountArray[i].getBalance()-amount);
	}
	}
	}

//accountArray 에서 일치하는 계좌(null이 아닌 계좌만)를 찾아 잔액= 잔액-출금액

}
	public static void main(String[]args) {
		
		
		
		
		
		
		
		
		boolean run = true;
		while(run)
			System.out.println("------------------------");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("--------------------------------");
		System.out.println("선택>>");

		int selectNo = scanner.nextInt();

		switch(selectNo) {
		case 1:
			createAccount();
			break;
		case 2:
			accountList();
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			run=false;
			break;
			default:
				break;
		}
	}

}

