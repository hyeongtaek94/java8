package Day15;

public class RemoteControlEx {
	public static void main(String[] ags) {
		RemoteControl.changeBattery();
		TV tv = new TV();
		Audio audio = new Audio();
//		RemoteControl rc = new RemoteControl(); //�������̽��� �����ڰ� �����ϴ�.
		RemoteControl rc;	//������ ������ �� �ֽ��ϴ�.
		rc = tv;	//�������̽� �������� ���� Ŭ������ ��ü�� ���Ե˴ϴ�.
		rc = new TV();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc = audio;
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc = new RemoteControl() {		//�͸�����ü, �ѹ��� ��밡��, Ŭ��������̾ƴ϶� �ٽû��Ұ�
										//��ư�̳� �׼����ٶ� ���̻����
			@Override
			public void turnOn() {
				System.out.println("���Ϸ��� �մϴ�.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("���Ϸ��� ���ϴ�.");
				
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("�µ��� �ܰ踦 " + volume + "�ܰ�� �����մϴ�.");
			}
			
		};	//�͸� ���� ��ü �߰�ȣ�� ������ �����ݷ��� ���ߵ�
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc = new IpTV();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc = new IpTV2();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
	}
}
