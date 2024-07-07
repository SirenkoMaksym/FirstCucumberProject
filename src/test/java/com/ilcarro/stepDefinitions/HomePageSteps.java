/*
 * created by max$
 */


package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class HomePageSteps {
    @Given("User launches Chrome browser")
    public void launch_Chrome_browser() {
        new HomePage(driver).launchBrowser();
    }

    @When("User opens ilcarro Home Page")
    public void open_HomePage() {
        new HomePage(driver).openURL();
    }

    @Then("User verifies Home page title is displayed")
    public void verify_Home_page_title() {
        new HomePage(driver).isHomePageTitleDisplayed();
    }
    @And("User quites browser")
    public void quite_browser(){
        new HomePage(driver).quiteBrowser();
    }
}
