package Day22;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class EX1002{
	public static void main(String[] args) {
		
		JFrame f = new JFrame("메뉴 예제");
		JMenuBar jmb = new JMenuBar();
		
		JMenu j1 = new JMenu("파일");
		JMenu j2 = new JMenu("편집");
		JMenu j3 = new JMenu("보기");
		
		JMenuItem ji1 = new JMenuItem("새로만들기");
		JMenuItem ji2 = new JMenuItem("열기");
		JMenuItem ji3 = new JMenuItem("저장");
		j1.add(ji1);
		j1.add(ji2);
		j1.add(ji3);
		
		JMenuItem ji4 = new JMenuItem("잘라내기");
		JMenuItem ji5 = new JMenuItem("복사");
		JMenuItem ji6 = new JMenuItem("붙여넣기");
		j2.add(ji4);
		j2.add(ji5);
		j2.add(ji6);

		JMenuItem ji7 = new JMenuItem("도구모음");
		JMenuItem ji8 = new JMenuItem("상태표시줄");
		j3.add(ji7);
		j3.add(ji8);
		
		jmb.add(j1);
		jmb.add(j2);
		jmb.add(j3);
		
		TextField tf = new TextField();
		tf.setEnabled(false);	//입력못하게 함
//		tf.setEditable(false);	같은데 커서깜빡거림
		
		f.add(tf, BorderLayout.SOUTH);
		f.setJMenuBar(jmb);
		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener listener = e -> tf.setText(e.getActionCommand());
		ji1.addActionListener(listener);
		ji2.addActionListener(listener);
		ji3.addActionListener(listener);
		ji4.addActionListener(listener);
		ji5.addActionListener(listener);
		ji6.addActionListener(listener);
		ji7.addActionListener(listener);
		ji8.addActionListener(listener);
	}
}
