package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver ldriver = null;	
public LoginPage(WebDriver rdriver) {
	ldriver = rdriver ;
	PageFactory.initElements(rdriver, this);
}
}
