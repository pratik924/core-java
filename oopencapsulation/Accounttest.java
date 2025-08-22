package com.rays.oopencapsulation;

public class Accounttest {
	public static void main(String[]args) {
		Account a = new Account();
		a.setAccnumber("321654987321");
		a.setAcctype("saving");
		a.setAccbalance(10000.00);
		
		System.out.println("account no. :"+a.getAccnumber());
		System.out.println("account type :" + a.getAcctype());
		System.out.println("balance :" + a.getAccbalance());

		a.deposit(50000.00);
		a.withdrawal(80000);
	}

}
