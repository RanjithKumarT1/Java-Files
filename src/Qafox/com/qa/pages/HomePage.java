package Qafox.com.qa.pages;

import com.Qafox.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath = "//a[normalize-space()='Qafox.com']")
    WebElement logoName;

    @FindBy(xpath = "//a[@title='My Account']")
    WebElement MyAccountLink;


    @FindBy(xpath = "//a[@id='wishlist-total']//i[@class='fa fa-heart']")
    WebElement Whishlist;

    @FindBy(xpath = "//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")
    WebElement AddingCart;


    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public String verifyHomePageTitle(){
        return driver.getTitle();
    }

    public HomePage clickonMyAccount(){
        MyAccountLink.click();
        return new HomePage();

    }

    public WhishlistPage Whishlist(){
        Whishlist.click();
        return new WhishlistPage();
    }
    public AddingCartPage AddingCart(){
        AddingCart.click();
        return new AddingCartPage();
    }









}
