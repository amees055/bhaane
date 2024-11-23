package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC04_footer extends BaseClass {
	@Test
	
	public void footerscroller() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"mdiv\"]")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div/div/div[1]/ul/li[1]/a")).click();

		 By store = By.xpath("/html/body/div[7]/footer/div[2]/div/p/b"); //store
		 WebElement element = driver.findElement(store);
		 String elementText = element.getText();
		 System.out.println("Store Location: " + elementText);
		 
		driver.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div/div/div[1]/ul/li[2]/a")).click();
		
		 By about = By.xpath("/html/body/div[7]/footer/div[2]/div/div/div[2]/h3"); //about
		 WebElement element1 = driver.findElement(about);
		 String elementText1 = element1.getText();
		 System.out.println("About: " + elementText1);
		 
		 driver.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div/div/div[1]/ul/li[3]/a")).click();
			
		 By contact = By.xpath("/html/body/div[7]/footer/div[2]/div/p[2]/a"); //contact
		 WebElement element2 = driver.findElement(contact);
		 String elementText2 = element2.getText();
		 System.out.println("Contact: " + elementText2);
		 
		 
			Thread.sleep(1000);

		 driver.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div/div/div[1]/ul/li[4]/a")).click(); //subscribe
		 driver.findElement(By.xpath("/html/body/div[7]/footer/div[2]/div/div[2]/div/div[1]/form/div[1]/input")).sendKeys("amees");
		 driver.findElement(By.xpath("/html/body/div[7]/footer/div[2]/div/div[2]/div/div[1]/form/div[2]/input")).sendKeys("amees@mailinator.com");
	//	 driver.findElement(By.xpath("/html/body/div[7]/footer/div[2]/div/div[2]/div/div[1]/form/button")).click(); 

			Thread.sleep(1000);

		 driver.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div/div/div[1]/ul/li[5]/a")).click(); //exchange
		 Object[] windowHandles=driver.getWindowHandles().toArray();
	        driver.switchTo().window((String) windowHandles[1]);
	        By exchange = By.xpath("/html/body/div[7]/div[2]/div/div/div/div/div/h1"); //Exchange
			 WebElement element3 = driver.findElement(exchange);
			 String elementText3 = element3.getText();
			 System.out.println("Exchange Header: " + elementText3);
			 
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(1000);

			
			 driver.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div/div/div[1]/ul/li[6]/a")).click(); //shipping
			 Object[] windowHandles1=driver.getWindowHandles().toArray();
		        driver.switchTo().window((String) windowHandles1[1]);
		        Thread.sleep(1000);
		        By shipping = By.xpath("/html/body/div[7]/div[2]/div/div/div/div/div/h1"); //Shipping
				 WebElement element4 = driver.findElement(shipping);
				 String elementText4 = element4.getText();
				 System.out.println("Shipping Header: " + elementText4);
				 
				 Thread.sleep(1000);
		        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(1000);

				
				 driver.findElement(By.xpath("/html/body/div[7]/footer/div[1]/div/div/div[1]/ul/li[7]/a")).click(); //terms
				 Object[] windowHandles2=driver.getWindowHandles().toArray();
			        driver.switchTo().window((String) windowHandles2[1]);
			        By term = By.xpath("/html/body/div[7]/div[2]/div/div/div/div/div/h1"); //Term
					 WebElement element5 = driver.findElement(term);
					 String elementText5 = element5.getText();
					 System.out.println("Term Header: " + elementText5);


		 
		Thread.sleep(3000);
	}

}
