package ch12;

public class Exam12_2_new {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		String msg = "Cyqw amkc, cyqw em";
		int len = msg.length();
		
		for (int i = 0; i < len; i++) {
		char ch = msg.charAt(i);
		// 대문자 경우
		if(ch >= ASCII_A && ch <= ASCII_Z) {
			ch = (char)(ch+2);
			if(ch>ASCII_Z) {
				ch -= 26;
			}
		}else if(ch>= ASCII_a && ch <= ASCII_z) {
			ch = (char)(ch+2);
			if(ch>ASCII_z) {
				ch -= 26;
			}
		}
		
		System.out.print(ch);
		}
				

		
	}
}