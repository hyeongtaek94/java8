package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		List <Integer>arrayList = new ArrayList<>();
		List <Integer>linkedlist = new LinkedList<>();
		
		System.out.println("ArrayList와 linkedList 비교");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000_000; i++) {
			arrayList.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList: " + (end - start) + "ms");
		
		System.out.println("ArrayList와 linkedList 비교");
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10_000_000; i++) {
			arrayList.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList: " + (end - start) + "ms");
	}
}