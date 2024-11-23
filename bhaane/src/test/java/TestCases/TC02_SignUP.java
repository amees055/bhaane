package TestCases;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObject.LoginPage;



public class TC02_SignUP extends BaseClass{
	
	@Test
	
	public void signup() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"mdiv\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"top-header\"]/div/div/div[4]/ul/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"modal-login\"]/div/form/div[4]/div")).click();
		
		LoginPage lp= new LoginPage(driver);
		
	
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String randomString = RandomStringUtils.random(5, alphabet);
		
		
		 String fname = randomString;
		lp.SetFirstname(fname);
		 String lname = randomString;
			lp.SetLastname(lname);
		 String emailID = randomString+"@example.com";
		lp.SetEmail(emailID);
		
		driver.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[1]/div[4]/div/div/input")).sendKeys("9004915002");
		driver.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[1]/div[5]/div/input")).sendKeys("Seema@1234");
		driver.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[2]/button")).click();
		Thread.sleep(2000);

	}

}
