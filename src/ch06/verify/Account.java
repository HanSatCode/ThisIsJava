package ch06.verify;

public class Account {		// 19번~20번 문제
	private String num;
	private String name;
	private int balance;
	
	public Account(String num, String name, int balance) {
		this.num = num; this.name = name; this.balance = balance;
	}
	
	/*
	private final static int MIN_BALANCE = 0;
	private final static int MAX_BALANCE = 1000000;
	
	
	public void setter(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	public int getter() {
		return this.balance;
	}
	*/
	
	public void setInfo(String num, String name, int balance) {
		this.num = num; this.name = name; this.balance = balance;
	}
	
	public String[] getInfo() {
		String[] temp = {this.num, this.name, String.valueOf(this.balance)};
		return temp;
	}
	
}
