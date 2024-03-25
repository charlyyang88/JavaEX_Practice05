package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member m0 = new Member("정우성", "jws", 50000);
		Member m1 = new Member();
		m1.setName("정우성");
		m1.setId("jws");
		m1.setPoint(50000);

		Member m2 = new Member("유재석", "yjs", 30000);
		Member m3 = new Member("이효리", "lhr", 40000);

		m0.showInfo();
		m1.showInfo();
		m2.showInfo();
		m3.showInfo();
	}
}
