package com.javaex.ex01;

public class Member {
	private String id;
	private String name;
	private int point;
	
	public Member() {
		
	}
	
	public Member(String name, String id, int point) {
		this.id=id;
		this.name=name;
		this.point=point;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPoint(int point) {
		this.point=point;
	}
	public int setPoint() {
		return point;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	
	public void showInfo() {
		System.out.printf("회원정보: %s(%s), %d점%n", name, id, point);
	}

}
