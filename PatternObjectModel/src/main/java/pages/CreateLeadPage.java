package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage () {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "createLeadForm_companyName" )

	private WebElement eleCompanyName;

	@And("Enter company name (.*)")
	
	public CreateLeadPage EnterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_firstName" )

	private WebElement eleFirstName;

	@And("Enter First name (.*)")
	
	public CreateLeadPage EnterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_lastName" )

	private WebElement eleLastName;

	@And("Enter Last name (.*)")
	
	public CreateLeadPage EnterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME , using = "smallSubmit" )

	private WebElement eleCreateLeadbtn;

	@And("click submitbtn")
	
	public ViewLeadsPage ClickCreateLeadbtn() {
		click(eleCreateLeadbtn);
		return new ViewLeadsPage();
				
	}


}
