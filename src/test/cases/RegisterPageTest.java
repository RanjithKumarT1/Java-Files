package cases;

import Qafox.com.qa.pages.RegisterPage;
import com.Qafox.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.TestUtil;

public class RegisterPageTest extends TestBase {
    RegisterPage registerPage;


    public RegisterPageTest(){
        super();
    }


    @BeforeMethod
    public void setUp(){
        initialization();
        registerPage = new RegisterPage();
    }
    @Test(priority = 1)
    public void clickonMyAccount(){
        registerPage.clickOnMyAccount();
    }
    @Test(priority = 2)
    public void clickOnRegisterLink(){
        registerPage.clickOnMyAccount();
        registerPage.clickRegisterLink();
    }

    @Test(priority = 3)
    public void verifyRegisterAccountLabel(){
        registerPage.clickOnMyAccount();
        registerPage.clickRegisterLink();
        boolean flag = registerPage.validateRegisterLabel();
        Assert.assertTrue(flag);
    }

   /* @DataProvider
    public static Object[][] testData(String excelPath, String sheetName){
        TestUtil excel = new TestUtil(excelPath,sheetName);
        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();

        Object data[][] = new Object[rowCount][colCount];

        for(int i = 1; i<rowCount;i++){
            for(int j = 0;j<colCount;j++){
                String cellData = excel.getcelldataString(i,j);
                System.out.println(cellData);
                data[i-1][j] = cellData;
            }
        }
        return data;
    }*/
    @Test(priority = 4)
    //public void verifyRegisterAccountFunctionality(String firstname,String lastname,String email,String telephone,String password,String passwordconfirm){
        public void verifyRegisterAccountFunctionality(){
        registerPage.clickOnMyAccount();
        registerPage.clickRegisterLink();
        registerPage.registerNewAccount("kiran","kumar","kiran@gmail.com","983456782","King123","King123");
        //registerPage.registerNewAccount(firstname,lastname,email,telephone,password,passwordconfirm);

    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
