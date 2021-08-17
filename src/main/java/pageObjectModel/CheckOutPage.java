package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
    public WebDriver driver;

    public CheckOutPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By search = By.cssSelector("div.container div.products-wrapper:nth-child(2) div.products table.cartTable:nth-child(1) tbody:nth-child(2) tr:nth-child(1) td:nth-child(2) > p.product-name");

    public WebElement getProductName()
    {
        return driver.findElement(search);
    }
}
