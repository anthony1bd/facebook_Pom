package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.CreateAccountModel;

public class CreateAccountPage extends CreateAccountModel {

	public CreateAccountPage(WebDriver pp) {
		super(pp);
	}
	
	public void typeFirstName(String firstNameEnter) throws InterruptedException {
		
		WebElement fm1 = getFirstName();
		fm1.sendKeys(firstNameEnter);
	}
	
	public void typeLastName(String last_name_enter) {
		WebElement last_name = getLastName();
		last_name.sendKeys(last_name_enter);
	}
	
	public void typeEmailAddress(String email_add_enter) {
		WebElement email_address = getEmail();
		email_address.sendKeys(email_add_enter);
	}
	
	public void select_Month(String se_Month) {
		WebElement set_Month = getMonth();
		Select select_M = new Select(set_Month);
		select_M.selectByVisibleText(se_Month);	
	}
	
	public void select_Day(String se_Day) {
		WebElement set_Day = getDate();
		Select select_D = new Select(set_Day);
		select_D.selectByVisibleText(se_Day);
	}
	
}
