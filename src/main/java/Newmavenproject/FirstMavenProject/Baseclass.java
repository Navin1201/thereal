package Newmavenproject.FirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	static WebDriver driver;
	public static void LaunchBrowser(String url) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Navin\\FirstMavenProject\\Driver\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}
	public static void typefdf(WebElement loc,String output) {
		loc.sendKeys(output);

	}
	public static void click(WebElement loc) {
		loc.click();
	}
	
public static void closebrowser() {
	driver.quit();
}
}


