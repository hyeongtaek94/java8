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
		
		JFrame f = new JFrame("�޴� ����");
		JMenuBar jmb = new JMenuBar();
		
		JMenu j1 = new JMenu("����");
		JMenu j2 = new JMenu("����");
		JMenu j3 = new JMenu("����");
		
		JMenuItem ji1 = new JMenuItem("���θ����");
		JMenuItem ji2 = new JMenuItem("����");
		JMenuItem ji3 = new JMenuItem("����");
		j1.add(ji1);
		j1.add(ji2);
		j1.add(ji3);
		
		JMenuItem ji4 = new JMenuItem("�߶󳻱�");
		JMenuItem ji5 = new JMenuItem("����");
		JMenuItem ji6 = new JMenuItem("�ٿ��ֱ�");
		j2.add(ji4);
		j2.add(ji5);
		j2.add(ji6);

		JMenuItem ji7 = new JMenuItem("��������");
		JMenuItem ji8 = new JMenuItem("����ǥ����");
		j3.add(ji7);
		j3.add(ji8);
		
		jmb.add(j1);
		jmb.add(j2);
		jmb.add(j3);
		
		TextField tf = new TextField();
		tf.setEnabled(false);	//�Է¸��ϰ� ��
//		tf.setEditable(false);	������ Ŀ�������Ÿ�
		
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
