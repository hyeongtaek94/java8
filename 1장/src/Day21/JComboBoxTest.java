package Day21; //üũ�ڽ��� �޺��ڽ�

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComboBoxTest extends JFrame {
	JCheckBox jcb1, jcb2, jcb3;
	JComboBox jcm1;
	JPanel jp1;
	String[] title = { "C", "���־�����", "JAVA ���α׷���", "�ڷᱸ��", "�̻����" };

	JComboBoxTest() {
		super("�޺� �ڽ� �����");
		setLayout(new FlowLayout());
		jp1 = new JPanel();
		jcb1 = new JCheckBox("��ǻ�Ͱ���", true); // üũ
		jcb2 = new JCheckBox("���ڻ�ŷ�", true); // üũ
		jcb3 = new JCheckBox("�濵��", false); // üũx
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		add(jp1);
		jcm1 = new JComboBox(title);
		add(jcm1);
		setSize(300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jcm1 = new JComboBox<String>(new String[] { "ȫ�浿", "��ö��" });
		jcm1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = (String) jcm1.getSelectedItem();
				System.out.println(str);
			}
		});
	}

	public static void main(String[] args) {
		new JComboBoxTest();
	}
}
