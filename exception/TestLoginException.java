package com.rays.exception;

public class TestLoginException {
	public static void main(String[] args) throws LoginException {
		String login = "admin";
		
		if(login != null && login == "admin") {
			System.out.println("user  found");
		}else {
			throw new LoginException();
		}
		System.out.println("login succesfully");
		
	}

}
