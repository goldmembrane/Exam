package ch07;

public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id = "ggoreb";
		m1.setAge(40);
		System.out.println(m1);
		
		Member m2 = new Member();
		m2.id = "ggoreb";
		System.out.println(m2);

	}

}
