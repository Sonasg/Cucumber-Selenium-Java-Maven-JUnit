package StepDef;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Dependency.Dependency;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Step extends Dependency {
	
	Dependency depend;
	public Login_Step(Dependency depend)
	{
		this.depend = depend;
	}
	
	@Given("^Login page is opened$")
	public void login_page_is_opened() throws Throwable {
	    
	   if(depend.driver.getTitle().equals("Client Area - PHPTRAVELS"))
		   System.out.println("Page opened successfully");
	}

	@When("^I enter \"(.*?)\" and \"(.*?)\"$")
	public void i_enter_and(String arg1, String arg2) throws Throwable {

		depend.driver.findElement(By.id("inputEmail")).sendKeys(arg1);
		depend.driver.findElement(By.id("inputPassword")).sendKeys(arg2);
	    depend.driver.findElement(By.id("inputPassword")).submit();
	}
	

	@When("^I click Login button$")
	public void i_click_Login_button() throws Throwable {
	   
	   System.out.println("Login button clicked");
	}

	@Then("^I can see$")
	public void i_can_see() throws Throwable {
	    if(depend.driver.findElement(By.xpath("//h1[contains(text(),'Welcome Back')]")).isDisplayed())
	    	System.out.println("Login is successful");
	    
	}
	
}
