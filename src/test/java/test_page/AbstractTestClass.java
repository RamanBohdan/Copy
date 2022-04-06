package test_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AbstractTestClass {

    public static WebDriver webDriver;
    String WEB_URL = "http://svyatoslav.biz/testlab/wt";

    @BeforeClass
    public static void beforeAll() {
        webDriver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() {

        webDriver.quit();
    }

}
