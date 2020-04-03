package Day16;	//hash코드와 equals를 재정의 사용

public class KeyEx {
	public static void main(String[] args) {
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		
		System.out.println(k1 == k2);
		System.out.println(k1.equals(k2));
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
		
		
		System.out.println(k1);
	}
}
