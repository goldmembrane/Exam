package Swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Exam21_2 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("모양만 계산기");
		frm.setBounds(100, 100, 300, 300); // 윈도우 크기 지정
		frm.setLayout(new BorderLayout()); // 정렬방식
		

		JLabel label = new JLabel();
		label.setText("TEST");
		/* 오른쪽 정렬 */
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		frm.add(label, BorderLayout.NORTH);

		/* JPanel1 추가 */
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,4));
		panel1.add(new JButton("+"));
		panel1.add(new JButton("-"));
		panel1.add(new JButton("X"));
		panel1.add(new JButton("/"));
		
		/* JPanel2 추가 */
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3,3));
		panel2.add(new JButton("1"));
		panel2.add(new JButton("2"));
		panel2.add(new JButton("3"));
		panel2.add(new JButton("4"));
		panel2.add(new JButton("5"));
		panel2.add(new JButton("6"));
		panel2.add(new JButton("7"));
		panel2.add(new JButton("8"));
		panel2.add(new JButton("9"));
		
		frm.add(panel1, BorderLayout.SOUTH);
		frm.add(panel2, BorderLayout.CENTER);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}