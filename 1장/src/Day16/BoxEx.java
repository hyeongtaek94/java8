package Day16;

public class BoxEx {
	public static void main(String[] args) {
		String name = "홍길동";
		Box box = new Box();
		box.set(name);	//String ->object로 자동형변환
		String name2 = (String)box.get();	//Object ->String 강제형변환
		System.out.println(name2);
		
		Apple apple = new Apple();
		System.out.println(apple.hashCode());
		box.set(apple);	//Apple ->Object 자동형변환
		Apple apple2 = (Apple)box.get();	//Object -> Apple 강제형변환
		System.out.println(apple2.hashCode());
	}
}
