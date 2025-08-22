package core.rays.constructor;

public class Testaccount {
	public static void main(String[]args) {
	Account a = new Account("123456789232","saving", 2000.0);
		System.out.println("account no:"+ a.getAccountNo()+"\n"+a.getAccountType()+"\n"  +"current balance:"+ a.getbalance());
		
	}

}
