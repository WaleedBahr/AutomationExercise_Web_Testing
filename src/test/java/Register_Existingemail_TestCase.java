import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Register_Existingemail_TestCase extends TestBase {
    @Test(priority = 1)
    public void invalidRegister_Test(){
        //Verify that home page is visible successfully
        By pageVisible = By.cssSelector("body[style]");
        //softAssert.assertTrue(bytoWebElement(pageVisible).isDisplayed());
        if(bytoWebElement(pageVisible).isDisplayed()) {
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
        //Verify 'New User Signup!' is visible
        By loginvisable =By.xpath("//div[@class=\"col-sm-4\"]//h2");
        if(bytoWebElement(loginvisable).isDisplayed()){
            System.out.println("New User Signup!' is visible");
        }
        By username = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");//*[@id="form"]/div/div/div[3]/div/form/button
        bytoWebElement(username).sendKeys("waleed");
        By email = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
        bytoWebElement(email).sendKeys("waleed8566@gmail.com");
        By signup = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
        bytoWebElement(signup).click();
        String Expected ="Email Address already exist!";
        By verifysignup = By.cssSelector("p[style=\"color: red;\"]");
        String Actual = bytoWebElement(verifysignup).getText();
        softAssert.assertTrue(Actual.contains(Expected));
        softAssert.assertAll();

    }


}
