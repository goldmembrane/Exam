package ch07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) {
		JFrame frame = new JFrame("윈도우");
		
		JButton button = new JButton();
		button.setText("나는 버튼");
		button.setBackground(Color.RED);
		frame.add(button);


		frame.setBounds(200, 200, 200, 200);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}