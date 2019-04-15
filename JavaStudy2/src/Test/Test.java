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
	// 1. 화면의 크기를 설정하여 모니터에 출력한다.
	JFrame windowOfLogin = new JFrame("로그인 화면");
	windowOfLogin.setBounds(200,200,350,350);
	windowOfLogin.setLayout(new GridLayout(2, 2));
	
	JTextArea area = new JTextArea(100, 100);
	area.setEditable(false);
	area.setFocusable(false);
	windowOfLogin.add(area, BorderLayout.SOUTH);
	// 2. 패널을 만들고 그 안에 ID와 Password의 label을 표시하고 그것들을 입력받을 textfield를 만든다. 
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
	
	// 3. 로그인을 위한 버튼을 생성하고, ID와 Password를 입력받는다.
	
	
	
	

	
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
				String ok = "로그인에 성공하셨습니다.";
				area.setText(ok);
				idTextField.setText("");
				pwField.setText("");
			}else {
				String fail = "로그인에 실패하셨습니다.";
				area.setText(fail);
				idTextField.setText("");
				pwField.setText("");
				count++;
			}
			
			if(count >5) {
				String error = "시도 가능한 횟수를 초과하였습니다.";
				area.setText(error);
			}
			
		}
	};
		
	
	
	
	// 4. 로그인이 가능한 ID:ai와 비밀번호 : 1234를 설정한다.
	
	
	
			
	// 5. 미리 설정한 아이디,비밀번호와 입력받은 아이디,비밀번호를 비교한다.
	
	// 6. 값이 다르면 실패 메시지를 출력하고 5번이상 실패 메시지가 나오면 '시도할 수 없습니다'가 출력된다.
	
	panel.add(loginBtn, BorderLayout.SOUTH);
	loginBtn.addMouseListener(ml);
	windowOfLogin.add(panel, BorderLayout.CENTER);
	windowOfLogin.setVisible(true);
	windowOfLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}
