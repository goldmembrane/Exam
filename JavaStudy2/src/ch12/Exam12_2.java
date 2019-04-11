package ch12;

public class Exam12_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		// 코드 작성
		String[] filePath = file.split("/");
		for (int i = 0; i < filePath.length; i++) {
			if(!filePath[i].equals("")) {
				System.out.println("/"+filePath[i]);
			}
		}
			
	}
}