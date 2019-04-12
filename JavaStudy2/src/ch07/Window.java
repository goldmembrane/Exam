package ch07;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("윈도우");
		
		JButton button = new JButton();
		MyMouseListener ml = new MyMouseListener();
		button.addMouseListener(ml); // 버튼 동작 정의
		button.setText("나는 버튼");
		button.setBackground(Color.RED);
		frame.add(button);
		
//		button.addMouseListener(new MouseListener() {);


		frame.setBounds(200, 200, 200, 200);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}

class MyMouseListener implements MouseListener{


	public void mouseClicked(MouseEvent arg0) {
		System.out.println("안녕하세요");
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}