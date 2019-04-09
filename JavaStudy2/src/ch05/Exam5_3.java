package ch05;

public class Exam5_3 {
public static void main(String[] args) {
	
	char[] nums = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
	
	for (int i = 0; i < nums.length; i++) {
		char temp = 0;
		int random = (int)(Math.random()*7);
		temp = nums[i];
		nums[i] = nums[random];
		nums[random] = temp; 
		
		
	}
	System.out.println(nums);
}
}
