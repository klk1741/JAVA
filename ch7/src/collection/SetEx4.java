package collection;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {

	public static void main(String[] args) {
Set<Integer> set= new TreeSet<>();

for (int i = 0; set.size()<6; i++) {
	int num= (int)(Math.random()*45)+1;
	set.add(num);
	
}
//정렬 필요없음
System.out.println(set);
	}

}
