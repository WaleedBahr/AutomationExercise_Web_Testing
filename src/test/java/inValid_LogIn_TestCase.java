import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class inValid_LogIn_TestCase extends TestBase{
    @Test(priority = 1)
    public void inValid_logIn_Test(){
        //Verify that home page is visible successfully
        By pagevisable = By.cssSelector("body[style]");
        //softAssert.assertTrue(bytoWebElement(pagevisable).isDisplayed());
        if(bytoWebElement(pagevisable).isDisplayed()) {
            System.out.println("home page is visible successfully");
        }
        By signuppage = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
        bytoWebElement(signuppage).click();
        By loginButton = By.cssSelector("button[data-qa=\"login-button\"]");
        bytoWebElement(loginButton).click();
        By signupButton = By.cssSelector("button[data-qa=\"signup-button\"]");
        bytoWebElement(signupButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By verifylogin = By.xpath("//div[@class=\"login-form\"]//h2");
        String Expected = "Login to your account";
        String Actual =bytoWebElement(verifylogin).getText();
        softAssert.assertTrue(Actual.contains(Expected));
        By emailaddress= By.cssSelector("input[data-qa=\"login-email\"]");
        bytoWebElement(emailaddress).sendKeys("waledd125@yahoo.com");
        By password = By.cssSelector("input[data-qa=\"login-password\"]");
        bytoWebElement(password).sendKeys("waledd2515");
        By login = By.cssSelector("button[data-qa=\"login-button\"]");
        bytoWebElement(login).click();
        By massage = By.cssSelector("p[style=\"color: red;\"]");
        String Expected2 = "Your email or password is incorrect!";
        String Actual2 = bytoWebElement(massage).getText();
        softAssert.assertTrue(Actual2.contains(Expected2));
        softAssert.assertAll();
    }

}


