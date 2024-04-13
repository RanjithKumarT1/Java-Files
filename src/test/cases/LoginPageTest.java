package cases;

import Qafox.com.qa.pages.HomePage;
import Qafox.com.qa.pages.LoginPage;
import com.Qafox.base.TestBase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
    }
    @Test(priority = 1)
    public void clickMyAccount() {
        loginPage.clickonMyAccount();
    }
      @Test(priority = 2)
    public void clickLoginLink() {
          loginPage.clickonMyAccount();
        loginPage.clickOnLoginLink("Login");
    }

    @Test(priority = 3)
    public void verifyNewCustomerLabel(){
        loginPage.clickonMyAccount();
        loginPage.clickOnLoginLink("Login");
        boolean flag = loginPage.validateLoginPageLable();
        Assert.assertTrue(flag);
    }

    @Test(priority = 4)
    public void verifyLoginFunctionality(){
        loginPage.clickonMyAccount();
        loginPage.clickOnLoginLink("Login");
        loginPage.login(prop.getProperty("emailAddress"),prop.getProperty("Password"));

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
