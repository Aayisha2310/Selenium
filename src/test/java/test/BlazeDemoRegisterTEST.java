package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BlazeDemoRegister;

public class BlazeDemoRegisterTEST {
WebDriver driver;
@BeforeTest
public void bt()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void bm() 
{
	driver.get("https://blazedemo.com/register");
	driver.manage().window().maximize();
}
@Test
public void testa()
{
	BlazeDemoRegister bdr=new BlazeDemoRegister ( driver);
	bdr.setvalues("Maasha", "abc tech hub", "maasha@pqr.com", "maashapqr", "maashapqr");
    bdr.register();
}
}
