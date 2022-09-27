package Steps;

import Pages.BasicHtmlPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicHtmlSteps extends BaseSteps{

    public BasicHtmlSteps(WebDriver webDriver) {
        super(webDriver);
    }

    BasicHtmlPage basicHtmlPage = new BasicHtmlPage(myWebDriver);

    public void sendUsername(String username){
        WebElement user = basicHtmlPage.getUsername();
        user.sendKeys(username);
    }

    public void sendPassword(String password){
        WebElement pwd = basicHtmlPage.getPassword();
        pwd.sendKeys(password);
    }

    public void clickButton(){
        WebElement button = basicHtmlPage.getSubmitButton();
        button.click();
    }
}
