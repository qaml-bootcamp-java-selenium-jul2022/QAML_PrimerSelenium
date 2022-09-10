package Steps;

import Pages.MyFirstWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFirstWebSteps extends BaseSteps{

    public MyFirstWebSteps(WebDriver webDriver) {
        super(webDriver);
    }

    MyFirstWebPage myFirstWebPage=new MyFirstWebPage(myWebDriver);

    public void escribirUsernameEnTextbox(String username){
        WebElement usernameAEscribir=myFirstWebPage.getUsernameTextBox();
        usernameAEscribir.sendKeys(username);
    }

    public void escribirPasswrordEnTextBox(String password){
        WebElement passwordAEscribir=myFirstWebPage.getPasswordTextBox();
        passwordAEscribir.sendKeys(password);
    }

    public void clickEnBotonLogin(){
        WebElement darClickEnBotonLogin=myFirstWebPage.clickLoginButton();
        darClickEnBotonLogin.click();
    }
}
