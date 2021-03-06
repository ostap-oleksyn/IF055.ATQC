package oarabtc.task_webdriver.page_object;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public abstract class PageObjectPage {

    protected WebDriver driver;

    public PageObjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenshot() throws IOException {
        FileUtils.copyFile(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE), new File("src//main//resources/screenshot.png"));
    }
}
