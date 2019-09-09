package Newmavenproject.FirstMavenProject;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableClass1 extends BaseClass1{

public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	
	LaunchBrowser();
	goToUrl("https://www.toolsqa.com/automation-practice-form");
	WebElement text = driver.findElement(By.xpath("//h1[text()='Automation Practice Form']"));
	getText(text);
	FramesCount();
	Linkscount();
	ImageCount();
	WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	WebElement lastname = driver.findElement(By.xpath("//input[@id='lastname']"));
	insertValues(firstname,"Navin");
	//insertValues(lastname,"Kumar");
	doubleclick(firstname);
	sleep();
	crtlC(firstname);
    lastname.click();
	crtlV(lastname);
	getAttribute(firstname);
	WebElement sex = driver.findElement(By.xpath("//input[@id='sex-0']"));
	Click(sex);
	sleep();
	WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
	insertValues(date,"25.09.2016");
	WebElement checkbox = driver.findElement(By.xpath("//input[@id='profession-1']"));
	Click(checkbox);
	WebElement drop = driver.findElement(By.xpath("//select[@id='continents']"));
	dropdown(drop);
	WebElement multidrop = driver.findElement(By.xpath("//select[@id='continentsmultiple']"));
	dropdown1(multidrop,"AF");
	sleep();
	//WebElement down = driver.findElement(By.xpath("//a[text()='Why is Testing Necessary?']"));
	//scrollDown(down);
	
	WebElement up = driver.findElement(By.xpath("//h1[text()='Automation Practice Form']"));
	scrollup(up);

	sleep();
	closebrowser();	
}
}
