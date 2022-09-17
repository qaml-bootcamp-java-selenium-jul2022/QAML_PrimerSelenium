package Steps;

import Pages.MyFirstWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFirstWebPageSteps extends BaseSteps{
    public MyFirstWebPageSteps(WebDriver webDriver) {
        super(webDriver);
    }

    MyFirstWebPage myFirstWebPage = new MyFirstWebPage(myWebDriver);

    public void enviarUsername(String username){
        WebElement usernameTextBox = myFirstWebPage.getUsernameTextBox();
        usernameTextBox.sendKeys(username);
    }
    public void enviarPassword(String password){
        WebElement passwordTextBox = myFirstWebPage.getPasswordTextBox();
        passwordTextBox.sendKeys(password);
    }
    public void clickLoginButton(){
        WebElement loginButton = myFirstWebPage.getLoginButton();
        loginButton.click();
    }

    public void abrirURL(String url){
        myWebDriver.get(url);
    }

}
