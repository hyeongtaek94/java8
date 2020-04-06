package Day17;

public class finalizeEx {
	public static void main(String[] args) {
		Counter counter = null;
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			counter = null;	//counter 객체를 쓰레기로 만듬
			System.gc();	//쓰레기 수집기 실행 요청
		}	//호출한다고 계속 비우는건아님, 알아서판단하고 작동함
			//순서가 랜덤으로 실행됨
	}
}
