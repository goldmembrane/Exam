package Swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 {
	public static void main(String[] args) {
		JFrame j = new JFrame();

		// 요소 배치 설정
		j.setLayout(new FlowLayout());

		JButton b1 = new JButton("버튼1");
		b1.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JButton b = (JButton)e.getSource(); // 버튼
				String text = b.getText();
				System.out.println(text);
			}
		});
		JButton b2 = new JButton();
		b2.setText("버튼2");

		// 버튼 추가
		j.add(b1);
		j.add(b2);
		// 크기 지정 (w,h)
		j.setSize(200, 100);
		// 끄게 만드는 장치
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 보이기
		j.setVisible(true);
	}
}
