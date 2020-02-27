package javapractise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassbinaryTest {

  @Test(groups={"smoke"})
  public void f() {
	  System.out.println("suchitra");
  }
  @Parameters({"URL"})
  @Test(dependsOnMethods= {"f"},enabled=false)
  public void f1(String URL) {
	  System.out.println("chavan");
	  System.out.println(URL);
  }
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("test before method annotation");
  }
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("test after method annotation");
  }
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("test before class annotation");
  }
  @AfterClass
  public void Afterclass()
  {
	  System.out.println("test after class annotation");
  }
}
