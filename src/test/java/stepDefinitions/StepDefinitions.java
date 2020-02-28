package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions 
{
	WebDriver driver;

@When("^Open Browser$")
public void open_Browser() throws Throwable {
 
	 driver=FunctionLibrary.startBrowser();
}

@When("^Open Application$")
public void open_Application() throws Throwable {
	
	FunctionLibrary.openApp(driver);
}
   

@When("^Wait For Username$")
public void wait_For_Username() throws Throwable {
	FunctionLibrary.waitforElement(driver, "id", "username", "10");
   
}

@When("^Enter Username$")
public void enter_Username() throws Throwable {
	FunctionLibrary.typeAction(driver, "id", "username", "admin");
  
}

@When("^Wait For Password$")
public void wait_For_Password() throws Throwable {
	FunctionLibrary.waitforElement(driver, "name", "password", "10");
   
}

@When("^Enter Password$")
public void enter_Password() throws Throwable {
	FunctionLibrary.typeAction(driver, "name", "password", "master");
   
}

@When("^Wait For Login$")
public void wait_For_Login() throws Throwable {
	FunctionLibrary.waitforElement(driver, "xpath", "//*[@id='btnsubmit']", "10");
   
}

@When("^Click On Login$")
public void click_On_Login() throws Throwable {
	FunctionLibrary.clickAction(driver, "xpath", "//*[@id='btnsubmit']");
   
}
@When("^Wait for Supplier$")
public void wait_for_Supplier() throws Throwable {
	FunctionLibrary.waitforElement(driver, "id", "mi_a_suppliers", "10");
  
}

@When("^Click On Supplier$")
public void click_On_Supplier() throws Throwable {
  FunctionLibrary.clickAction(driver, "id", "mi_a_suppliers");
	
}

@When("^Wait for Add$")
public void wait_for_Add() throws Throwable {
   
	FunctionLibrary.waitforElement(driver, "xpath", "//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a", "10");
}

@When("^Click on add$")
public void click_on_add() throws Throwable {
	FunctionLibrary.clickAction(driver, "xpath", "//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a");
   
}

@When("^wait for suppliernumber$")
public void wait_for_suppliernumber() throws Throwable {
	FunctionLibrary.waitforElement(driver, "id", "x_Supplier_Name", "10");
   
}

@Then("^Capturedata$")
public void capturedata() throws Throwable {
	FunctionLibrary.CapturingData(driver, "id", "x_Supplier_Number");

}

@When("^wait for suppliername$")
public void wait_for_suppliername() throws Throwable {
FunctionLibrary.waitforElement(driver, "id", "x_Supplier_Name", "10");
}
@When("^enter Supeliername in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_Supeliername_in_with_and(String suppplername, String locatortype, String locatorvale) throws Throwable {
 FunctionLibrary.typeAction(driver, locatortype, locatorvale, suppplername);	
}

@When("^Wait for Add button$")
public void wait_for_Add_button() throws Throwable {
	FunctionLibrary.waitforElement(driver, "xpath", "(//button[text()='Add'])[1]", "10");
   
}

@When("^Click  on Add button afternotes$")
public void click_on_Add_button_afternotes() throws Throwable {
	FunctionLibrary.clickAction(driver, "xpath", "(//button[text()='Add'])[1]");
   
}

@When("^Wait For Ok Button$")
public void wait_For_Ok_Button() throws Throwable {
	FunctionLibrary.waitforElement(driver, "xpath", "//*[text()='OK!']", "10");
   
}

@When("^Click on OK button$")
public void click_on_OK_button() throws Throwable {
	FunctionLibrary.clickAction(driver, "xpath", "//*[text()='OK!']");
   
}

@When("^Wait For (\\d+)nd OK button$")
public void wait_For_nd_OK_button(int arg1) throws Throwable {
	FunctionLibrary.waitforElement(driver, "xpath", "/html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]", "10");
    }

@When("^clickAction$")
public void clickaction() throws Throwable {
   FunctionLibrary.clickAction(driver, "xpath", "/html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]");
}
@Then("^Table Validation$")
public void table_Validation() throws Throwable {
	FunctionLibrary.tableValidation(driver, "6");

}

@When("^wait For Logout$")
public void wait_For_Logout() throws Throwable {
	FunctionLibrary.waitforElement(driver, "id", "logout", "10");

}

@When("^Click On Logout$")
public void click_On_Logout() throws Throwable {
	FunctionLibrary.clickAction(driver, "id", "logout");

}

@When("^Wait For OK$")
public void wait_For_OK() throws Throwable {
	FunctionLibrary.waitforElement(driver, "xpath", "//*[text()='OK!']", "10");

}

@When("^Click On Ok$")
public void click_On_Ok() throws Throwable {
  FunctionLibrary.clickAction(driver, "xpath", "//*[text()='OK!']");
}

@When("^CloseBrowser$")
public void closebrowser() throws Throwable {

	FunctionLibrary.closeApp(driver);
}






	
		
}

