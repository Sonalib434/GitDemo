package Test;

import org.testng.annotations.Test;

public class CarLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCarLoan");
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void LoginAPICarLoan()
	{
		System.out.println("LoginAPICarLoan");
	}
}
