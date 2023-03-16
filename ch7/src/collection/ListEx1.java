package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*컬렉션 프레임웤
 * 컬렉션: 여러 데이터들을 모아놓은것
 * framework: 표준화, 정형화된 프로그래밍 방식
 *라이브러리: 공통으로 사용될만한 유용한 기능을 모듈화
 *
 *     Collection
 *List              Set
 *
 *Map
 *
 *List 인터페이스: 순서가 존재함,데이터 중복을 허용
 *구현클래스: ArrayList, LinkedList,Stack, Vector...
 *Set 인터페이스: 순서를 유지하지않음, 데이터 중복허용x
 *구현클래스: HashSet,TreeSet...
 *Map 인터페이스: key,value의 쌍으로 이루어진 데이터집합, 순서유지x, key는 중복x value 중복 허용
 *구현클래스: HashMap,TreeMap,Hashtable,Properties.....
 *
 *
 *<E>or<T>,<K,V>: 지네릭스 개념 ==> 타입지정
 *E: element 타입지정
 *
 *타입:참조 타입만 지정가능
 */
public class ListEx1 {
   public static void main(String[] args) {
  List<Integer> list= new ArrayList<>();
  ArrayList<String>list2= new ArrayList<>();
	
  System.out.println("size() "+list.size()); //배열의 length와 같은 개념
  System.out.println("isEmpty() "+list.isEmpty());
   
  
  //add() : 요소추가
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);
  
  list2.add("자바");
  list2.add("html");
  list2.add("script");
  list2.add("서블릿");
  list2.add("자바");
  System.out.println(list);
  System.out.println(list2);
 
  String fruits[]= {"사과","포도","메론","딸기","바나나"};
  //배열=>리스트로 변환
  List<String>list3= Arrays.asList(fruits);
  System.out.println(list3);
  
  list2.add("참외");
  System.out.println(list2);
  
  List<String>list4= new ArrayList<>(Arrays.asList(fruits));
  System.out.println(list3);
  
  list4.add("참외");
  System.out.println(list4);

//remove()
  list2.remove(2);
  System.out.println("특정위치 요소 제거 후"+list2);
   
   list4.remove("바나나");
   System.out.println("특정위치 요소 제거 후"+list4);

   //get(int index)
   System.out.println("특정 위치 요소 가져오기 "+list2.get(0));
  
   //indexOf(Object o)
   System.out.println("특정 요소의 위치 가져오기 "+list2.indexOf("서블릿"));
   
   //sort
   Collections.sort(list4);
   System.out.println("정렬 후 "+list4);
   list.sort(Comparator.reverseOrder());
   System.out.println("정렬 후 "+list);
   }
   
}