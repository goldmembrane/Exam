package ch18;

import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		TreeSet<Integer> myNumber = new TreeSet<Integer>();

		lotto.add(10);
		lotto.add(15);
		lotto.add(18);
		lotto.add(20);
		lotto.add(23);
		lotto.add(33);

		int count = 0;
		while(true) { //1등 번호 맞출때까지
			myNumber.clear();
			while(true) {// 내 번호가 6개 만들어질때까지
				
				int num = (int)(Math.random()*45)+1;
				myNumber.add(num);
				if(myNumber.size() == 6)
					break;
				
			}
			count++;
			System.out.println(count);
			boolean isMatch = lotto.containsAll(myNumber);
			if(isMatch)  {
				break;
			}
			System.out.println("시도횟수 : " +count);
		}
		
	}
}
