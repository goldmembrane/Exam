package Test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Test {
public static void main(String[] args) {
	// 1. ȭ���� ũ�⸦ �����Ͽ� ����Ϳ� ����Ѵ�.
	JFrame windowOfLogin = new JFrame("�α��� ȭ��");
	windowOfLogin.setBounds(200,200,350,350);
	windowOfLogin.setLayout(new GridLayout(2, 2));
	
	JTextArea area = new JTextArea(100, 100);
	area.setEditable(false);
	area.setFocusable(false);
	windowOfLogin.add(area, BorderLayout.SOUTH);
	// 2. �г��� ����� �� �ȿ� ID�� Password�� label�� ǥ���ϰ� �װ͵��� �Է¹��� textfield�� �����. 
	JPanel panel = new JPanel();
	panel.setLayout(new FlowLayout());
	JLabel idLabel = new JLabel();
	JTextField idTextField = new JTextField(10);
	idLabel.setText("ID");
	idLabel.setHorizontalAlignment(SwingConstants.LEFT);
	JLabel pwLabel = new JLabel();
	JPasswordField pwField = new JPasswordField(10);
	pwLabel.setText("password");
	pwLabel.setHorizontalAlignment(SwingConstants.LEFT);
	
	
	
	
	
	
	
	panel.add(idLabel);
	panel.add(idTextField);
	panel.add(pwLabel);
	panel.add(pwField);
	
	// 3. �α����� ���� ��ư�� �����ϰ�, ID�� Password�� �Է¹޴´�.
	
	
	
	

	
	JButton loginBtn = new JButton("Log In");
	MouseListener ml = new MouseListener()  {
		int count = 0;
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
			
			if(idTextField.getText().equals("ai") && new String(pwField.getPassword()).equals("1234")) {
				String ok = "�α��ο� �����ϼ̽��ϴ�.";
				area.setText(ok);
				idTextField.setText("");
				pwField.setText("");
			}else {
				String fail = "�α��ο� �����ϼ̽��ϴ�.";
				area.setText(fail);
				idTextField.setText("");
				pwField.setText("");
				count++;
			}
			
			if(count >5) {
				String error = "�õ� ������ Ƚ���� �ʰ��Ͽ����ϴ�.";
				area.setText(error);
			}
			
		}
	};
		
	
	
	
	// 4. �α����� ������ ID:ai�� ��й�ȣ : 1234�� �����Ѵ�.
	
	
	
			
	// 5. �̸� ������ ���̵�,��й�ȣ�� �Է¹��� ���̵�,��й�ȣ�� ���Ѵ�.
	
	// 6. ���� �ٸ��� ���� �޽����� ����ϰ� 5���̻� ���� �޽����� ������ '�õ��� �� �����ϴ�'�� ��µȴ�.
	
	panel.add(loginBtn, BorderLayout.SOUTH);
	loginBtn.addMouseListener(ml);
	windowOfLogin.add(panel, BorderLayout.CENTER);
	windowOfLogin.setVisible(true);
	windowOfLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}
