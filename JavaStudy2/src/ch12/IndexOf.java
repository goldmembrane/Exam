package ch12;

class IndexOf {
	public static void main(String args[]) {
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		int count = 0;
		int idx = str.indexOf(" ");
		System.out.println(idx);
		
		while (true) {
			count++;
			idx = str.indexOf(" ",idx+1);
			if (idx == -1) {
				break;
			}
			System.out.println(idx);
			
		}
		System.out.println(count);
	}
}