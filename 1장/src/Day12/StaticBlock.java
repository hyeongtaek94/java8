package Day12;

public class StaticBlock {
	static String company = "삼성";
	static String kind = "LCD";
	static String product = company + "-" + kind;	//1.9버전으로 넘어가면서
	static String pro2;								// 8버전에서의 오류가 사라짐
														//		│연산을 쓰려면
	static {											//	<ㅡ─┘ 8버전에서는
		pro2 = company + "-" + kind;					//		  저렇게했어야 했음.
	}
}
