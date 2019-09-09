package Newmavenproject.FirstMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends BaseClass1{
public static void main(String[] args) throws Exception {
	LaunchBrowser();
	goToUrl("https://www.facebook.com");
	
	
	PojoClass p = new PojoClass();
WebElement username = driver.findElement(By.id("email"));
username.sendKeys(getData(0,0));
WebElement password = driver.findElement(By.id("pass"));
password.sendKeys(getData(1,0));
WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
btn.click();
screenshot("C:\\Users\\Navin\\seleniumproject\\SS\\down.png");
closebrowser();
}
}
