package Day16;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;	
	}
	
	public String getName() { 
		return name; 
	}
	
	@Override		//�����ǵ�����.
	public String toString(){ 
		return name; 
		
	}
	
}
