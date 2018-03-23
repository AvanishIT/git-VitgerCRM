package Com.VtigerCRM.Page.Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	
	
	public static void main(String args[]){
		
		System.setProperty("webdriver.gecko.driver","Drivers//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver(); 
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
	
	
	

}
