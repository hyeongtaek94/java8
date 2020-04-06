package Day17;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class EnumerationEx {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("사과");
		v.add("배");
		v.add("복숭아");
		
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String fruit = e.nextElement();
			System.out.println(fruit);
		}
		
		
		Hashtable<String, Integer> h = new Hashtable<>();
		h.put("국어", 90);
		h.put("영어", 90);				//hashtable에서 enumeration을 쓰면 key값은 사라짐, value값만 남음
		h.put("수학", 90);
		
		Enumeration<Integer> he = h.elements();
		while(he.hasMoreElements()) {
			int score = he.nextElement();
			System.out.println(score);
		}
		
		Set<Entry<String, Integer>> entry = h.entrySet();	//java util 임포트
		Iterator<Entry<String, Integer>> iterator = entry.iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer>en = iterator.next();
			String subject = en.getKey();
			int score = en.getValue();
			System.out.println(subject + " : " + score);
		}
	}
}
