package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BlazeDemoLOGIN;

public class BlazeDemoLOGINTEST {
WebDriver driver;
@BeforeTest
public void bt()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void bm()
{
	driver.get("https://blazedemo.com/login");
	driver.manage().window().maximize();
}
@Test
public void testa()
{
	BlazeDemoLOGIN bd=new BlazeDemoLOGIN(driver);
	bd.setvalues("rrr@abc.com","pqr");
	bd.login();
}
}
