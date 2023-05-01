package co.amazon.testsuite;

import co.amazon.pages.Home;
import co.amazon.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.amazon.pages.DellLatitudePage;
import uk.co.amazon.pages.DellPage;

public class AmazonTest extends BaseTest {

    Home home = new Home();
    DellPage dellPage = new DellPage();
    DellLatitudePage latitudePage = new DellLatitudePage();

    @Test
    public void amazon() {

        home.acceptCookies();
        home.searchDellLaptop();
        home.clickSearch();
        home.selectDellCheckbox();
        Assert.assertEquals(dellPage.totalProducts(), 29);
        dellPage.printProductList();
        dellPage.clickDellLatitude();
        Assert.assertEquals(latitudePage.actualText(), "Dell Latitude 5430 14.0 Inch FHD Business Laptop, Intel Core i5-1235U, 8GB RAM, 256GB SSD, Windows 11 Pro, Grey");
    }
}
