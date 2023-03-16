package shop;

import java.util.ArrayList;
import java.util.Scanner;


public class MyShop implements IShop {

	//쇼핑몰 이름
	private String title;

	//user 정보 저장 배열 ArrayList(cart)
	ArrayList<User> users= new ArrayList<>();
	//Product 정보 저장 배열ArrayList(cart)
	ArrayList<Product> products= new ArrayList<>();	
	//구매한 제품을 저장 ArrayList(cart)
	ArrayList<Product> carts= new ArrayList<>();	

  private int selUser;





	@Override
	public void setTitle(String title) {
		this.title=title;

	}

	@Override
	public void genUser() {


		//User2명 생성 후 배열에 저장
		users.add(new User("홍길동", PayType.CASH);
		users.add(new User("성춘향", PayType.CARD);
	}

	@Override
	public void genProduct() {
		//Product 4개 생성 후 배열에 저장
		products.add(new CellPhone("아이폰13",1000000,"SKT"));
		products.add(new CellPhone("갤럭시S22",1000000,"KT"));
		products.add(new SmartTv("삼성스마트",1000000,"해상도4K"));
		products.add(new SmartTv("LG 스마트 티비",1000000,"FULL HD"));


	}

	@Override
	public void start() {
		System.out.println(title+" : 메인화면-계정 선택");
		System.out.println("============================");	

		
		int i=0;
		for(User user: users) {
			System.out.printf("[%d] %s(%s)\n",i++, users.getName(),users.getPayType());

		}
		System.out.println("[x] 종  료");
		System.out.print("선택: ");
		String sel = sc.nextLine();
		System.out.println("## "+sel+" 선택 ##");
		System.out.println();


		// 0 or 1 ==> productList()호출
		//다른걸 입력시 ==> 메뉴를확인해 주세요

		switch (sel) {
		case "x": case"X":
			System.exit(0);  //프로그램 종료
			break;
		case "0" : case "1" :
			selUser= Integer.parseInt(sel);
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해 주세요\n");
			start();
			break;
		}



	}

	public void productList() {
		System.out.println(title + "상품 목록 - 상품 선택");
		System.out.println("===============================");

		//products 배열출력
	int i=0;
	
for(Product product:products){
	System.out.print(i++);
	
	
	
	System.out.printf("[%d]",i);
			products[i].printDetail();
			products[i].printExtra();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		String sel= sc.nextLine();
		// 상품 선택시 0~3=> cart 제품 추가, productlist() 호출
		//  h=> start 메소드 호출, c=>checkOut()호출

		switch (sel) {
		case "0": case "1": case"2": case"3":
			for (int i = 0; i < products.length; i++) {
				if(carts[i]==null) {
					carts[i]=products[Integer.parseInt(sel)];
					break;
				}
			}
			productList();
			break;
		case "h":
			start();
		case"c":
			checkOut();
		default:
			break;
		}}



	public void checkOut() {
		System.out.println(title + "체크아웃");
		System.out.println("===============================");
		int total=0;
		for (int i = 0; i < carts.length; i++) {
			if(carts[i]==null) {
				System.out.printf("[%d] %s(%d)\n", i,carts[i].getName(),carts[i].getPrice());				
				total+=carts[i].getPrice();
			}

		}
		System.out.println("===================");
		System.out.println("결제 방법 : "+ users[selUser].getPayType());
		System.out.println("결제 금액 : "+total);
		System.out.println("[p]이전, [q] 결제완료");
		System.out.println("선택: ");
		String sel= sc.nextLine();

		//P 일때 productList() 호출
		//q 일때 결제가 완료되었습니다. 프로그램 종료
		// 잘못 입력시 checkOut() 호출
		
	switch (sel) {
	case "p": case"P":
		productList();
		break;
	case "q": case"Q":
	System.out.println("결제가 완료되었습니다.");
	System.exit(0);  
	break;
	default:
		checkOut();
		break;
	}
	}}
