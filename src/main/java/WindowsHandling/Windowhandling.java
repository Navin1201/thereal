package WindowsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Navin\\FirstMavenProject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("iphone");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement iphone = driver.findElement(By.xpath("//p[text()='Apple iPhone 6s ( 32GB , 2 GB ) Space Grey']"));
iphone.click();

String parent = driver.getWindowHandle();
System.out.println(parent);

Set<String> allwindows = driver.getWindowHandles();
for(String x:allwindows) {
	if(!parent.equals(x)) {
		driver.switchTo().window(x);
	}
}

 driver.findElement(By.xpath("//a[contains(text(),'T&C')]")).click();
 
 driver.switchTo().defaultContent();
 
 Set<String> allwindows1 = driver.getWindowHandles();
 
 ArrayList<String> li = new ArrayList<String>();
 
 li.addAll(allwindows1);
 
 String s = li.get(2);
 
 driver.switchTo().window(s);
 

 Thread.sleep(50000);
 driver.findElement(By.xpath("(//a[text()='Apply Now'])[1]")).click();

 driver.switchTo().defaultContent();
 Set<String> allwindows2 = driver.getWindowHandles();

 ArrayList<String> li1 = new ArrayList<String>();
li1.addAll(allwindows2);
 String string = li1.get(3);
 driver.switchTo().window(string);
 Thread.sleep(5000);
 driver.findElement(By.xpath("//a[text()='www.snapdeal.com']")).click();
}
}
