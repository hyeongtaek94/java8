package Day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();	//임포트
		map.put("국어", 80);
		map.put("영어", 97);
		map.put("수학", 79);
		map.put("과학", 82);
		
		System.out.println(map.containsKey("국어"));
		System.out.println(map.containsValue(90));
		System.out.println(map.isEmpty());
		System.out.println();
		
		Set<String> keySet = map.keySet();	//임포트
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		map.put("과학", 80);
		keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
			//값은 키값을 중복해서 추가하면 덮어써진다.
	}
		System.out.println();
		
		Set<Entry<String, Integer>>entrySet = map.entrySet();	//util로 임포트
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String key =entry.getKey();
			int score = entry.getValue();
			System.out.println(key + " : " + score);
		}
		
		int num = map.remove("수학");
		System.out.println(num);
		keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
	}
		System.out.println();
		
		boolean isEntry = map.remove("과학", 79);
		System.out.println(isEntry);
		keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		isEntry = map.remove("과학", 80);
		System.out.println(isEntry);
		keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
	}
		System.out.println();
		if(!map.isEmpty()) {
			map.clear();
			
		}
		System.out.println(map.size());
}
}