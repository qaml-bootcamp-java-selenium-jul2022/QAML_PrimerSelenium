package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestAutomationMyStorePage extends BasePage {

    public TestAutomationMyStorePage(WebDriver webDriver) {
        super(webDriver);
    }
    public WebElement imagenFadeShort(){
        return myWebDriver.findElement(By.xpath("//ul[@id='homefeatured']//img[contains(@title,'Faded Short')]"));
    }

    public WebElement botonAddtoCartEnFadeShort(){
        return myWebDriver.findElement(By.xpath("//ul[@id='homefeatured']//div[@class='right-block']//h5//a[contains(@title,'Faded Short')]//ancestor::div/div[@class='button-container']//a[contains(@title,'Add to cart')]"));
    }

    public WebElement botonMoreEnFadeShort(){
        return myWebDriver.findElement(By.xpath("//ul[@id='homefeatured']//div[@class='right-block']//h5//a[contains(@title,'Faded Short')]//ancestor::div/div[@class='button-container']//a//span[contains(text(),'More')]"));
    }

    public WebElement addCartSuccesfullyLabel(){
        return myWebDriver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2"));
    }

    public WebElement moreInfoText(){
        return myWebDriver.findElement(By.xpath("//*[@id='center_column']/div/section[2]//p"));
    }
}