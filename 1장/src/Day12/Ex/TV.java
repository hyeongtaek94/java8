package Day12.Ex;

public class TV {
	//�ʵ�
	String company;
	int year;
	int inch;
	
	//������
	TV(String company, int year, int inch){
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	//�޼���
	void show(){
		System.out.println(company + "���� ���� " + year + "���� " + inch + "��ġ TV");
		
	}
}
