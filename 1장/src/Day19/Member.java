package Day19;

public class Member {
	private String name;
	private String Id;
	private Address address;
	
	public Member(String name, String id, Address address) {
		super();
		this.name = name;
		this.Id = id;
		this.address = address;
		
	}
	
	public String getName() { return name; }
	public String getId() { return Id; }
	public Address getAddress() { return address; }
}
