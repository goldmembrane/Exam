package ch05;

public class CutOperation {

	public static void main(String[] args) {
		// ����� �迭�� ��ҵ��� �����Ѵ�.
		int[] stick = { 2, 4, 4, 5, 6, 8 };
		while (true) {
			// ����� �迭 �� 0���� ū ��ҵ��� ������ ���Ѵ�.
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
			// ����� �迭 �� �ּҰ��� ���Ѵ�.
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] < min && stick[i] > 0) {
					min = stick[i];
				}
			}

			// ����� �迭�� ��ҵ��� �ּҰ���ŭ ���ҽ�Ų��.
			for (int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
			}
			
		}
		
	}
}
