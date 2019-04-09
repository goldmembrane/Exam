package ch05;

public class ArrayExam05 {
	public static void main(String[] args) {
		int sum = 0;
		int[][] arr = new int[][] {
			{1,2},
			{4,5,6},
			{7,8,9,10},
			{10,11,12}
			};
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println(arr[i][j]);
					sum = sum+arr[i][j];
				}
			}
			System.out.println(sum);
			
		}
	}


