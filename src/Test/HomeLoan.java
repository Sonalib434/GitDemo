package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before executing any method in this Class");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}

	@Parameters({ "URL" })
	@Test(groups = { "Smoke" })
	public void WebLoginHomeLoan(String url) {
		System.out.println("WebLoginHomeLoan");
		System.out.println(url);
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("After executing any method in this Class");
	}

	@Test(dataProvider = "getData")
	public void MobileLoginHomeLoan(String uname, String pass) {
		System.out.println("MobileLoginHomeLoan");
		System.out.println(uname);
		System.out.println(pass);
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before all the Test Method");
	}

	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHomeLoan");
	}

	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("Before Suit");
	}

	@DataProvider
	public Object[][] getData() {
		// creating object with 3 rows and 2 columns. i.e. 3 sets with 2 values of each.
		Object[][] obj = new Object[3][2];

		// 1st set
		obj[0][0] = "1stName";
		obj[0][1] = "1stPass";

		// 2nd set
		obj[1][0] = "2ndName";
		obj[1][1] = "2ndPass";

		// 3rd set
		obj[2][0] = "3rdName";
		obj[2][1] = "3rdPass";
		
		return obj;

	}
}
