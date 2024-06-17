package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	@Test
	public void Demo()
	{
		System.out.println("Hello");
	}
	@Test
	public void GitDemo()
	{
		System.out.println("Hello");
		System.out.println("New Demo");
	}
	
	@Test
	public void NewDemo()
	{
		System.out.println("New Demo");
	}
	
	@Test(groups= {"Smoke"})
	public void Demo1()
	{
		System.out.println("Sonali");
	}
	
	@AfterTest
	public void LastExecution()
	{
		System.out.println("I'll execute Last");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I'll execute First");
	}
}
