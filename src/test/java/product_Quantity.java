import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class product_Quantity extends TestBase{
    @Test
    public void verify_ProductQuantity(){
        By verifyHomePage = By.cssSelector("html[lang=\"en\"]");
        if(bytoWebElement(verifyHomePage).isDisplayed()) {
            System.out.println("home page is visible successfully");
        }
        By viewProduct = By.cssSelector("a[href=\"/product_details/2\"]");
        bytoWebElement(viewProduct).click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By quantityNumber = By.name("quantity");
        bytoWebElement(quantityNumber).clear();
        bytoWebElement(quantityNumber).sendKeys("4");
        By addCart = By.cssSelector("button[type=\"button\"]");
        bytoWebElement(addCart).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By viewCart = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a");
        bytoWebElement(viewCart).click();
        softAssert.assertAll();

    }

}
