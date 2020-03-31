package Day12.Ex;

public class Grade {
	//필드
	int kor, eng, mat;
	
	
	//생성자
	Grade(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}
	
	//메서드
	int avg() {
		int sum = kor + eng + mat;
		return (int) (sum / 3.0);
	}
	
}
