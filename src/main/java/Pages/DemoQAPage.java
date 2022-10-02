package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DemoQAPage extends BasePage {
    public DemoQAPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.ID, using = "userName")
    private WebElement txtBoxUsername;

    @FindBy(how = How.ID, using = "userEmail")
    private WebElement txtBoxUserEmail;

    @FindBy(how = How.XPATH, using = "//div[@class='card-body']//h5[contains(text(),'Elements')]")
    private WebElement buttonList;

    //@FindBy(how = How.XPATH, using = "//div[@class='card-body']//h5[contains(text(),'Elements')]")
    //private List<WebElement> buttonList;

    public WebElement getFullNameTextBox(){
        return txtBoxUsername;
    }

    public WebElement getEmailTextBox(){
        return txtBoxUserEmail;
    }

    public WebElement getCurrentAddressTextBox(){
        return myWebDriver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddressTextBox(){
        return myWebDriver.findElement(By.id("permanentAddress"));
    }

    public WebElement getElementsButton(){
        return buttonList;
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

    public void setTxtBoxUsername(String username) {
        getExampleTextBox().sendKeys(username);
    }

    public WebElement getExampleTextBox() {
        try {
            return txtBoxUsername;
        } catch (NoSuchElementException nsee) {
            return txtBoxUserEmail;
        }
    }
}
