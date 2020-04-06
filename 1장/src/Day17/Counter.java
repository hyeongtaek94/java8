package Day17;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	protected void finalize() throws Throwable{
			System.out.println(no + "ºó °´Ã¼ÀÇ finallize()°¡ ½ÇÇàµÊ");
		
	}
}
