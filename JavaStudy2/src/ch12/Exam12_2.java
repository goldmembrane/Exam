package ch12;

public class Exam12_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		// �ڵ� �ۼ�
		String[] filePath = file.split("/");
		for (int i = 0; i < filePath.length; i++) {
			if(!filePath[i].equals("")) {
				System.out.println("/"+filePath[i]);
			}
		}
			
	}
}