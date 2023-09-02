package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.CreateModel;

public class CreatePage extends CreateModel{
      
	public CreatePage(WebDriver d) {
		super(d);
		
	}
	
	public void typeFirstName(String name) throws InterruptedException{
		WebElement e = getFirstName();
		e.sendKeys(name);
	}
	public void typeLastName(String name){
		WebElement e = getLastName();
		e.sendKeys(name);
	
}
	

	public void typeEmail(String name){
	WebElement e = getEmail();
	e.sendKeys(name);

}
	public void typePass(String name){
		WebElement e = getPass();
		e.sendKeys(name);
	}
	public void selectMonth(String name){
			WebElement e = getMonth();
			Select month = new Select(e);
			month.selectByVisibleText(name);
}
	public void selectDay(String name){
		WebElement e = getDay();
		Select day = new Select(e);
		day.selectByVisibleText(name);
	}
	public void Selectyear(String name){
		WebElement e = getYear();
		Select year= new Select(e);
		year.selectByVisibleText(name);		
}
	public void clickGender(){
		WebElement e = getGender();
		e.click();	
}
}