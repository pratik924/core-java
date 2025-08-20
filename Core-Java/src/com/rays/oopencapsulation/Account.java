package com.rays.oopencapsulation;

public class Account {
	private String accnumber;
	private String acctype ;
	private double accbalance;
	
	public String getAccnumber() {
		return this.accnumber;
	}

	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}
	public String getAcctype() {
		return this.acctype;
	
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	
	public double getAccbalance() {
		return this.accbalance;
		
	}
	public void setAccbalance(double balance) {
		this.accbalance = balance;
	}
	public void deposit(double amount) {
		this.accbalance = this.accbalance + amount;
		System.out.println("total balance after deposit :"+this.accbalance);
	}
	public void withdrawal(double amount) {
		if(amount>this.accbalance) {
			System.out.println("insufficient balance");
		}else {
			this.accbalance = this.accbalance - amount;
			System.out.println("total balance after withdrawl :"+ this.accbalance);
		}
       
	}
	
}
