package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class Edit_Lead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName = "Edit Lead";
		testDescription = "Editing a lead's company name";
		testNodes ="Leads";
		browserName = "chrome";
		dataSheetName="TC004";
		authors="Mersal";
		category = "sanity";
	}
	
	@Test(dataProvider="fetchData")
	
	public void Editlead(String uname, String pwd, String cname) throws InterruptedException{
		
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogInbtn()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickMyLeadsbtn()
		.locatefirstcell()
		.clickfirstcell()
		.clickEditbtn()
		.clearexistingCname()
		.typeCname(cname)
		.clickUpdatebtn();
		
	}
	
	

}
