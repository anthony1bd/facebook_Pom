package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {

	public HomeModel(WebDriver g) {
		super(g);
	}
	
	public WebElement getButton() throws InterruptedException {
		WebElement cna = driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
		return cna;
	}
	
}
