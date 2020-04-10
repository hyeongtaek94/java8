package Day21; //버튼

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		p2.add(new JButton("버튼1"));
		p2.add(new JButton("버튼2"));
		p2.add(new JButton("버튼3"));
		
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p1.add(p2);
		
		
		f.add(p1);
		f.setLayout(new FlowLayout());
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}