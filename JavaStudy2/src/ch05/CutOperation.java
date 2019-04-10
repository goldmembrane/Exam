package ch05;

public class CutOperation {

	public static void main(String[] args) {
		// 막대기 배열의 요소들을 설정한다.
		int[] stick = { 2, 4, 4, 5, 6, 8 };
		while (true) {
			// 막대기 배열 중 0보다 큰 요소들의 개수를 구한다.
			int count = 0;
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] > 0) {
					count++;
				}
			}
			System.out.println(count);
			if(count <= 1) {
				break;
			}
			// 막대기 배열 속 최소값을 구한다.
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] < min && stick[i] > 0) {
					min = stick[i];
				}
			}

			// 막대기 배열의 요소들을 최소값만큼 감소시킨다.
			for (int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
			}
			
		}
		
	}
}
