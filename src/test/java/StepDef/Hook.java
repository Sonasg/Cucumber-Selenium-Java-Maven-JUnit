package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Dependency.Dependency;
import cucumber.api.java.Before;

public class Hook extends Dependency{

	Dependency depend;
	public Hook(Dependency depend)
	{
		this.depend = depend;
	}
	
	
	@Before
	public void openBrowser_URL()
	{
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");
		
		System.setProperty("webdriver.chrome.driver","./libs/chromedriver.exe");
		
		depend.driver = new ChromeDriver(co);
		
		depend.driver.get("https://phptravels.org/clientarea.php");
	}
	
}
