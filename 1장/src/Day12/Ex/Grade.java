package Day12.Ex;

public class Grade {
	//�ʵ�
	int kor, eng, mat;
	
	
	//������
	Grade(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}
	
	//�޼���
	int avg() {
		int sum = kor + eng + mat;
		return (int) (sum / 3.0);
	}
	
}
