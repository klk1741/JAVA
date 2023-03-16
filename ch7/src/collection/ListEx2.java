package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 {

	public static void main(String[] args) {
//ArrayList에 Member 객체 추가
		ArrayList<Member2> list= new ArrayList<>();
	      list.add(new Member2("홍길동"));
	      list.add(new Member2("김김김"));
	      list.add(new Member2("이이이"));
	      list.add(new Member2("시시시"));
	      list.add(new Member2("박박박"));
		
	//Member1[] members = new Member1[10];
	//Members[0]= new Member1("");
	      System.out.println(list);
	      
	      //member2담는 arraylist생성
ArrayList<Member2> list2= new ArrayList<>();
	list2.add(new Member2("홍길동","hong123","hong123"));
	list2.add(new Member2("고길동","song123","hong123"));
	list2.add(new Member2("성춘향","sng123","hong123"));
	list2.add(new Member2("강감찬","kong123","hong123"));
	list2.add(new Member2("송혜교","ong123","hong123"));
	
	System.out.println(list2);
	
	System.out.println("size() "+list2.size());
	for (int i = 0; i < list2.size(); i++) {
		Member2 member = list2.get(i);
		
	}
	
	//Iterator 인터페이스 :List,Set,Map구조에서 요소를 꺼내 쓰는 방법에 대답에대한 통일성 제공
	//hasNext(): 다음요소가 존재하는 경우 true;
	//next(): 요소 가져오기
	for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
		Member2 member2 = (Member2) iterator.next();
		
	}
	
	for (Member2 member2 : list2) {
		
	}
	}

}
