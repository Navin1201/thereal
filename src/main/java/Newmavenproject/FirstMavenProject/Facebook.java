package Newmavenproject.FirstMavenProject;


public class Facebook extends Baseclass{
	public static void main(String[] args) {
		LaunchBrowser("https://www.redbus.in/?gclid=EAIaIQobChMIoIOSuqOl5AIVg4RwCh15VgVuEAAYASAAEgJ95fD_BwE");
	//	WebElement e = driver.findElement(By.xpath("//input[@id='email']"));
	// type(e,"cseachamp@gmail.com");
    // WebElement p = driver.findElement(By.xpath("//input[@type='password']"));
	//	type(p,"alliswelll");
	//	WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
	//	click(btn);
	//	closebrowser(); 
		
		Facebooklocators f = new Facebooklocators();
		typefdf(f.getTxtEmail(), "chennai");
		typefdf(f.getTxtPass(), "55656565");
		click(f.getBtnlogin());
		closebrowser();	
	}

}
//stype(f.getTxtEmail(),"cseachamp@gmail.com");