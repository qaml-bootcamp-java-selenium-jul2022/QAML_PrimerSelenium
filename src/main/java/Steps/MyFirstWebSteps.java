package Steps;

import Pages.MyFirstWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFirstWebSteps extends BaseSteps {

    MyFirstWebPage paginaHTML = new MyFirstWebPage(myWebDriver);

    public MyFirstWebSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    public void abrirHTML(){
        myWebDriver.get("C:\\Users\\gilbe_000\\Desktop\\Java Selenium BootCamp\\basicHTML.html");
    }

    public void escribirTextoUsername(String texto) {
        WebElement usernameField = paginaHTML.getUsername();
        usernameField.sendKeys(texto);
    }

    public void escribirTextoPassword(String texto) {
        WebElement passwordField = paginaHTML.getPassword();
        passwordField.sendKeys(texto);
    }

    public void clickLoginButton() {
        WebElement LoginButton = paginaHTML.getLoginButton();
        LoginButton.click();
    }


}
