package Pagee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By homepageTitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span"); 
	By sortProduct = By.xpath("//select[@data-test='product-sort-container']");
	By addtocartButton1 = By.id("add-to-cart-sauce-labs-backpack");
	By addtocartButton2 = By.id("add-to-cart-sauce-labs-bike-light");	//
	By addtocartButton3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");  //
	By addtocartButton4 = By.id("add-to-cart-sauce-labs-fleece-jacket"); //
	By addtocartButton5 = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"); //
	By addtocartButton6 = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By cart_icon = By.xpath("//a[@data-test='shopping-cart-link']");
	
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public String validateText()
	{
		return driver.findElement(homepageTitle).getText();
	}
	
	public void  sortProducts()
	{
		WebElement sort = driver.findElement(sortProduct);
		Select sortelement = new Select(sort);
		sortelement.selectByVisibleText("Price (low to high)");
	}
	
	public void addToCart()
	{
		driver.findElement(addtocartButton1).click();
		driver.findElement(addtocartButton2).click();
		driver.findElement(addtocartButton3).click();
		driver.findElement(addtocartButton4).click();
		driver.findElement(addtocartButton5).click();
		driver.findElement(addtocartButton6).click();
	}
	
	public void cartButtonClick()
	{
		driver.findElement(cart_icon).click();
	}
	
}