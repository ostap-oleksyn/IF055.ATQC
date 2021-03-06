package oolektc.webdriver_task.pageobjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public final List<WebElement> getListOfElements(By element) {
        return driver.findElements(element);
    }

    public final void takeScreenshot(String fileName) {
        try {
            final File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("src//main//resources/" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void hideElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'",
                element);
    }

    public final void changeElementColor(WebElement element, String color) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color =" + color, element);
    }
}
