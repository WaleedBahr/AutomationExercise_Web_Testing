import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Verfiy_LogOut_TestCase extends TestBase {
    @Test
    public void Login_Test() {
        By pagevisable = By.tagName("h2");
        if(bytoWebElement(pagevisable).isDisplayed()) {
            System.out.println("login page is visible successfully");
        }
        By signuppage = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
        bytoWebElement(signuppage).click();
        By emailfield = By.xpath("//input[@data-qa=\"login-email\"]");
        bytoWebElement(emailfield).sendKeys("asmaa22@gmail.com");

        By passwordfield = By.xpath("//input[@data-qa=\"login-password\"]");
        bytoWebElement(passwordfield).sendKeys("123456");

        By loginbutton = By.xpath("//button[@data-qa=\"login-button\"]");
        bytoWebElement(loginbutton).click();

        By loggedinvisable = By.tagName("b");
        if(bytoWebElement(loggedinvisable).isDisplayed()) {
            System.out.println("Logged in page is visible successfully");
        }


    }

    @Test
    public void Logout_Test() {
        By logoutbutton = By.xpath("//a[@href=\"/logout\"]");
        bytoWebElement(logoutbutton).click();
        By pagevisable = By.tagName("h2");
        if(bytoWebElement(pagevisable).isDisplayed()) {
            System.out.println("login page is visible successfully");
        }
    }

}

