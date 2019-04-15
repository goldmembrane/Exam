package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam21_3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("��縸 ä��â");
		frame.setLayout(new FlowLayout());
		JTextArea area = new JTextArea(10, 20); // ��*�� 10*20
		area.setEditable(false); // ���� �Ұ�
		area.setFocusable(false); // ��Ŀ�� �Ұ�
		frame.add(area);
		/* JPanel ���� */
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		/* JTextField ���� */
		JTextField textField = new JTextField(10);
		/* JButton ���� */
		panel.add(textField);
		/* JTextField �� JButton�� JPanel�� �߰� */

		JButton btn = new JButton("����");
		MouseListener ml = new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				area.setText(textField.getText());
				textField.setText("");
			}
		};
		
		panel.add(btn, BorderLayout.EAST);
		btn.addMouseListener(ml);
		frame.add(panel);
		frame.setSize(300, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		/* JButton Ŭ�� �� �Էµ� ���ڸ� JTextArea�� ��� */
	}
}