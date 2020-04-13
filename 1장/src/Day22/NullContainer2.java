package Day22; //p.432 2번

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NullContainer2 extends JFrame implements ActionListener {
	JPanel panel;
	Card cards;

	public NullContainer2() {
		setTitle(" CardiLayout");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 5, 10, 0));	//0줄, 5칸, 가로간격 10, 세로간격 0
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("종료", panel);

		add(panel, "North");
		cards = new Card();
		add(cards, "Center");
		setVisible(true);
	}

	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);

	}

	private class Card extends JPanel {
		CardLayout layout; // 카드레이아웃

		public Card() {
			layout = new CardLayout();
			setLayout(layout);
			for (int i = 1; i <= 10; i++)
				add(new JButton("현재 카드의 번호 -> " + i), "Center");
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("종료"))
			System.exit(0);
		if (e.getActionCommand().equals("<<"))
			cards.layout.first(cards);
		if (e.getActionCommand().equals("<"))
			cards.layout.previous(cards);
		if (e.getActionCommand().equals(">"))
			cards.layout.next(cards);
		if (e.getActionCommand().equals(">>"))
			cards.layout.last(cards);
	}

	public static void main(String[] args) {
		NullContainer2 uc = new NullContainer2();
	}
}
