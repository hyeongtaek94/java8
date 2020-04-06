package Day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		
		list.add("사과");
		list.add("배");
		list.add("오렌지");
		list.add("파인애플");
		
		System.out.println(list.size());
		
		String str = list.get(0);
		System.out.println(str);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		list.add(2, "포도");
		for(String temp : list) {
			System.out.println(temp);
		}
		
		list.remove(1);
		for(String temp : list) {
			System.out.println(temp);		//숫자로도 삭제가능
	
		}
		System.out.println();
		
		list.remove("오렌지");				//값으로도 삭제가능
		for(String temp : list) {
			System.out.println(temp);
			
		}
		System.out.println();
		
		list.set(1, "참외");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
	}
		System.out.println(list.size());
		System.out.println();
		
		System.out.println(list.contains("참외"));
		System.out.println(list.contains("포도"));
		System.out.println(list.isEmpty());
		System.out.println();
		
		if(!list.isEmpty()) {
			list.clear();
		}
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println();
		
		int[] arr = new int[] {10, 20, 30, 40, 50};
		for(int num : arr) {
			if(num == 30) {
				System.out.println(true);
			}
		}
		System.out.println();
		
		List<Integer> arrList = Arrays.asList(10, 20, 30, 40, 50);
		System.out.println(arrList.contains(30));
	}
}