package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Find_LeadsPage extends ProjectMethods {

	public Find_LeadsPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "(//div[@class='x-form-element'])[19]//input")

	private WebElement elefnamefield;

	public Find_LeadsPage enterfname(String data) {

		type(elefnamefield, data);

		return this;
	}

	@FindBy(how = How.XPATH, using = "(//button[@class='x-btn-text'])[7]")

	private WebElement elefindleadbutton;

	public Find_LeadsPage clickfindleadbtn() {

		click(elefindleadbutton);

		return this;
	}


	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")

	private WebElement elefindfirstcell;

	public Find_LeadsPage findFirstcell() throws InterruptedException {

		Thread.sleep(2000);

		return this;
	}


	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a")

	private WebElement elefirstlead;

	public ViewLeadsPage clickfirstlead() {

		click(elefirstlead);

		return new ViewLeadsPage();
	}


}
