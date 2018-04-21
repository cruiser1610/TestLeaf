package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class Delete_lead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="DeleteLead";
		testDescription="Delete an existing lead";
		testNodes="Leads";
		category="Sanity";
		authors="Mersal";
		browserName="chrome";
		dataSheetName="TC003";

	}

	@Test(dataProvider = "fetchData")

	public void deletelead(String uname, String pwd, String fname) throws InterruptedException {

		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogInbtn()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindElementsbtn()
		.enterfname(fname)
		.clickfindleadbtn()
		.findFirstcell()
		.clickfirstlead()
		.clickdeletebtn();
	}
}

