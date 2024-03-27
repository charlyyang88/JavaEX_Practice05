package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance;

	// 생성자 작성
	private int deposit;
	private int withdraw;

	// 필요한 메소드 작성
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		this.balance -= money;
	}

	public void showBalance() {
		System.out.println("잔고액>" + this.balance);
	}

	public String getAccountNo() {
		return accountNo;
	}

}
