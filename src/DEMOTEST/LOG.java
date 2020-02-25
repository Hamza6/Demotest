package DEMOTEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LOG {
	@Test
	public static void main() throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
	            "D:\\chrometest\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver.get("http://192.168.0.104/sophiasoftcrmnew/portal/index.php/login");
	
		driver.findElement(By.name("email")).sendKeys("taimoor.tariq@nybbletech.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.className("btn-login")).click();
		
		Thread.sleep(2000);
		
			if(driver.getCurrentUrl().equals("http://192.168.0.104/sophiasoftcrmnew/portal/index.php/login"))    
		      { 
		            System.out.println("Test Pass"); 
		            driver.close();
		      }
			else 
		      { 	  
		    	  	System.out.println("Test Failed"); 
		    	  	driver.close(); 
		      }
	}

}
