import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class registerUser_TestCase extends TestBase{

    @Test
    public void Register_Test(){

        //Verify that home page is visible successfully
      By pageVisible = By.cssSelector("body[style]");
      //softAssert.assertTrue(bytoWebElement(pagevisable).isDisplayed());
        if(bytoWebElement(pageVisible).isDisplayed()) {
            System.out.println("home page is visible successfully");
        }
      By signuppage = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
        bytoWebElement(signuppage).click();
      //Click on 'Signup / Login' button
      By loginButton = By.cssSelector("button[data-qa=\"login-button\"]");
      bytoWebElement(loginButton).click();
      By signupButton = By.cssSelector("button[data-qa=\"signup-button\"]");
      bytoWebElement(signupButton).click();
        //Verify 'New User Signup!' is visible
        By loginVisible =By.xpath("//div[@class=\"col-sm-4\"]//h2");
        if(bytoWebElement(loginVisible).isDisplayed()){
            System.out.println("New User Signup!' is visible");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By signupName = By.cssSelector("input[type=\"text\"]");
        bytoWebElement(signupName).sendKeys("waleed");
        By signupEmail = By.cssSelector("input[data-qa=\"signup-email\"]");
        bytoWebElement(signupEmail).sendKeys("waleed7566@gmail.com");
        By SignupButton = By.cssSelector("button[data-qa=\"signup-button\"]");
        bytoWebElement(SignupButton).click();
      //Verify that 'ENTER ACCOUNT INFORMATION' is visible
      By acountinformation= By.xpath("//div[@class=\"login-form\"]//b");
        if(bytoWebElement(acountinformation).isDisplayed()){
            System.out.println("'ENTER ACCOUNT INFORMATION' is visible ");
        }
        String Expected = "ENTER ACCOUNT INFORMATION" ;
        String Actual = bytoWebElement(By.tagName("b")).getText() ;
        softAssert.assertTrue(Actual.contains(Expected));
        By title = By.id("id_gender1");
        bytoWebElement(title).click();
        By password = By.cssSelector("input[data-qa=\"password\"]");//(By.name("password"))
        bytoWebElement(password).sendKeys("waledd1998");
        By birth_day = By.id("days");
        Select select = new Select(bytoWebElement(birth_day));
        select.selectByVisibleText("3");
        By month = By.id("months");
        Select select1 = new Select(bytoWebElement(month));
        select1.selectByVisibleText("January");
        By year = By.id("years");
        Select select2 = new Select(bytoWebElement(year));
        select2.selectByVisibleText("1998");
        By check1 = By.id("newsletter");
        bytoWebElement(check1).click();
        By check2 = By.cssSelector("label[for=\"optin\"]");
        bytoWebElement(check2).click();
        By firstname = By.cssSelector("input[data-qa=\"first_name\"]");
        bytoWebElement(firstname).sendKeys("waleed");
        By lastname = By.cssSelector("input[data-qa=\"last_name\"]");
        bytoWebElement(lastname).sendKeys("Bahr");
        By company = By.cssSelector("input[data-qa=\"company\"]");
        bytoWebElement(company).sendKeys("ITI");
        By address1 = By.cssSelector("input[data-qa=\"address\"]");
        bytoWebElement(address1).sendKeys("Minya");
        By address2 = By.cssSelector("input[data-qa=\"address2\"]");
        bytoWebElement(address2).sendKeys("Matay");
        By country = By.id("country");
        Select select3 = new Select(bytoWebElement(country));
        select3.selectByVisibleText("Australia");
        By state = By.id("state");
        bytoWebElement(state).sendKeys("Egypt");
        By city = By.id("city");
        bytoWebElement(city).sendKeys("Minya");
        By zipcode = By.id("zipcode");
        bytoWebElement(zipcode).sendKeys("61681");
        By mobile_number = By.id("mobile_number");
        bytoWebElement(mobile_number).sendKeys("+201128103075");
        By createAccount = By.cssSelector("button[data-qa=\"create-account\"]");
        bytoWebElement(createAccount).click();
        //Verify that 'ACCOUNT CREATED!' is visible
        By accountCreated = By.xpath("//h2[@data-qa=\"account-created\"]//b");
        String Expected1 = "ACCOUNT CREATED!" ;
        String Actual1 =bytoWebElement(accountCreated).getText();
        softAssert.assertTrue(Actual1.contains(Expected1));
        By continueButton = By.cssSelector("a[data-qa=\"continue-button\"]");
        bytoWebElement(continueButton).click();
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
        By loginSuccess = By.tagName("b");
        softAssert.assertTrue(bytoWebElement(loginSuccess).isDisplayed());
        By deleteAccount = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
        bytoWebElement(deleteAccount).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By verifiydelete = By.xpath("//*[@id=\"form\"]/div/div/div/h2");
        String Expected2 = "ACCOUNT DELETED!" ;
        String Actual2 = bytoWebElement(verifiydelete).getText();
        softAssert.assertTrue(Actual2.contains(Expected2));
        By continuebutton2 = By.cssSelector("a[data-qa=\"continue-button\"]");
        bytoWebElement(continuebutton2).click();
        softAssert.assertAll();

    }


}
