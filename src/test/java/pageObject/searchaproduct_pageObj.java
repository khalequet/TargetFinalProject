package pageObject;

import base.Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class searchaproduct_pageObj extends Config {

    public searchaproduct_pageObj(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }


    // Locator

    @FindBy(how = How.ID, using = "search")
    public WebElement searchboxLocator;

    @FindBy(how = How.XPATH, using = "//button[@data-test='@web/Search/SearchButton']")
    public WebElement searchboxIconLocator;

    @FindBy(how =How.LINK_TEXT,using = "Accent table lamps")
    public WebElement AccenttablelampLocator;

    @FindBy(how=How.XPATH,using = "//*[@id='pageBodyContainer']/div[1]/div/div[4]/div/div[1]/div[2]/div/section/div/div[1]/div/div/div[1]/div[1]/h3/div/div/a/div[1]/picture/img")
    public WebElement AccenttablelamppicyureTLocator;

    @FindBy(how=How.XPATH,using = "//*[@id='addToCartButtonOrTextIdFor83223533']")
    public WebElement AddtoCartLocator;

    @FindBy(how=How.XPATH,using = "//button[@aria-label='close']")
    public WebElement ShopThisStoreLocator;
    @FindBy(how=How.XPATH,using = "//button[@aria-label='Add to cart for Fluted Ceramic Mini Table Lamp Dark Gray - Threshold™']")
    public WebElement SecondAddtoCartLocator;
    @FindBy(how =How.XPATH,using = "//button[@data-test='delivery-address-picker-sign-in-button']")
    public WebElement SIgnInbuttonLocator;

    @FindBy(how = How.XPATH,using = "//*[@id='username']")
    public WebElement EmailLocator;
    @FindBy(how = How.XPATH,using = "//*[@id='password']")
    public WebElement passLocator;
    @FindBy(how = How.XPATH,using = "//*[@type='submit']")
    public WebElement SIgnInSubmitLocator;



    //Function


    public void clickonsearchbox() {
        searchboxLocator.sendKeys("bedside lamp");
    }

    public void clickonsearchboxIcon() {
        searchboxIconLocator.click();
    }

    public void iclickonAccenttablelamp(){
        AccenttablelampLocator.click();
    }

    public void iclickonADDTOCARTFORAccenttablelamp() throws InterruptedException {
        Thread.sleep(3000);
        AccenttablelamppicyureTLocator.click();
    }
    public void iclickonADDToCartAccenttablelamp(){
        AddtoCartLocator.click();
    }
    public void iclickonpopup(){
        ShopThisStoreLocator.click();
    }

    public void iclickSecondAddtocart(){
        SecondAddtoCartLocator.click();
    }
    public void iclickSignInbutton(){
        SIgnInbuttonLocator.click();
    }

    public void ientereamil(){
        EmailLocator.sendKeys("tomaarni12@gmail.com");
    }

    public void ienterpassword(){
        passLocator.sendKeys("Candy123!");
    }

    public void clickonSigninSubmit(){
        SIgnInSubmitLocator.click();
    }



    }


