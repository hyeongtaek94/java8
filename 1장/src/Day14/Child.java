package Day14;

public class Child extends Parent{
	Child(String name){
		super(name);
//		super();	// 명시하지않으면 자동으로 생성됩니다.
					// super가 있기때문에 부모를 불러올수있음.
					// 나는 this 부모는 super
		System.out.println("자식을 생성합니다");
	}
}
//default 생성자가 부모에 없다면 자식에 생성자 값을 적어줘야함