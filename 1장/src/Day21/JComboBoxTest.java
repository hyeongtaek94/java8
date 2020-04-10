package Day21; //체크박스와 콤보박스

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
	String[] title = { "C", "비주얼베이직", "JAVA 프로그래밍", "자료구조", "이산수학" };

	JComboBoxTest() {
		super("콤보 박스 만들기");
		setLayout(new FlowLayout());
		jp1 = new JPanel();
		jcb1 = new JCheckBox("컴퓨터공학", true); // 체크
		jcb2 = new JCheckBox("전자상거래", true); // 체크
		jcb3 = new JCheckBox("경영학", false); // 체크x
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		add(jp1);
		jcm1 = new JComboBox(title);
		add(jcm1);
		setSize(300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jcm1 = new JComboBox<String>(new String[] { "홍길동", "김철수" });
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
