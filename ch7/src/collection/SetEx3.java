package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
public static void main(String[] args) {
	//Person객체를 set구조에 담기
	
	Set<Person> set= new HashSet<>();
	
	set.add(new Person("David",10));
	set.add(new Person("David",10));
System.out.println(set);
}
}
