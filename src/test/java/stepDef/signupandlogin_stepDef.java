package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.signupandlogin_pageObj;

public class signupandlogin_stepDef extends Config {

    signupandlogin_pageObj spj = new signupandlogin_pageObj(driver);

    @And("i click on sign in button to navigate to sign in")
    public void iClickOnSignInButtonToNavigateToSignIn() {
        spj.renavigatetosgninpage();
    }

    @And("i enter email or phone number to sign in")
    public void iEnterEmailOrPhoneNumberToSignIn() {
        spj.reenteremailorphonenumber();
    }

    @And("i enter password to sign in")
    public void iEnterPasswordToSignIn() {
        spj.reenterpasswordforSignIn();
    }

    @When("i click on SignInbutton")
    public void iClickOnSignInbutton() {
        spj.reclickonSignINbutton();
    }


    @Then("i should be able to reSignin successfully")
    public void iShouldBeAbleToReSigninSuccessfully() {
        spj.reverifyloginwassuccessfull();
    }



    ///

    @And("i click on create account from tagethomepage")
    public void iClickOnCreateAccountFromTagethomepage() {
        spj.REclickcreateaccount();
    }

    @And("i enter valid email address from create account page")
    public void iEnterValidEmailAddressFromCreateAccountPage() {
        spj.REenteremailAddresssss();
    }

    @And("i enter first name from create account page")
    public void iEnterFirstNameFromCreateAccountPage() {
        spj.REenterfirstname();
    }

    @And("i enter last name from create account page")
    public void iEnterLastNameFromCreateAccountPage() {
        spj.REenterlastname();
    }

    @And("i enter email or phone number from create account page")
    public void iEnterPhoneNumberFromCreateAccountPage() {
        spj.REenterphonenumberrrr();
    }

    @And("i enter create password from create account page")
    public void iEnterCreatePasswordFromCreateAccountPage() {
        spj.REenterpassword();
    }

    @When("i click on the create account button from create account page")
    public void iClickOnTheCreateAccountButtonFromCreateAccountPage() {
        spj.REcreateAccounttosignupppp();
    }

    @Then("i should be able to successfully createanaccount")
    public void iShouldBeAbleToSuccessfullyCreateanaccount() {

    }
}
