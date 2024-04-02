import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class search_TestCase extends TestBase{

    @Test
    public void searchTest (){
        By verifyHomePage = By.cssSelector("html[lang=\"en\"]");
        if(bytoWebElement(verifyHomePage).isDisplayed()) {
            System.out.println("home page is visible successfully");
        }
        By productButton = By.cssSelector("a[href=\"/products\"]");
        bytoWebElement(productButton).click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By verifyProductsPage = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
        String Expected = "ALL PRODUCTS";
        String Actual =bytoWebElement(verifyProductsPage).getText();
        softAssert.assertTrue(Actual.contains(Expected));
        By searchProducts = By.name("search");
        bytoWebElement(searchProducts).sendKeys("Tshirt");
        By searchButton = By.id("submit_search");
        bytoWebElement(searchButton).click();
        softAssert.assertAll();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }


    }


