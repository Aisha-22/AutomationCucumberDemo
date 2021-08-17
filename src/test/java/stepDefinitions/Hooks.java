package stepDefinitions;

import Cucumber.Base;
import cucumber.api.java.After;

public class Hooks extends Base {

    @After("@SmokeTest")
    public void AfterValidationTest()
    {
        driver.close();
    }

    @After("@RegressionTest")
    public void AfterSeleniumTest()
    {
        driver.close();
    }
}
