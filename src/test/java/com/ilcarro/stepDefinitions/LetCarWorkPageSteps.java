/*
 * created by max$
 */


package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.LetCarWorkPage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LetCarWorkPageSteps {

    @And("User confirmes Success Message is displayed")
    public void confirmes_success_message() {
        new LoginPage(driver).confirmMessage();
    }

    @And("User clicks on Let the car work link")
    public void click_on_Let_thr_car_work_link() {
        new LoginPage(driver).clickOnLetCarWorkLink();
    }

    @And("User enters valid data avto")
    public void enters_valid_data(){
        new LetCarWorkPage(driver).enterLocation("Tel Aviv")
                .enterManufacture("Lamborghini")
                .enterModel("Diablo")
                .enterYear("2024")
                .selectFuel("Hybrid")
                .enterSeats("7")
                .enterClassAvto("S")
                .enterNumberAvto("AH7775EX")
                .enterPrice("599.999.00€")
                .enterAboutAvto("Very good car but a little expensive")
                .addPhotosAvto("Lamborghini_Diablo")
                ;
    }
    @And("User clicks on Submit button")
    public void click_on_submit_button(){
        new LetCarWorkPage(driver).clickOnSubmitButton();
    }





}
