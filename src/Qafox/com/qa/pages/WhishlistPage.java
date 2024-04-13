package Qafox.com.qa.pages;

import com.Qafox.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WhishlistPage extends TestBase {


    @FindBy(xpath = "//a[@title='My Account']")
    WebElement myAccountLink;


    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement loginLink;



    @FindBy(name ="email")
    WebElement emailAddress;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginBtn;

    @FindBy(xpath = "//h2[normalize-space()='My Orders']")
    WebElement myOrderLabel;


    @FindBy(xpath = "//span[normalize-space()='Wish List (0)']")
    WebElement whishlistLink;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueBtn;


    public WhishlistPage() {
        PageFactory.initElements(driver, this);
    }
    public WhishlistPage clickonMyAccount() {
        myAccountLink.click();
        Reporter.log("Clicked on MyAccount Link");
        return new WhishlistPage();
    }
    public void clickOnLoginLink(String Login) {
        loginLink.click();
        Reporter.log("Clicked On Login Link");
    }

    public void clickLoginLink(){
        Actions action = new Actions(driver);
        action.moveToElement(loginLink).build().perform();
        loginLink.click();
    }


    public void login(String em,String pwd){
        emailAddress.sendKeys(em);
        password.sendKeys(pwd);
        loginBtn.click();
        Reporter.log("Login Operation is Successful");
    }

    public boolean validateLoginPageLabel(){
        return myOrderLabel.isDisplayed();

    }

    public void clickOnWhishlistLink(){
        whishlistLink.click();
        Reporter.log("clicked on Whishlist Link");
    }

    public void clickContinueBtn(){
        continueBtn.click();
    }

}
