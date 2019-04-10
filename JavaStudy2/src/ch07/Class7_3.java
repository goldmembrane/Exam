package ch07;

class Class7_3 {
	int a;
	
	public static void method1() {
		System.out.println("method1 실행 시작");
		
		Class7_3 cc = new Class7_3();
		for (int i = 0; i < 5; i++) {
			cc.method2();
		}
		System.out.println("method1 실행 종료");
	}
	
	public void method2() {
		a++;
		System.out.println(a);
	}
	
}
