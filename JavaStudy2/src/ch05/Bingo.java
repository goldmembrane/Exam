package ch05;

public class Bingo {

	public static void main(String[] args) {
		int[] bingo = new int[25];
		for (int i = 0; i < 25; i++) {
			bingo[i] = i +1;
		}
		for(int i = 0; i <1000; i++) {
		int temp = 0;
		int random = (int)(Math.random()*25);
		temp = bingo[0];
		bingo[0] = bingo[random];
		bingo[random] = temp;
		}
	}

}
