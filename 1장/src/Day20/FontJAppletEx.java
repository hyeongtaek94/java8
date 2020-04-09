package Day20;

import javax.swing.JFrame;

public class FontJAppletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("폰트 설정 예제");
		FontJApplet p = new FontJApplet();
		p.init();
		
		f.setSize(600, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		f.add(p);
		f.setVisible(true);
	}
}
