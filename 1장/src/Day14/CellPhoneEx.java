package Day14;

public class CellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("갤럭시S20", "레드", 10);
		dcp.powerOn();							//부모의 메소드
		dcp.bell();								//부모의 메소드
		dcp.sendVoice("여보세요.");				//부모의 메소드
		dcp.receiveVoice("택배입니다.");		//부모의 메소드
		dcp.sendVoice("집앞에 놓아 주세요.");	//부모의 메소드
		dcp.receiveVoice("알겠습니다");			//부모의 메소드
		dcp.hanUp();							//부모의 메소드
		dcp.turnOnDmb();						//자신의 메소드
		dcp.setChannel(100);					//자신의 메소드
		dcp.turnOffdmb();						//자신의 메소드
		dcp.powerOff();							//부모의 메소드
		
		CellPhone cp = new CellPhone();
		cp.powerOn();
//		cp.turnOndmb();	부모의 객체는 자신의 인스턴스 멤버를 호출할수 없습니다.
		cp.powerOff();
	}
}
