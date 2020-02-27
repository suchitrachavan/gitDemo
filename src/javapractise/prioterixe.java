package javapractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class prioterixe {

//	@Parameters({"URL"})
	@Test(groups={"smoke"})
	public void test1()
	{
		System.out.println("Test1");
	//	System.out.println(URL);
	}
//	@Optional({"URL1"})
	@Test
	public void test3()
	{
		System.out.println("Test3");
	//	System.out.println(URL1);
	}
	@Test(dataProvider = "getdata")
	public void test2(String Usename,String Password)
	{
		System.out.println("Test2");
		System.out.println(Usename);
		System.out.println(Password);
		
	}
	@DataProvider
	public Object[][] getdata() {
		Object[][] data= new Object[3][2];
		data[0][0]="suchitra";
		data[0][1]="chavan";
		data[1][0]="genesys";
		data[1][1]="employee";
		data[2][0]="100000";
		data[2][1]="salary";
	 return data;
	}
}
