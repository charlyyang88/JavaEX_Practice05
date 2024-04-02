package com.javaex.ex10;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	// 생성자
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1; // 초기 상태: 재고 있음
	}
	
	//getter/setter
	public int getBookNo() {
		return this.bookNo;
	}
	public void setBookeNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
    public int getStateCode() {
        return this.stateCode;
    }
    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }
	
    // 대여 메서드
	public void rent() {
		if (stateCode == 1) {
			System.out.println( title + "이(가) 대여 됐습니다.");
			stateCode = 0; // 대여 후 상태 코드를 0으로 변경
		} else {
			System.out.println("이미 대여 중인 책입니다.");
		}
	}
    
}
