package stepDefinitions;

import Cucumber.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.CheckOutPage;
import pageObjectModel.HomePage;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
public class myStepDefinition {

    public WebDriver driver;
    HomePage hp;
    CheckOutPage cop;

    @Given("^User is on Greenkart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
        driver = Base.getDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        //Maximize screen
        driver.manage().window().maximize();

        Thread.sleep(3000);
    }
    @When("^User search for (.+) Vegetable$")
    public void user_search_for_Vegetable(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        hp = new HomePage(driver);
        hp.getSearch().sendKeys(arg1);

        Thread.sleep(3000);
    }
    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {

        Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Cucumber - 1 Kg')]")).getText().contains(strArg1));
    }
    @And("^Add items to cart$")
    public void add_items_to_cart() throws Throwable {

        driver.findElement(By.xpath("//a[contains(text(),'+')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    }
    @And("^User proceeded to checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {

        driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    }
}
