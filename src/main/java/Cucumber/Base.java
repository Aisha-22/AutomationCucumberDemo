package Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;

    //Declare a Method
    public static WebDriver getDriver() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\user\\IdeaProjects\\AutomationCucumberDemo\\src\\main\\java\\Cucumber\\global.properties");

        prop.load(fis);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();//Launch Chrome Browser
        driver.get(prop.getProperty("url"));
        return driver;
    }
}
