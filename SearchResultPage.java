package amazon.project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
	
	WebDriver driver;
	
	By searchResult=By.xpath("//h2[starts-with(@class,'a-size-mini a-spacing-none')]//a//span");
	
	SearchResultPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public List<String> getProductList()
	{
		List<WebElement> productList= driver.findElements(searchResult);
		List<String> productNameList=new ArrayList<>();
		for(int i=0;i<productList.size();i++)
		{
			productNameList.add(productList.get(i).getText());
		}
		return productNameList;
	}
	
	
}
	
	/*
	//Search: 'Iphone 14 Plus' & Choose Product: Apple iPhone 14 Plus (128 GB) - (Product) RED
		By iPhone14Plus =By.xpath("//div[@data-component-type=\"s-search-result\"]//span[text()='Apple iPhone 14 Plus (128 GB) - (Product) RED']");
		
		
		//Search: 'The Complete Reference Java' & Choose Product: Java: The Complete Reference | 12th Edition 
		By javaBook= By.xpath("//div[@data-component-type='s-search-result']//span[text()='Java: The Complete Reference | 12th Edition']");
		
	
	public void chooseIphone14Plus()
	{
		driver.findElement(iPhone14Plus).click();
	}
	
	public void chooseJavaBook()
	{
		driver.findElement(javaBook).click();
	}
	
	*/
	

