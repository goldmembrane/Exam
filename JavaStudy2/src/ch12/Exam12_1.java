package ch12;

import java.util.Scanner;

public class Exam12_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("���̵� �Է����ּ���. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();
		

		boolean isUpper = false;
		boolean isLower = false;

		for (int i = 0; i < id.length(); i++) {
			char ch = id.charAt(i);
			if(ch>= ASCII_A && ch<= ASCII_Z) {
				isUpper = true;
			}else if (ch>= ASCII_a && ch<=ASCII_z) {
				isLower = true;
			}
	
		}
		if(isUpper == true && isLower == true) {
			System.out.println("���� ���ԵǼ̽��ϴ�.");
		}else {
			System.out.println("�ٽ� �Է����ּ���");
		}
		s.close();
	}

}
