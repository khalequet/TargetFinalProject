package pageObject;

import base.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


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

    @FindBy(how = How.LINK_TEXT, using = "Specialty Gift Cards")
    public WebElement SpecialtyGiftCardsLocator;


    @FindBy(how = How.ID, using = "addToCartButtonOrTextIdFor52804129")
    public WebElement StarbucksGiftCardsLocator;

    @FindBy(how = How.LINK_TEXT, using = "$50")
    public WebElement valueLocator;

    @FindBy(how = How.XPATH, using = "//button[@class='BaseButton-sc-j0jbcc-0 ButtonPrimary-sc-1qgspc1-0 fdaZTm eitQue']")
    public WebElement AddtoCartLocator;


    //Function

    public void clickonsearchbox() {
        searchboxLocator.sendKeys("Gift Cards");
    }

    public void clickonsearchboxIcon() {
        searchboxIconLocator.click();
    }

    public void clickonSpecialtyGiftCards() {
        SpecialtyGiftCardsLocator.click();
    }

    public void clickonStarbucksGiftCards()  {

        JavascriptExecutor js = (JavascriptExecutor) driver;

       // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

       js.executeScript("window.scrollBy(0, 100)");

        WebElement star = driver.findElement(By.xpath("//*[@id='addToCartButtonOrTextIdFor52804129']"));
        js.executeScript("arguments[0].click()");

    }


    public void clickonvalue() {
        valueLocator.click();
    }
    public void clickonAddTOCart() {
        AddtoCartLocator.click();
    }




// js.executeScript("window.scrollBy(0,5700)");

//        Actions actions = new Actions(driver);
//        WebElement star = driver.findElement(By.xpath("//*[@id='addToCartButtonOrTextIdFor52804129']"));
//        actions.moveToElement(star).build().perform();


   JavascriptExecutor js = (JavascriptExecutor) driver;
//    WebElement star = driver.findElement(By.xpath("//button[@aria-label='Add Starbucks Gift Card $25 (Email Delivery) to cart']"));
//        js.executeScript("arguments[0].scrollIntoView()",star);
 //     js.executeScript("window.scrollBy(0,5700)");
////        Thread.sleep(3000);
////        StarbucksGiftCardsLocator.click();
//                js.executeScript("arguments[0].click()");



//        WebElement moon = driver.findElement(By.xpath("//*[@id='addToCartButtonOrTextIdFor52804129']"));
//        new Actions(driver)
//                .moveToElement(moon)
//                .perform();

}