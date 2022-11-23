package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import pageObject.searchaproduct_pageObj;

public class searchaproduct_stepDef extends Config {

    searchaproduct_pageObj SP = new searchaproduct_pageObj(driver);
    @And("i enter Gift Cards on the search box")
    public void iEnterGiftCardsOnTheSearchBox() {
        SP.clickonsearchbox();
    }

    @And("i click on search icon")
    public void iClickOnSearchIcon() {
        SP.clickonsearchboxIcon();
    }

    @And("i click on specialty gift cards")
    public void iClickOnSpecialtyGiftCards() {
        SP.clickonSpecialtyGiftCards();
    }


    @And("i click on Starbucks gift card link")
    public void iClickOnStarbucksGiftCardFromTheExploreItemsPopup() throws InterruptedException {
        SP.clickonStarbucksGiftCards();
    }

    @And("i click on value ${int}")
    public void iClickOnValue$(int arg0) {
        SP.clickonvalue();
    }

    @And("i click on Add to Cart")
    public void iClickOnAddToCart() {
        SP.clickonAddTOCart();
    }
}
