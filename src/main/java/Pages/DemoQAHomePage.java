package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAHomePage extends BasePage{


    public DemoQAHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getElements (){

        return myWebDriver.findElement(By.xpath("//div[@id='app']//h5[contains(text(),'Elements')]"));
    }

    public WebElement getTextBox(){
        return myWebDriver.findElement(By.xpath("//div[@id='app']//div[@class='element-group']//span[contains(text(),'Text Box')]"));
    }

    public WebElement txtFullName() {
        return myWebDriver.findElement(By.id("userName"));
    }

    public WebElement txtEmail() {
        return myWebDriver.findElement(By.id("userEmail"));
    }

    public WebElement txtCurrentAddress() {
        return myWebDriver.findElement(By.id("currentAddress"));
    }

    public WebElement txtPermanentAddress() {
        return myWebDriver.findElement(By.id("permanentAddress"));
    }

    public WebElement btnSubmit() {
        return myWebDriver.findElement(By.id("submit"));
    }

    public WebElement getfullNameSubmitted() {
        return myWebDriver.findElement(By.id("name"));
    }

    public WebElement getEmailSubmitted() {
        return myWebDriver.findElement(By.id("email"));
    }

    public WebElement getCurrentAddressSubmitted() {
        return myWebDriver.findElement(By.cssSelector("p#currentAddress"));
    }

    public WebElement getPermanentAddressSubmitted() {
        return myWebDriver.findElement(By.cssSelector("p#permanentAddress"));
    }

}
