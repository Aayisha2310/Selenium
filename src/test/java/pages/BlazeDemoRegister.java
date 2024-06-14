package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlazeDemoRegister {
	WebDriver driver;
	By bdrname=By.id("name");
	By bdrcompany=By.name("company");
	By bdremail=By.id("email");
	By bdrpassword=By.name("password");
	By bdrconpassword=By.id("password-confirm");
    By bdregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");


public BlazeDemoRegister(WebDriver driver)
  {
	this.driver=driver;
  }
public void setvalues(String name,String company,String email,String password,String conpassword)
{
	driver.findElement(bdrname).sendKeys(name);
	driver.findElement(bdrcompany).sendKeys(company);
	driver.findElement(bdremail).sendKeys(email);
	driver.findElement(bdrpassword).sendKeys(password);
	driver.findElement(bdrconpassword).sendKeys(conpassword);
	
}
public void register()
{
driver.findElement(bdregister).click();
}
}
