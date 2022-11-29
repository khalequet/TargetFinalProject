package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class signupandlogin_pageObj extends Config {
    public signupandlogin_pageObj(WebDriver driver){
        PageFactory.initElements(driver,this);
        Config.driver = driver;
    }


    // Locators for Recreateaccount

    @FindBy(how = How.XPATH, using = "//a[@data-test='accountNav-createAccount']")
    public WebElement REcreateAccountLocator;

    @FindBy (how = How.NAME, using = "usernamecreateaccount")
    public WebElement REemailAddressLocator;

    @FindBy (how = How.NAME, using = "firstnamecreateaccount")
    public WebElement REfirstNameLocator;

    @FindBy (how = How.NAME, using = "lastnamecreateaccount")
    public WebElement RElastNameLocator;

    @FindBy (how = How.NAME, using = "phonecreateAccount")
    public WebElement REphoneNumberLocator;

    @FindBy (how = How.NAME, using = "passwordcreateaccount")
    public WebElement REcreatePasswordLocator;

    @FindBy (how = How.XPATH, using = "//*[@id='createAccount']/span")
    public WebElement REcreateAccounttosignupLocator;


    // Functions for Recreateaccount

    public void REclickcreateaccount(){
        REcreateAccountLocator.click();
    }

    public void REenteremailAddresssss(){
        REemailAddressLocator.sendKeys("tonniekhaleque12@gmail.com");
    }

    public void REenterfirstname(){
        REfirstNameLocator.sendKeys("Tina");
    }

    public void REenterlastname(){
        RElastNameLocator.sendKeys("Ahmed");
    }

    public void REenterphonenumberrrr(){
        REphoneNumberLocator.sendKeys("3476980782");
    }
    public void REenterpassword(){
        REcreatePasswordLocator.sendKeys("Password1234!");
    }
    public void REcreateAccounttosignupppp(){
        REcreateAccounttosignupLocator.click();
    }

    public void REverifycreatenewaccountSucessfull() {
        String act = driver.getTitle();
        String exp = "Login: Target";
        Assert.assertEquals(exp, act);
        System.out.println(" Successful SignUp");
    }



    // Locators for signin

    @FindBy(how = How.XPATH, using = "//a[@data-test='accountNav-signIn']")
    public WebElement resignInLocatorforactualsigninpage;

    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public WebElement reemailorphonelocator;

    @FindBy(how = How.XPATH, using = "//input[@autocomplete='current-password']")
    public WebElement passwordforSignInlocator;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement reSignINforTargetLocator;


    @FindBy(how = How.XPATH, using = "//span[@class ='styles__LinkText-sc-u2k6h-3 kzpXPc h-margin-r-x3']")
    public WebElement reSinginconfirmationLocator;



//Functions for signIN
    public void renavigatetosgninpage(){
        resignInLocatorforactualsigninpage.click();

    }

    public void reenteremailorphonenumber(){
        reemailorphonelocator.sendKeys("tonniekhaleque12@gmail.com");

    }


    public void reenterpasswordforSignIn(){
        passwordforSignInlocator.sendKeys("Password1234!");

    }

    public void reclickonSignINbutton(){
        reSignINforTargetLocator.click();
    }

    public void reverifyloginwassuccessfull(){
        String act = driver.getTitle();
        String exp = "Login: Target";
        Assert.assertEquals(exp, act);
        System.out.println("Login was Successful");
    }


}
