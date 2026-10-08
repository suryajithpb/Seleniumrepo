package Pagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpagee {
	WebDriver driver;
	
	By usernamefield= By.xpath("//*[@id=\"user-name\"]");
	By passwordfield=By.xpath("//*[@id=\"password\"]");
	By loginbutton=By.xpath("//*[@id=\"login-button\"]");
	
	public Loginpagee(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String username,String password)
	{
		driver.findElement(usernamefield).sendKeys(username);
		driver.findElement(passwordfield).sendKeys(password);
	}
	public void loginclick()
	{
		driver.findElement(loginbutton).click();
	}
	

}
