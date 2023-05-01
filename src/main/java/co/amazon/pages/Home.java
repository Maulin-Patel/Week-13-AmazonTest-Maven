package co.amazon.pages;

import co.amazon.utilities.Utility;
import org.openqa.selenium.By;

public class Home extends Utility {

    By cookies = By.id("sp-cc-accept");
    By searchBar = By.xpath("//input[@id='twotabsearchtextbox']");
    By searchBtn = By.id("nav-search-submit-button");
    By dellCheckbox = By.xpath("//div[@id='brandsRefinements']//li[@id='p_89/Dell']//i[@class='a-icon a-icon-checkbox']");

    public void acceptCookies() {
        clickOnElement(cookies);
    }

    public void searchDellLaptop() {
        sendTextToElement(searchBar, "Dell Laptop");
    }

    public void clickSearch() {
        clickOnElement(searchBtn);
    }

    public void selectDellCheckbox() {
        clickOnElement(dellCheckbox);
    }
}
