package Swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 {
	public static void main(String[] args) {
		JFrame j = new JFrame();

		// ��� ��ġ ����
		j.setLayout(new FlowLayout());

		JButton b1 = new JButton("��ư1");
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
				JButton b = (JButton)e.getSource(); // ��ư
				String text = b.getText();
				System.out.println(text);
			}
		});
		JButton b2 = new JButton();
		b2.setText("��ư2");

		// ��ư �߰�
		j.add(b1);
		j.add(b2);
		// ũ�� ���� (w,h)
		j.setSize(200, 100);
		// ���� ����� ��ġ
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���̱�
		j.setVisible(true);
	}
}
