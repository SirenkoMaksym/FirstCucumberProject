/*
 * created by max$
 */


package com.ilcarro.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    JavascriptExecutor js;
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void launchBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public  boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public void openURL() {
        driver.get("https://ilcarro.web.app");
    }

    public void quiteBrowser() {
        driver.quit();
    }
    public void pause(int millis){
        try{
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickWithRectangle(WebElement element, int x, int y) {
        Rectangle rectangle = element.getRect();
        int offSetX = rectangle.getWidth() / x;
        int offSetY = rectangle.getHeight() / y;

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.moveByOffset(-offSetX, -offSetY).click().perform();

    }
    public void clickWithJS(WebElement element, int x, int y) {
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
        click(element);
    }
}
