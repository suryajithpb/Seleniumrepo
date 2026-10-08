package Test;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pagee.Loginpagee;

public class Logintest extends BaseClass {
	
	@Test

	public void login()
	{
		Loginpagee lo=new Loginpagee(driver);
		lo.setvalues("error_user","secret_sauce");
		lo.loginclick();
		
	}
	
	

}