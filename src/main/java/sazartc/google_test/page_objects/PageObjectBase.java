package sazartc.google_test.page_objects;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

/*
 * Base Page Object class for Pages
 */

public abstract class PageObjectBase {
    protected WebDriver driver;
    final protected Properties locators = new Properties();

    public PageObjectBase(WebDriver driver) {
        this.driver = driver;
        final String LOCATORS_FILE_NAME = "sazartc\\google_test\\locators.prop";

        try {
            locators.load(getClass()
                    .getClassLoader()
                    .getResourceAsStream(LOCATORS_FILE_NAME));
        } catch (IOException ioe) {
            //TODO rename
            ioe.printStackTrace();
        }
    }
}
