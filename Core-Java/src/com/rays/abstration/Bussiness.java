package com.rays.abstration;

public class Bussiness extends Person implements Richman, SocialWorker {
	
	@Override
	public void helptoother() {
		 System.out.println("helptoother ");
		
	}
	@Override
	public void earnmoney() {
		System.out.println("earn money");
	}
	@Override
	public void donation() {
		System.out.println(" give donate");
	
	}
     @Override
     public void party() {
    	 System.out.println("lets party");
     }

     @Override
     public String getName() {
     return "pratik" ;
    	}
}
