package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;





import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelRead;
import page.CreatePage;

public class CreatePageTest extends BaseTest{
	
	@Test(dataProvider="dp") 
	public void cpTest(String firstname, String lastname, String email, String pass, String month, String day, String year, String gender) throws InterruptedException {
		
		CreatePage cp = new CreatePage(driver);
		cp.typeFirstName(firstname);
		cp.typeLastName(lastname);
		cp.typeEmail(email);
		cp.typePass(pass);
		cp.selectMonth(month);
		cp.selectDay(day);
		cp.Selectyear(year);
		cp.clickGender();
		
	}

	@DataProvider(name="dp")
	public Object[][] dataloader() throws IOException{
		
		Object[][] x ;
		//data  comes from excel
		String filename="data/FbData.xlsx";
		String sheetname="Sheet2";
		ExcelRead er = new ExcelRead(filename,sheetname);
		x=er.excelToArray();
		return x;
	}
	
}

