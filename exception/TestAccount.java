package com.rays.exception;

public class TestAccount  {
	public static void main(String[] args) throws InsufficientFundTransfer {
		double balance = 1000;
		double withdrawalamount = 2000;
		if (withdrawalamount>balance) {
			throw new InsufficientFundTransfer();
			
			
		}else {
			balance = balance - withdrawalamount;
			System.out.println("balance");
			
			
		}
		System.out.println("Transaction succefully");
		
	}

}
