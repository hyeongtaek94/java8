package Day12;

public class Earth {
	static final double EARTH_RADIUS = 6400;	//상수값 적을때 대문자표기는
	static final double EARTH_SURFACE_AREA;		// 프로그래머들끼리의 약속 덧붙여쓸때 스네이크기법 (_)
	
	static {	//8버전에서 썻던거.
		EARTH_SURFACE_AREA = 4 * Math.PI
		*EARTH_RADIUS * EARTH_RADIUS;
	}
}
