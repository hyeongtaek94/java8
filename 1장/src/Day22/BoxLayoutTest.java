package Day22;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class BoxLayoutTest extends JFrame {
	public BoxLayoutTest() {
		super("박스 레이아웃");
		// 수평으로 컴포넌트 추가
		Box hBox = Box.createHorizontalBox(); // 수평으로 배열하는 박스
		hBox.add(Box.createHorizontalStrut(30)); // 고정크기 컴포넌트
		hBox.add(new JCheckBox("우리투자증권"));
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(new JCheckBox("삼성증권"));
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(new JCheckBox("대우증권"));
		hBox.add(Box.createGlue()); // 크기변환하는 컴포넌트
		JPanel lpanel = new JPanel(new BorderLayout()); // 보더레이아웃을 사용하는 패널
		lpanel.setBorder(new TitledBorder(new EtchedBorder(), "증권회사 구분")); // 외곽선 설정
		lpanel.add(hBox, BorderLayout.CENTER); // 패널에 박스 장착
		// 수평으로 컴포넌트 추가
		Box hhBox = Box.createHorizontalBox(); // 수평 박스
		hhBox.add(Box.createHorizontalStrut(30)); // 30픽셀 고정간격을 만들어주는 코v
		hhBox.add(new JCheckBox("국민은행"));
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(new JCheckBox("외환은행"));
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(new JCheckBox("기업은행"));
		hhBox.add(Box.createGlue());
		JPanel llpanel = new JPanel(new BorderLayout());
		llpanel.setBorder(new TitledBorder(new EtchedBorder(), "은행 구분"));
		llpanel.add(hhBox, BorderLayout.CENTER);

		// 수직으로 패널 추가
		Box cBox = Box.createVerticalBox(); // 수직박스
		cBox.add(lpanel); // 패널 추가
		cBox.add(llpanel); // 패널 추가
		add(cBox, BorderLayout.CENTER); // 프레임에 추가
	}

	public static void main(String[] args) {
		BoxLayoutTest blt = new BoxLayoutTest();
		blt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		blt.setSize(400, 200);
		blt.setVisible(true);
	}
}
