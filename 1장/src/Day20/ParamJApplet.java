package Day20;	//p345

import java.awt.Graphics;

import javax.swing.JPanel;

public class ParamJApplet extends JPanel {	//Panel�� ������Ʈ
	private static final long serialVersionUID = 1L; // Ŭ������ �����ѹ��� ����
														// Ŭ������ ��ü�� ������ ���۽�
														// �۽źο��� ���� Ŭ�������� Ȯ���ϱ�
														// ���Ͽ� ����մϴ�
														// ������� ������ �������� �����մϴ�.

	String title;

	public void init(String title) {
		this.title = title;
		if (title == null)
			title = "���޹��� �μ��� ����. ";
	}

	public void paint(Graphics g) {
		g.drawString(title, 100, 100);	//100�ȼ��� 100�ȼ��� ��ġ
	}
}
