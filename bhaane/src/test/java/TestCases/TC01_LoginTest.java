package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC01_LoginTest extends BaseClass{
	@Test
	public void login() throws  InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mdiv\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top-header\"]/div/div/div[4]/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"modal-login\"]/div/form/div[1]/input")).sendKeys("amees055@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"modal-login\"]/div/form/div[2]/input")).sendKeys("Seema@1234");
		driver.findElement(By.xpath("//*[@id=\"modal-login\"]/div/form/div[4]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"top-header\"]/div/div/div[4]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div[1]/div[3]/div[3]/a")).click();
	}
}
