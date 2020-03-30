package Day12;

public class Person {
	void sound() {
		System.out.println("말하다");
	}
	
	void run() {
		System.out.println("달리다");
	}
	
	void eat() {
		System.out.println("음식을 먹다.");
	}
	
	void oneDay() {
//		Person person = new Person();
//		person.sound();
		this.sound();	//내부에서 사용하는건 상관없다.	
		run();		//위에 sound처럼 this가 생략되있다.
		eat();		
					//메소드는 한가지씩 만들어주는게 좋다.
	}
}
