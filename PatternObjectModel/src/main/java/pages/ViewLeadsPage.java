package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods{

	public ViewLeadsPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.CLASS_NAME, using = "tabletext")

	private WebElement eleFirstnameverify;


	public ViewLeadsPage verifyfirstname(String data) {

		verifyExactText(eleFirstnameverify, data);

		return this;
	}

	@FindBy(how=How.LINK_TEXT, using = "Delete")

	private WebElement eledeletebtn;


	@And("Click delete button")
	
	public MyLeadsPage clickdeletebtn() {

		click(eledeletebtn);

		return new MyLeadsPage();
	}

	@FindBy(how=How.LINK_TEXT, using = "Edit")
	
	private WebElement eleEditbtn;
	
	@And("Click Edit button")
	
	public OpenTapsCRM_page clickEditbtn() {
		
		click(eleEditbtn);
		
		return new OpenTapsCRM_page();
	}
	

}
