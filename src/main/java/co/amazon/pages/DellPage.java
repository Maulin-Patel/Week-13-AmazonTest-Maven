package uk.co.amazon.pages;

import co.amazon.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DellPage extends Utility {

    By dellList = By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//a/span[contains(text(),'Dell')]");
    By dellLatitude = By.xpath("//span[normalize-space()='Dell Latitude 5430 14.0 Inch FHD Business Laptop, Intel Core i5-1235U, 8GB RAM, 256GB SSD, Windows 11 Pro, Grey']");

    public void printProductList() {
        List<WebElement> d = driver.findElements(dellList);
        for (WebElement e : d) {
            System.out.println(e.getText());
        }
    }

    public int totalProducts() {
        int a = driver.findElements(dellList).size();
        return a;
    }

    public void clickDellLatitude() {
        clickOnElement(dellLatitude);
    }
}
