package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {

		HashMap<String,Integer>map=  new HashMap<>();
		map.put("김자바", 90);
		map.put("홍자바", 95);
		map.put("박자바", 100);
		map.put("이자바", 70);
		map.put("최자바", 80);
		map.put("표자바", 90);
	
		//entrySet(): map => Entry =>set 구조로 변환
		//Entry: 키와 값의 결합
		Set<Entry<String,Integer>> set= map.entrySet();
Iterator<Entry<String,Integer>> it=set.iterator();
while (it.hasNext()) {
	Map.Entry<String,Integer> entry = (Map.Entry<String,Integer>) it.next();
	System.out.println("이름: "+entry.getKey()+"점수 :"+entry.getValue());
}

//위의 코드는 Map 컬렉션에서 Entry 요소들을 순회하면서, 각 요소의 Key와 Value 값을 출력하는 방법을 보여줍니다.
//먼저, "map.entrySet()" 메서드를 호출하여 Map 컬렉션에서 Key-Value 쌍인 Entry 객체들을 담은 Set 컬렉션인 "set"을 얻습니다. 
//그리고 "set.iterator()" 메서드를 호출하여 "set" 컬렉션의 요소를 순회할 수 있는 Iterator 객체 "it"를 얻습니다.
//그 다음으로, "it.hasNext()" 메서드를 사용하여 Iterator 객체 "it"가 다음 요소를 가지고 있는지 확인합니다. 
//다음 요소가 있다면, "it.next()" 메서드를 사용하여 다음 요소를 가져옵니다. 이때, 가져온 요소는 "Map.Entry" 타입의 객체이므로, "Map.Entry<String,Integer>"로 캐스팅하여 "entry" 변수에 할당합니다.
//마지막으로, "entry.getKey()"와 "entry.getValue()" 메서드를 사용하여 Key와 Value 값을 가져와서 출력합니다. 이렇게 순회하면서 각 요소의 Key와 Value 값을 출력할 수 있습니다.
//따라서, 위의 코드는 Map 컬렉션에서 Entry 요소들을 순회하면서, 각 요소의 Key와 Value 값을 출력하는 방법을 보여줍니다.


		//keySet(): map에서 키값만 가져오기
		Set<String> keys = map.keySet(); 
		System.out.println("참가자 명단"+keys);
		//values() : map에서 value값만 가져오기
		Collection<Integer>values = map.values();
	System.out.println("점수"+values);
	//Collections : 클래스,Collection에 사용할 메소드를 갖고있음
	
	
	//총점,평균,최고최저점
	int total=0;
	Iterator<Integer> it2= values.iterator();
	while (it2.hasNext()) {
		total += it2.next();
		
	}
	System.out.println("총점: "+total);
	System.out.println("평균: "+(float)total/set.size());
	System.out.println("최고 점수: "+Collections.max(values));
	System.out.println("최저 점수: "+Collections.min(values));
	
	}

}
