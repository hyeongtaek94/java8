package Day12;

public class StaticBlock {
	static String company = "�Ｚ";
	static String kind = "LCD";
	static String product = company + "-" + kind;	//1.9�������� �Ѿ�鼭
	static String pro2;								// 8���������� ������ �����
														//		�������� ������
	static {											//	<�Ѧ��� 8����������
		pro2 = company + "-" + kind;					//		  �������߾�� ����.
	}
}
