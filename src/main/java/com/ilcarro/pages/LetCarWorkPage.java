/*
 * created by max$
 */


package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LetCarWorkPage extends BasePage {
    public LetCarWorkPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "pickUpPlace")
    WebElement location;

    public LetCarWorkPage enterLocation(String city) {
        type(location, city);
        pause(1000);
        new Actions(driver).sendKeys(Keys.DOWN, Keys.ENTER).perform();
        return this;
    }

    @FindBy(id = "make")
    WebElement manufacture;

    public LetCarWorkPage enterManufacture(String brand) {
        type(manufacture, brand);
        return this;
    }

    @FindBy(id = "model")
    WebElement modelInput;

    public LetCarWorkPage enterModel(String modelName) {
        type(modelInput, modelName);
        return this;
    }

    @FindBy(id = "year")
    WebElement yearInput;

    public LetCarWorkPage enterYear(String year) {
        type(yearInput, year);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement fuelinput;

    public LetCarWorkPage selectFuel(String fuel) {
        Select select = new Select(fuelinput);
        select.selectByVisibleText(fuel);

        return this;
    }

    @FindBy(id = "seats")
    WebElement seatsInput;

    public LetCarWorkPage enterSeats(String numberOfSeats) {
        type(seatsInput, numberOfSeats);
        return this;
    }

    @FindBy(id = "class")
    WebElement classInput;

    public LetCarWorkPage enterClassAvto(String className) {
        type(classInput, className);
        return this;
    }

    @FindBy(id = "serialNumber")
    WebElement serialNumberInput;

    public LetCarWorkPage enterNumberAvto(String serialNumber) {
        type(serialNumberInput, serialNumber);
        return this;
    }

    @FindBy(id = "price")
    WebElement priceInput;

    public LetCarWorkPage enterPrice(String price) {
        type(priceInput, price);
        return this;
    }

    @FindBy(id = "about")
    WebElement about;

    public LetCarWorkPage enterAboutAvto(String text) {
        type(about, text);
        return this;
    }

    @FindBy(id = "photos")
    WebElement photos;

    public LetCarWorkPage addPhotosAvto(String name) {
        clickWithRectangle(photos, 3, 3);
        pause(1000);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_D);
        pause(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        pause(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);


        return this;
    }

    @FindBy(xpath = "//*[@type='submit']")
    WebElement submitInput;

    public LetCarWorkPage clickOnSubmitButton() {
        click(submitInput);
        return this;
    }
}
