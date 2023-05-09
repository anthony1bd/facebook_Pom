package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountModel extends BaseModel {
	
	public CreateAccountModel(WebDriver dd) {
		super (dd);
		
	}
	
	public WebElement getFirstName() throws InterruptedException {
		Thread.sleep(5000);
		WebElement fm = driver.findElement(By.xpath("//input[@name='firstname']"));
		return fm;
	}
	
	public WebElement getLastName() {
		WebElement last_n = driver.findElement(By.xpath("//input[@name='lastname']"));
		return last_n;
	}
	
	public WebElement getEmail() {
		WebElement email_add = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		return email_add;
	}
	
	public WebElement getMonth() {
		WebElement month_12 = driver.findElement(By.xpath("//*[@id='month']"));
		return month_12;
	}

	public WebElement getDate() {
		WebElement date31 = driver.findElement(By.xpath("//*[@id='day']"));
		return date31;
	}
	
	
}
