package ch05;

import java.util.Scanner;

public class CutOperation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int stick = s.nextInt();
		int min = Integer.MAX_VALUE;
		int count = 0;
		
		int[] cutStick = new int[stick];
		for (int i = 0; i < cutStick.length; i++) {
			if(cutStick[i]<min) {
				min = cutStick[i];
				
			}
		}
		System.out.println(min);
		s.close();
	}

}
