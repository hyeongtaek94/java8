package Day17;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	protected void finalize() throws Throwable{
			System.out.println(no + "�� ��ü�� finallize()�� �����");
		
	}
}
