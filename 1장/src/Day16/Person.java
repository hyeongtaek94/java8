package Day16;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;	
	}
	
	public String getName() { 
		return name; 
	}
	
	@Override		//재정의되있음.
	public String toString(){ 
		return name; 
		
	}
	
}
