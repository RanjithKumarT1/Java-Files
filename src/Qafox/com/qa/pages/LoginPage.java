package Qafox.com.qa.pages;

import com.Qafox.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginPage extends TestBase {
    LoginPage loginPage;


    @FindBy(xpath = "//a[@title='My Account']")
    WebElement MyAccountLink;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement LoginLink;


    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement newCustomerHeaderLabel;

    @FindBy(name ="email")
    WebElement emailAddress;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement signUPBtn;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

   public LoginPage clickonMyAccount() {
        MyAccountLink.click();
       Reporter.log("Clicked on MyAccount Link");
        return new LoginPage();
    }

    public void clickOnLoginLink(String Login){
        LoginLink.click();
        Reporter.log("Clicked On Login Link");
        /*Select select = new Select(driver.findElement(By.xpath("//a[normalize-space()='Login']")));
        select.selectByVisibleText(Login);*/
    }

    public void clickLoginLink(){
        Actions action = new Actions(driver);
        action.moveToElement(LoginLink).build().perform();
        LoginLink.click();
    }

    public boolean validateLoginPageLable(){
        return newCustomerHeaderLabel.isDisplayed();

    }

    public void login(String em,String pwd){
        emailAddress.sendKeys(em);
        password.sendKeys(pwd);
        loginBtn.click();
        Reporter.log("Login Operation is Successful");
    }



}







