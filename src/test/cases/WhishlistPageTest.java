package cases;

import Qafox.com.qa.pages.WhishlistPage;
import com.Qafox.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhishlistPageTest extends TestBase {

    WhishlistPage whishlistPage;



    public WhishlistPageTest(){
     super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
         whishlistPage = new WhishlistPage();
    }



    @Test(priority = 1)
    public void clickMyAccount() {
        whishlistPage.clickonMyAccount();
    }

    @Test(priority = 2)
    public void clickLoginLink() {
        whishlistPage.clickonMyAccount();
        whishlistPage.clickOnLoginLink("Login");
    }



    @Test(priority =3)

    public void verifyLoginFunctionality(){
        whishlistPage.clickonMyAccount();
        whishlistPage.clickOnLoginLink("Login");
        whishlistPage.login(prop.getProperty("emailAddress"),prop.getProperty("Password"));

    }

    @Test(priority = 4)
    public void verifyMyOrderLabel() {
        whishlistPage.clickonMyAccount();
        whishlistPage.clickOnLoginLink("Login");
        whishlistPage.login(prop.getProperty("emailAddress"),prop.getProperty("Password"));
        boolean flag = whishlistPage.validateLoginPageLabel();
        Assert.assertTrue(flag);
    }

    @Test(priority = 5)
    public void clickOnWishlist(){
        whishlistPage.clickonMyAccount();
        whishlistPage.clickOnLoginLink("Login");
        whishlistPage.login(prop.getProperty("emailAddress"),prop.getProperty("Password"));
        whishlistPage.clickOnWhishlistLink();
    }


    @Test(priority = 6)
    public void clickOnContinueBtn(){
        whishlistPage.clickonMyAccount();
        whishlistPage.clickOnLoginLink("Login");
        whishlistPage.login(prop.getProperty("emailAddress"),prop.getProperty("Password"));
        whishlistPage.clickOnWhishlistLink();
        whishlistPage.clickContinueBtn();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
