package Day13;	//Getter, Setter (java bin)

public class Student {
	private String name;	//�̸� //�ܺο��� �����Ҽ� ������ private ����
	private String gender;	//����
	private int age;		//����
	private int sNo;		//�й�

	public Student(String name, String gender, int age, int sNo) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.sNo = sNo;
	}
	public Student() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getsNo() {
		return sNo;
	}
	
	public void setsNo(int sNo) {
		if(gender.equals("����")) {
			sNo += 2000;
		} else {
			sNo += 1000;
		}
		this.sNo = sNo;
	}
	
	public void showInfo() {
		System.out.println("����: " + name);
		System.out.println("����: " + gender);
		System.out.println("����: " + age);
		System.out.println("�й�: " + sNo);
	}
}
