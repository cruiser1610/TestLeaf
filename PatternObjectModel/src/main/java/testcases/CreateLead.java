package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="CreateLead";
		testDescription="Create Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Theri";
		browserName="chrome";
		dataSheetName="TC001";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void createlead(String uname, String pwd, String cname, String fname, String lname) {
		
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogInbtn()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLeadbtn()
		.EnterCompanyName(cname)
		.EnterFirstName(fname)
		.EnterLastName(lname)
		.ClickCreateLeadbtn()
		.verifyfirstname(fname);
		
	}

}
