package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.HomeModel;

public class HomePage extends HomeModel {
	
	public HomePage(WebDriver h) {
		super(h);
	}
	
	public void clickButtoncna() throws InterruptedException {
		WebElement cBcna = getButton();
		cBcna.click();
	}

}
