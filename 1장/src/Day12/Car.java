package Day12;

public class Car {
//	필드
	String company = "기아자동차";
	String model = "쏘울";
	String color = "파랑";
	int maxSpeed = 250;
	int speed = 0;
	
//	생성자
	Car() {							//생성자를 생성하지 않으면
//		this.company = "기아자동차";//기본생성자가 자동으로 작성됩니다.
//		this.color = "검정";
//		this.maxSpeed = 300; //생성자를 만들었다면 기본생성자는 만들어지지않는다
		this("기아자동차", "검정", 300);
	}
	
	Car(String company, String color, int maxSpeed)	{
		this.company = "기아자동차";
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car(String color, int maxSpeed)	{
		this("기아자동차", color, maxSpeed);
	
	}
	Car(int maxSpeed)	{
//		this.company = "기아자동차";
//		this.color = color;
//		this.maxSpeed = maxSpeed;
		this("기아자동차", "검정", maxSpeed);
	}

//	메소드(메서드)
	void accel() {
		speed += 10;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("현재 속도: " + speed);
	}
	
	void brake()	{
		speed = 0;
		System.out.println("현재 속도: " + speed);
	}


}
	


		
		
		
		
							//자바는 this를 붙여서 많이쓰고
//								ex)this.company= company;
//							//C언어는 언더바를 붙인다.
//	}
//	
//	Car(String company, int maxSpeed, String color) {
////		String, int, String
//	}
//	
//	Car(String color, int speed, int maxSpeed)	{
////		String, int, int
//	}
//	
//	Car(String company, String color, int maxSpeed, int speed)	{
//		//매개변수의 수를 늘릴수있음
//	}
//	Car(int max, String color, String company)	{
////		int, String, String
//		//	Car(String color, String company, int maxSpeed)	{	매개변수가 달라도 자료형이 같으면 입력불가합니다.

