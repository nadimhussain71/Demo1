package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateModel extends BaseModel{
	
	public CreateModel(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getFirstName() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@name='firstname']"));
			return e;
}
	
public WebElement getLastName() {	
		WebElement e = driver.findElement(By.xpath("//input[@name='lastname']"));
			return e;
}


  	public WebElement getEmail() {	
	WebElement e = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	return e;
}
  	public WebElement getPass() {	
  		WebElement e = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
  		return e; 	
}
     public WebElement getMonth() {	
  		WebElement e = driver.findElement(By.xpath("//*[@id=\"month\"]"));
  		return e; 
}
     public WebElement getDay() {	
   		WebElement e = driver.findElement(By.xpath("//*[@id=\"day\"]"));
   		return e; 
     }
     public WebElement getYear() {	
    		WebElement e = driver.findElement(By.xpath("//*[@id=\"year\"]"));
    		return e; 
}
     public WebElement getGender() {	
 		WebElement e = driver.findElement(By.xpath("//input[@value='2']"));
 		return e;
}
     }