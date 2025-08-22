package com.rays.oopencapsulation;

public class TestAccount {
	public static void main(String[]args) {
		Account a =  new Account();
		a.setAccnumber("78945623416123");
		a.setAcctype("saving");
		a.setAccbalance(20000.00);
		 
		System.out.println("account no. :"+a.getAccnumber());
		System.out.println("account type :" + a.getAcctype());
		System.out.println("balance :" + a.getAccbalance());
	}
	

}
