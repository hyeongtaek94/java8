package Day22;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MouseEventDraw extends JPanel implements MouseListener{	//맨 밑에 5개 메소드
	int noval=0;
	int[] x, y;
	
	public MouseEventDraw() {
		x=new int[50];
		y=new int[50];
		addMouseListener(this);	//this는 마우스이벤트드로우 구현
	}
	public void paint(Graphics g) {
		
		g.setColor(Color.blue);
		g.drawString("마우스를 클릭하면 사각형을 그림", 10, 10);
		g.setColor(Color.red);
		for (int i= 1; i<= noval; i++){
			g.drawRect(x[i] - 20,  y[i]-20, 50, 50);
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (noval < 50) {
			x[noval] = e.getX();
			y[noval] = e.getY();
			noval++;
		}
		repaint();
	}

	
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
}