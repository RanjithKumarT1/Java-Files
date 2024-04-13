package cases;

import Qafox.com.qa.pages.HomePage;
import Qafox.com.qa.pages.LoginPage;
import com.Qafox.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;


    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
       loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test(priority = 1)
    public void homePageTitleTest(){
      String title = homePage.verifyHomePageTitle();
        Assert.assertEquals(title,"Your Store");
    }

    @Test(priority = 2)
    public void MyAccount(){
        homePage.clickonMyAccount();

    }
    @Test(priority = 3)
    public void Whishlist(){
        homePage.Whishlist();
    }
    @Test(priority = 4)
    public void AddingCart(){
        homePage.AddingCart();
    }




    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }



}
