package Day14;

public class CellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("������S20", "����", 10);
		dcp.powerOn();							//�θ��� �޼ҵ�
		dcp.bell();								//�θ��� �޼ҵ�
		dcp.sendVoice("��������.");				//�θ��� �޼ҵ�
		dcp.receiveVoice("�ù��Դϴ�.");		//�θ��� �޼ҵ�
		dcp.sendVoice("���տ� ���� �ּ���.");	//�θ��� �޼ҵ�
		dcp.receiveVoice("�˰ڽ��ϴ�");			//�θ��� �޼ҵ�
		dcp.hanUp();							//�θ��� �޼ҵ�
		dcp.turnOnDmb();						//�ڽ��� �޼ҵ�
		dcp.setChannel(100);					//�ڽ��� �޼ҵ�
		dcp.turnOffdmb();						//�ڽ��� �޼ҵ�
		dcp.powerOff();							//�θ��� �޼ҵ�
		
		CellPhone cp = new CellPhone();
		cp.powerOn();
//		cp.turnOndmb();	�θ��� ��ü�� �ڽ��� �ν��Ͻ� ����� ȣ���Ҽ� �����ϴ�.
		cp.powerOff();
	}
}
