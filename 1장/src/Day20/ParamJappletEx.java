package Day20;

import javax.swing.JFrame;

public class ParamJappletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("���ø� ù ����");
		ParamJApplet p = new ParamJApplet();
		p.init("Java");//init = initialize �ʱ�ȭ
		
		f.setSize(500, 500);
//		f.setTitle("���ø� ù ����);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//EXIT_ON_CLOSE ������� xǥ 
		f.add(p);										//(â�ݴ°ǵ� �⺻������ ������ ����)
		f.setVisible(true);
	}
}
