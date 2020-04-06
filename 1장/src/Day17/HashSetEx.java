package Day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("���");
		list.add("��");
		list.add("����");
		list.add("���");
		list.add("���");
		for(String str : list) {
			System.out.println(str);	//list�� �ߺ��̵Ǵµ�
		}
		System.out.println();
		
		Set<String> set = new HashSet<>();
		set.add("���");
		set.add("��");
		set.add("����");
		set.add("���");
		set.add("���");
		for(String str : set) {	
			System.out.println(str);	//set�� �ߺ������ʽ��ϴ�.
		}
		System.out.println(set.contains("���"));	//����� �ֳ�?
		System.out.println(set.isEmpty());			//�����?
		if(!set.isEmpty()) {		//��������ʴٸ�
			set.clear();			//clear�϶�
		}
		System.out.println(set.size());
		
		System.out.println();
		Iterator<String> iterator = list.iterator();		//�÷��� ���� �޼ҵ�
		while(iterator.hasNext()) {	//���������ִٸ�
			String str = iterator.next();
			System.out.println(str);
		}
		
	}
}
