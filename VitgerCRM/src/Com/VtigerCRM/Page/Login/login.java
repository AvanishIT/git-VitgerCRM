package Com.VtigerCRM.Page.Login;

import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	
	
	public static void main(String args[]){
		
		System.setProperty("webdriver.gecko.driver","Drivers//geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver(); 
		
		driver.get("https://yahoo.com");
		
		driver.manage().window().maximize();
	}
	
	
	

}
