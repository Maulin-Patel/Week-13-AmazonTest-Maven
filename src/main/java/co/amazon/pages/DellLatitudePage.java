package uk.co.amazon.pages;

import co.amazon.utilities.Utility;
import org.openqa.selenium.By;

public class DellLatitudePage extends Utility {

    By latitude5430 = By.xpath("//span[@id='productTitle']");

    public String actualText() {
        return getTextFromElement(latitude5430);
    }
}
