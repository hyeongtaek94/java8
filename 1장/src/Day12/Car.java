package Day12;

public class Car {
//	�ʵ�
	String company = "����ڵ���";
	String model = "���";
	String color = "�Ķ�";
	int maxSpeed = 250;
	int speed = 0;
	
//	������
	Car() {							//�����ڸ� �������� ������
//		this.company = "����ڵ���";//�⺻�����ڰ� �ڵ����� �ۼ��˴ϴ�.
//		this.color = "����";
//		this.maxSpeed = 300; //�����ڸ� ������ٸ� �⺻�����ڴ� ����������ʴ´�
		this("����ڵ���", "����", 300);
	}
	
	Car(String company, String color, int maxSpeed)	{
		this.company = "����ڵ���";
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car(String color, int maxSpeed)	{
		this("����ڵ���", color, maxSpeed);
	
	}
	Car(int maxSpeed)	{
//		this.company = "����ڵ���";
//		this.color = color;
//		this.maxSpeed = maxSpeed;
		this("����ڵ���", "����", maxSpeed);
	}

//	�޼ҵ�(�޼���)
	void accel() {
		speed += 10;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("���� �ӵ�: " + speed);
	}
	
	void brake()	{
		speed = 0;
		System.out.println("���� �ӵ�: " + speed);
	}


}
	


		
		
		
		
							//�ڹٴ� this�� �ٿ��� ���̾���
//								ex)this.company= company;
//							//C���� ����ٸ� ���δ�.
//	}
//	
//	Car(String company, int maxSpeed, String color) {
////		String, int, String
//	}
//	
//	Car(String color, int speed, int maxSpeed)	{
////		String, int, int
//	}
//	
//	Car(String company, String color, int maxSpeed, int speed)	{
//		//�Ű������� ���� �ø�������
//	}
//	Car(int max, String color, String company)	{
////		int, String, String
//		//	Car(String color, String company, int maxSpeed)	{	�Ű������� �޶� �ڷ����� ������ �ԷºҰ��մϴ�.

