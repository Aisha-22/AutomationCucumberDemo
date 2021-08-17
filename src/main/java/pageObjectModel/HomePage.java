package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Created a constructor
public class HomePage {
    //Created a local variable
    public WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Create a locator with the Variable search
    By search = By.xpath("//input[@type='search']");

    public WebElement getSearch()
    {
       return driver.findElement(search);
    }
}
