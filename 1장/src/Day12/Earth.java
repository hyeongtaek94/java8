package Day12;

public class Earth {
	static final double EARTH_RADIUS = 6400;	//����� ������ �빮��ǥ���
	static final double EARTH_SURFACE_AREA;		// ���α׷��ӵ鳢���� ��� ���ٿ����� ������ũ��� (_)
	
	static {	//8�������� ������.
		EARTH_SURFACE_AREA = 4 * Math.PI
		*EARTH_RADIUS * EARTH_RADIUS;
	}
}
