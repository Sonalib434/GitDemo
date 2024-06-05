package javafunctions;

import org.testng.annotations.BeforeMethod;

public class PS {


	public void doThis()
	{
		System.out.println("I am in the parent class!");
	}

	@BeforeMethod
	public void firstMethod()
	{
		System.out.println("I run first!");
	}

}
