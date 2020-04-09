package Day20;	//p345

import java.awt.Graphics;

import javax.swing.JPanel;

public class ParamJApplet extends JPanel {	//Panel은 컴포넌트
	private static final long serialVersionUID = 1L; // 클래스의 고유넘버를 지정
														// 클래스형 객체의 데이터 전송시
														// 송신부에서 동일 클래스임을 확인하기
														// 위하여 사용합니다
														// 명시하지 않으면 랜덤으로 생성합니다.

	String title;

	public void init(String title) {
		this.title = title;
		if (title == null)
			title = "전달받은 인수가 없음. ";
	}

	public void paint(Graphics g) {
		g.drawString(title, 100, 100);	//100픽셀에 100픽셀에 위치
	}
}
