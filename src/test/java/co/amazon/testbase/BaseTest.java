package co.amazon.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import co.amazon.propertyreader.PropertyReader;
import co.amazon.utilities.Utility;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}