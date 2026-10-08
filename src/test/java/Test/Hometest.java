package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;

public class Hometest extends BaseClass{
	
	@Test(priority = 1)
	public void validateText()
	{
		String actual_text = home.validateText();
		Assert.assertEquals(actual_text, "Products");
	}
	
	@Test(priority = 2)
	public void sortProducts()
	{
		home.sortProducts();
	}
	
	@Test(priority = 3)
	public void addToCart()
	{
		home.addToCart();
	}
	
	@Test(priority = 4)
	public void cartButtonClick()
	{
		home.cartButtonClick();
	}

}