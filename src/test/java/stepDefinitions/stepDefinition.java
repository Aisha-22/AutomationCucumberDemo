package stepDefinitions;

import Cucumber.Base;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageObjectModel.CheckOutPage;

@RunWith(Cucumber.class)
public class stepDefinition extends Base{

    CheckOutPage cop;

    @Then("^verify selected (.+) items are displayed in Check out page$")
    public void verify_selected_items_are_displayed_in_check_out_page(String name) throws Throwable {
        cop = new CheckOutPage(driver);
        Assert.assertTrue(cop.getProductName().getText().contains(name));

        Thread.sleep(3000);
    }
}
