package sazartc.google_test.page_objects;

import org.openqa.selenium.*;

/*
 * PageObject class for Google Home
 */
public class GoogleHomePage extends PageObjectBase {

    private WebElement searchInput;
    private WebElement logo;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
        logo = driver.findElement(By.id(locators.getProperty("HOMEPAGE_LOGO")));
        searchInput = driver.findElement(By.name(locators.getProperty("SEARCH_INPUT")));
    }

    public void setLogoNotVisible() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'", logo);
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public SearchResultsPage searchFor(String searchText) {
        searchInput.sendKeys(searchText);
        searchInput.sendKeys(Keys.RETURN);
        return new SearchResultsPage(driver);
    }
}
