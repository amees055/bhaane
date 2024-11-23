package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	//constructor
	public LoginPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
@FindBy(xpath="//*[@id='modal-login']/div/form/div[1]/input")
@CacheLookup
WebElement txtusername;

@FindBy(xpath="//*[@id='modal-login']/div/form/div[2]/input")
@CacheLookup
WebElement txtpassword;

@FindBy(xpath="//*[@id='modal-login']/div/form/div[4]/button")
@CacheLookup
WebElement loginbtn;


//signUP
@FindBy(xpath="//*[@id=\"modal-register\"]/div/form/div[1]/div[1]/div/input")
@CacheLookup
WebElement txtfirst;

@FindBy(xpath="//*[@id=\"modal-register\"]/div/form/div[1]/div[2]/div/input")
@CacheLookup
WebElement txtlast;

@FindBy(xpath="//*[@id=\"modal-register\"]/div/form/div[1]/div[3]/div/input")
@CacheLookup
WebElement txtemail;

@FindBy(xpath="///*[@id=\"modal-register\"]/div/form/div[1]/div[4]/div/div/input")
@CacheLookup
WebElement txtmobile;

@FindBy(xpath="//*[@id=\"modal-register\"]/div/form/div[1]/div[5]/div/input")
@CacheLookup
WebElement txtpass;

@FindBy(xpath="//*[@id=\"modal-register\"]/div/form/div[2]/button")
@CacheLookup
WebElement btnsignup;




//action method
public void setUserName(String uname)
{
	txtusername.sendKeys(uname);
	
}
public void SetPassword (String Pwd)
{
	txtpassword.sendKeys(Pwd);
}
public void Clicksubmit()
{
	loginbtn.click();
}

public void SetFirstname (String firstname)
{
	txtfirst.sendKeys(firstname);
}
public void SetLastname (String lastname)
{
	txtlast.sendKeys(lastname);
}
public void SetEmail (String email)
{
	txtemail.sendKeys(email);
}
public void SetMobile (String mobileno)
{
	txtmobile.sendKeys(mobileno);
}
public void SetPass (String password)
{
	txtpass.sendKeys(password);
}
public void SubmitBtn (String submit)
{
	btnsignup.sendKeys(submit);
}



}
