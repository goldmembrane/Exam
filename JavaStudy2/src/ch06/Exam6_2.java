package ch06;

public class Exam6_2 {

	public static int plusAll(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
	// ������ ����
	public static void main(String[] args) {
		int n = 100;
		int total = plusAll(n);
		System.out.println("1 ~ " + n + " ������ �� : " + total);
	}

}