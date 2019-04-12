package ch07;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("������");
		
		JButton button = new JButton();
		MyMouseListener ml = new MyMouseListener();
		button.addMouseListener(ml); // ��ư ���� ����
		button.setText("���� ��ư");
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
		System.out.println("�ȳ��ϼ���");
		
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