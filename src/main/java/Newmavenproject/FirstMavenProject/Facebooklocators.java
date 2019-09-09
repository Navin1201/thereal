package Newmavenproject.FirstMavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklocators extends Baseclass {
public Facebooklocators() {
PageFactory.initElements(driver, this);
}

@FindBy(id="src")
private WebElement txtEmail;
@FindBy(id="pass")
private WebElement txtPass;
@FindBy(xpath="//input[@value='login']")
private WebElement btnlogin;
public WebElement getTxtEmail() {
	return txtEmail;
}
public WebElement getTxtPass() {
	return txtPass;
}
public WebElement getBtnlogin() {
	return btnlogin;
}






}
