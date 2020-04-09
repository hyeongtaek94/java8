package Day20;

import javax.swing.JFrame;

public class ParamJappletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("애플릿 첫 예제");
		ParamJApplet p = new ParamJApplet();
		p.init("Java");//init = initialize 초기화
		
		f.setSize(500, 500);
//		f.setTitle("애플릿 첫 예제);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//EXIT_ON_CLOSE 우측상단 x표 
		f.add(p);										//(창닫는건데 기본적으로 누르면 닫힘)
		f.setVisible(true);
	}
}
