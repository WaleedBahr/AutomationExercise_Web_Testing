import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.NoSuchElementException;
import java.time.Duration;

public class valid_logIn_TestCase extends TestBase {

    @Test
    public void Login_Test() {
        By pageVisible = By.tagName("h2");
        if(bytoWebElement(pageVisible).isDisplayed()) {
            System.out.println("login page is visible successfully");
        }
        By signuppage = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
        bytoWebElement(signuppage).click();
        By emailField = By.xpath("//input[@data-qa=\"login-email\"]");
        bytoWebElement(emailField).sendKeys("asmaa22@gmail.com");

        By passwordField = By.xpath("//input[@data-qa=\"login-password\"]");
        bytoWebElement(passwordField).sendKeys("123456");

        By loginButton = By.xpath("//button[@data-qa=\"login-button\"]");
        bytoWebElement(loginButton).click();

        By loggedInVisible = By.tagName("b");
        if(bytoWebElement(loggedInVisible).isDisplayed()) {
            System.out.println("Logged in page is visible successfully");
        }
       /* By delete = By.xpath("//a[@href=\"/delete_account\"]");
        bytoWebElement(delete).click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        By verifyDelete = By.cssSelector("h2[data-qa=\"account-deleted\"] b");
        String Expected2 = "ACCOUNT DELETED!" ;

            String Actual2 = bytoWebElement(verifyDelete).getText();
            softAssert.assertTrue(Actual2.contains(Expected2));
            softAssert.assertAll();
*/
    }

}


