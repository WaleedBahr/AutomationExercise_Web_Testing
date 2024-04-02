import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ContactUsForm extends TestBase{

    @Test
    public void Contact_Test() {
        By homepageVisable = By.xpath("//*[@id=\"slider-carousel\"]/div/div[3]/div[1]/h2");
        String expect = "Full-Fledged practice website for Automation Engineers";
        String actual = bytoWebElement(homepageVisable).getText();
        softAssert.assertTrue(actual.contains(expect));

        By contactButton = By.xpath("//a[@href=\"/contact_us\"]");
        bytoWebElement(contactButton).click();

        By contactVisable = By.xpath("//div[@class=\"col-sm-12\"]");
        String Expect = "Get In Touch";
        String Actual = bytoWebElement(contactVisable).getText();
        softAssert.assertTrue(actual.contains(expect));

        By nameField = By.xpath("//input[@data-qa=\"name\"]");
        bytoWebElement(nameField).sendKeys("asmaa");

        By emailField = By.xpath("//input[@data-qa=\"email\"]");
        bytoWebElement(emailField).sendKeys("asmaa22@gmail.com");

        By subjectField = By.xpath("//input[@data-qa=\"subject\"]");
        bytoWebElement(subjectField).sendKeys("task");


        By textareaField = By.xpath("//textarea[@id=\"message\"]");
        bytoWebElement(textareaField).sendKeys("Welcome to my first project");


        By uploadField = By.xpath("//input[@name=\"upload_file\"]");
        bytoWebElement(uploadField).sendKeys("D:\\software testing\\th (1).jpeg");


        By submitButton = By.xpath("//input[@type=\"submit\"]");
        bytoWebElement(submitButton).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();


        By verfiyMessage = By.xpath("//div[@class=\"status alert alert-success\"]");
        String expect1 = "Success! Your details have been submitted successfully.";
        String actual1 = bytoWebElement(verfiyMessage).getText();
        softAssert.assertTrue(actual1.contains(expect1));

        By homeButton = By.xpath("//a[@class=\"btn btn-success\"]");
        bytoWebElement(homeButton).click();
    }

}
