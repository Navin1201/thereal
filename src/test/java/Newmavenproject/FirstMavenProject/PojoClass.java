package Newmavenproject.FirstMavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass1 {
	
	public PojoClass() {
PageFactory.initElements(driver,this);	
}
	@FindBys({
		@FindBy(id ="email"),
		@FindBy(xpath ="//input[@type='email']")
	})
	private WebElement userName;
	
	
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(xpath="//type[@name='pass']")
	})
	private WebElement password;
	
	@FindBy(id="loginbutton")
	private WebElement btn;
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getBtn() {
		return btn;
	}


}
