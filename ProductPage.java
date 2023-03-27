package amazon.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	WebDriver driver;
	
	By addToCartButton=By.id("add-to-cart-button");
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void addProductToCart()
	{
		driver.findElement(addToCartButton).click();
		
	}
		
}
