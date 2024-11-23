package TestCases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class TC03_BuyProduct extends BaseClass {
@Test
	public void product() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"mdiv\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"rows\"]/div[1]/a/div/img")).click();
	Thread.sleep(3000);
    Object[] windowHandles=driver.getWindowHandles().toArray();
    driver.switchTo().window((String) windowHandles[1]);
	driver.findElement(By.xpath("//*[@id=\"products\"]/div[1]/a/div")).click();
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/div/div[2]/div/form/div[1]/div/label[2]")).click();
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/div/div[2]/div/form/div[3]/div/button[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"modal-bag\"]/div/div[1]/div[3]/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"cart\"]/div[1]/div[2]/a/button")).click();
	driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[1]/div[2]/div[2]/button/u")).click();
	
	
	LoginPage lp= new LoginPage(driver);
	
	lp.setUserName(username);
	lp.SetPassword(password);
	lp.Clicksubmit();
	
	//Add addresss
	
	driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[1]/button")).click();

	
	  WebElement country = driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[1]/div/select"));
      country.click();
      
	 Select dp1 = new Select(country);
     dp1.selectByValue("101");
  
     WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]"));
     country.click();
     
	 Select dp2 = new Select(state);
    dp2.selectByValue("Maharashtra");
    
    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[3]/div/input")).sendKeys("seema");
    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[4]/div/input")).sendKeys("chauhan");
    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[5]/div/input")).sendKeys("boppo");
    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[6]/div/div/input")).sendKeys("9004915002");
    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[7]/div/input")).sendKeys("Bhandup");
    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[8]/div/input")).sendKeys("west");
    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[9]/div/input")).sendKeys("mumbai");
    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[10]/div/input")).sendKeys("123456");
    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/button[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[1]/div/div/div[2]/button[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[3]/div/div/div[2]/form/div[2]/label/span[1]/span")).click();
   // driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[3]/div/div/div[2]/form/div[3]/button")).click();
	Thread.sleep(1000);




    
    
	
	
	
	
		
		
		
		
	}
}
