package Day18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
	private static List<Student2> list = Arrays.asList(
			new Student2("ȫ�浿", "����", 90),
			new Student2("�����", "����", 90),
			new Student2("���ڹ�", "����", 95),
			new Student2("���ѳ�", "����", 92)
			
		);
	
	
		public static double avg(Predicate<Student2> predicate) {
			int count = 0, sum = 0;
			for(Student2 Student2 : list) {
				if(predicate.test(Student2)) {
						count++;
						sum += Student2.getScore();
				}
			}
			return (double) sum/ count;
		}
		
		public static void main(String[] args) {
			double maleAvg = avg(t -> t.getSex().equals("����"));
			System.out.println("���� ��� ����: " + maleAvg);
			
			double femaleAvg = avg(t -> t.getSex().equals("����"));
			System.out.println("���� ��� ����: " + femaleAvg);
		}
}
