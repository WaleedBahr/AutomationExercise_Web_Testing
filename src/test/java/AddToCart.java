
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AddToCart extends TestBase{

    @Test
    public void AddToCart_Test() {
        By homepageVisable = By.xpath("//*[@id=\"slider-carousel\"]/div/div[3]/div[1]/h2");
        String expect = "Full-Fledged practice website for Automation Engineers";
        String actual = bytoWebElement(homepageVisable).getText();
        softAssert.assertTrue(actual.contains(expect));

        By productButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
        bytoWebElement(productButton).click();
        try {
            Thread.sleep(6000);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        By addButton = By.xpath("//a[@data-product-id=1]");
        bytoWebElement(addButton).click();

        try {
            Thread.sleep(6000);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        By continueButton = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
        bytoWebElement(continueButton).click();

       /* By hoverPicture2 = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/img");
        new Actions(driver).moveToElement(bytoWebElement(hoverPicture2)).perform();*/

        By addButton2 = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/a");
        bytoWebElement(addButton2).click();


        By viewcartButton = By.xpath("//a[@href=\"/view_cart\"]");
        bytoWebElement(viewcartButton).click();


        By product1Visable = By.xpath("//*[@id=\"product-1\"]/td[2]/p");
        String expect1 = "Women > Tops";
        String actual1 = bytoWebElement(product1Visable).getText();
        softAssert.assertTrue(actual1.contains(expect1));


        By product2Visable = By.xpath("//*[@id=\"product-2\"]/td[2]/p");
        String Expect = "Men > Tshirts";
        String Actual = bytoWebElement(product2Visable).getText();
        softAssert.assertTrue(Actual.contains(Expect));


        By product1priceVisable = By.xpath("//*[@id=\"product-1\"]/td[3]/p");
        String price1 = "Rs. 500";
        String total1 = bytoWebElement(product1priceVisable).getText();
        softAssert.assertTrue(total1.contains(price1));


        By product2priceVisable = By.xpath("//*[@id=\"product-2\"]/td[3]/p");
        String price2 = "Rs. 400";
        String total2 = bytoWebElement(product2priceVisable).getText();
        softAssert.assertTrue(total2.contains(price2));

    }
}
