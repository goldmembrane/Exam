package ch12;

class IndexOf {
	public static void main(String args[]) {
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		
		int sidx = 0;
		int eidx = 0;
		
		while (true) {
			
			eidx = str.indexOf(" ",sidx+1);
			if (eidx == -1) {
				break;
			}
			System.out.println(sidx + ","+eidx);
			sidx = eidx;
			
		}
		
	}
}