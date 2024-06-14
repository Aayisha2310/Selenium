package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlazeDemoLOGIN {
	WebDriver driver;
	By bdemail=By.id("email");
	By bdpassword=By.name("password");
	By bdlogin=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");


	public BlazeDemoLOGIN(WebDriver driver)
	{
	this.driver=driver;	
	}


	public void setvalues(String email, String password)
	{
	driver.findElement(bdemail).sendKeys(email);
	driver.findElement(bdpassword).sendKeys(password);
	}


	   public void login()
	   {
		   
		   driver.findElement(bdlogin).click();
		   
	   }

}
