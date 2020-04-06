package Day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("사과");
		list.add("배");
		list.add("포도");
		list.add("멜론");
		list.add("멜론");
		for(String str : list) {
			System.out.println(str);	//list는 중복이되는데
		}
		System.out.println();
		
		Set<String> set = new HashSet<>();
		set.add("사과");
		set.add("배");
		set.add("포도");
		set.add("멜론");
		set.add("멜론");
		for(String str : set) {	
			System.out.println(str);	//set은 중복되지않습니다.
		}
		System.out.println(set.contains("사과"));	//사과가 있냐?
		System.out.println(set.isEmpty());			//비었냐?
		if(!set.isEmpty()) {		//비어있지않다면
			set.clear();			//clear하라
		}
		System.out.println(set.size());
		
		System.out.println();
		Iterator<String> iterator = list.iterator();		//컬렉션 공통 메소드
		while(iterator.hasNext()) {	//다음번이있다면
			String str = iterator.next();
			System.out.println(str);
		}
		
	}
}
