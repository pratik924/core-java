package com.rays.abstration;

public class TestBussinessMan {
	public static void main(String[] args) {
		
		
		Richman r = new Bussiness();
		
		r.donation();
		r.earnmoney();
		r.party();
		
		SocialWorker s = new Bussiness();
		s.helptoother();
		
		Bussiness bs =  new Bussiness();
		bs.getName();
		bs.donation();
	}

}
