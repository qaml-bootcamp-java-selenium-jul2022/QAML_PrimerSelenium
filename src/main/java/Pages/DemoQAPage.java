package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAPage extends BasePage {

    public DemoQAPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement fullNameTextField() {
        return myWebDriver.findElement(By.id("userName"));
    }

    public WebElement emailTextField() {
        return myWebDriver.findElement(By.id("userEmail"));
    }

    public WebElement currentAddressTextField() {
        return myWebDriver.findElement(By.id("currentAddress"));
    }

    public WebElement permanentAddressTextField() {
        return myWebDriver.findElement(By.id("permanentAddress"));
    }

    public WebElement submitButton() {
        return myWebDriver.findElement(By.cssSelector("#submit"));
    }

    public WebElement nameOutPutField() {
        return myWebDriver.findElement(By.id("name"));
    }

    public WebElement emailOutPutField() {
        return myWebDriver.findElement(By.cssSelector("#email"));
    }

    public WebElement currentAddressOutPutField() {
        return myWebDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[3]"));
    }

    public WebElement permanentAddressOutPutField() {
        return myWebDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[4]"));
    }

    public WebElement getFullNameTextBox(){
        return myWebDriver.findElement(By.id("userName"));
    }
    public WebElement getEmailTextBox(){
        return myWebDriver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddressTextBox(){
        return myWebDriver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddressTextBox(){
        return myWebDriver.findElement(By.id("permanentAddress"));
    }

    public WebElement getElementsButton(){
        return myWebDriver.findElement(By.xpath("//div[@class='card-body']//h5[contains(text(),'Elements')]"));
    }

    public WebElement getTextBoxOnMenu(){
        return myWebDriver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']/span[@class = 'text']"));
    }

    public WebElement getSubmitButton(){
        return myWebDriver.findElement(By.id("submit"));
    }
    public WebElement getOutputSubmittedForm(){
        return myWebDriver.findElement(By.id("output"));
    }




}
