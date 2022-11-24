package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.searchaproduct_pageObj;

public class searchaproduct_stepDef extends Config {

    searchaproduct_pageObj SP = new searchaproduct_pageObj(driver);

    @And("i enter bedside lamp on the search box")
    public void iEnterGiftCardsOnTheSearchBox() {
        SP.clickonsearchbox();
    }

    @And("i click on search icon")
    public void iClickOnSearchIcon() {
        SP.clickonsearchboxIcon();
    }

    @And("i click on Accent table lamps")
    public void iClickOnAccentTableLamps() {
    SP.iclickonAccenttablelamp();
    }

    @And("i click on Accent table lamp picture")
    public void iClickOnAddToCartForAccentTableLamp() throws InterruptedException {
        SP.iclickonADDTOCARTFORAccenttablelamp();
    }

    @And("i click on Add to cart button")
    public void iClickOnAddToCartButton() {
        SP.iclickonADDToCartAccenttablelamp();
    }

    @And("i click on Shop This Store Popup")
    public void iClickOnShopThisStorePopup() {
        SP.iclickonpopup();
    }


    @And("i click on Second Add to cart button")
    public void iClickOnSecondAddToCartButton() {
        SP.iclickSecondAddtocart();
    }

    @And("i click on SignIn button from product cart page")
    public void iClickOnSignInButtonFromProductCartPage() {
        SP.iclickSignInbutton();
    }

    @And("i enter valid email")
    public void iEnterValidEmail() {
        SP.ientereamil();
    }

    @And("i enter valid password")
    public void iEnterValidPassword() {
        SP.ienterpassword();
    }

    @And("i click on Signin Submit button")
    public void iClickOnSigninSubmitButton() {
        SP.clickonSigninSubmit();
    }
}