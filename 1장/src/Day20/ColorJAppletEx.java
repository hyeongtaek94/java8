package Day20;

import java.awt.Color;

import javax.swing.JFrame;

public class CorlorAppletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("색상 변환 예제");
		ColorJApplet p = new ColorJApplet();
		p.init();
		
		f.setSize(500, 500);
		f.setBackground(Color.orange);	//배경색
//		f.setTitle("애플릿 첫 예제);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		f.add(p);
		f.setVisible(true);
	}
}
