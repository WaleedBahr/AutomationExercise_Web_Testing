import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBase {
    protected static WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
    @BeforeTest
    public void OpenBrowser(){
        driver=new ChromeDriver();
        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();
    }
    public static WebElement bytoWebElement(By locator) {
        return driver.findElement(locator);
    }
    @AfterTest
    public void close_Browser()
    {
        driver.quit();

    }
}
