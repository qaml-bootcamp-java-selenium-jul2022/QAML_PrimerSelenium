package Steps;

import Pages.BasePage;
import Pages.MyFirstWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFirstWebSteps extends BaseSteps {
    public MyFirstWebSteps(WebDriver webDriver) {
        super(webDriver);
    }
    MyFirstWebPage myFirstWebPage = new MyFirstWebPage(myWebDriver);

    public void escribirNombreEnInputName(String nombre){
        WebElement inputName = myFirstWebPage.getInputName();
        inputName.sendKeys(nombre);
    }
    public void escribirPasswordEnInputPassword(String password){
        WebElement inputName = myFirstWebPage.getInputPassword();
        inputName.sendKeys(password);
    }

    public void darClickAlBotonDeLogin(){
        WebElement loginButton = myFirstWebPage.getButton();
        loginButton.click();
    }

}
