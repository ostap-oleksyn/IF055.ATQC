package oolektc.webdriver_task.pageobjects;

import static oolektc.webdriver_task.locators.Locators.*;

import org.openqa.selenium.WebDriver;

public final class GoogleHomePage extends BasePage {

    private static final GoogleHomePage HOME_PAGE = new GoogleHomePage();

    public static GoogleHomePage getHomePage(WebDriver driver) {
        BasePage.driver = driver;
        return HOME_PAGE;
    }

    public SearchResultPage doSearchFor(String searchTerm) {
        driver.findElement(SEARCH_FIELD).clear();
        driver.findElement(SEARCH_FIELD).sendKeys(searchTerm);
        driver.findElement(SEARCH_FIELD).sendKeys(Keys.ENTER);
        return SearchResultPage.getSearchResultPage(driver);
    }
}