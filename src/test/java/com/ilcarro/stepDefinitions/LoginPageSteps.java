
package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginPageSteps {
    @And("User clicks on Log in link")
    public void click_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enter_valid_data() {
        new LoginPage(driver).enterData("bob@gmail.com", "Merkel3000!");
    }

    @And("User clicks on Yalla button")
    public void click_on_Yalla_button() {
        new LoginPage(driver).clickOnYallaButton();
    }

    @And("User enters valid data and invalid password")
    public void enter_valid_email_incalid_passwor(DataTable table) {
        new LoginPage(driver).enterInvalidPasswor(table);
    }

    @Then("User verifies message {string} is displayed")
    public void verify_Message(String message) {
        new LoginPage(driver).isMessageTextPresent(message);
    }
}

