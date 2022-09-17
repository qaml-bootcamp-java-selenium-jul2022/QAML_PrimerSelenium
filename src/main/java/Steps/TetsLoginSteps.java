package Steps;

import Pages.TestLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TetsLoginSteps extends BaseSteps{
    /*Equipo:
Monsse
Susana
Luis Bravo*/
    public TetsLoginSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }
    TestLoginPage testLoginPage = new TestLoginPage(myWebDriver);

    public void escribirUsuario(String usuario){
        WebElement userNameTextBox = testLoginPage.getUserNameTextBox();
        userNameTextBox.sendKeys(usuario);
    }

    public void escribirPassword(String password){
        WebElement passwordTextBox = testLoginPage.getPasswordTextBox();
        passwordTextBox.sendKeys(password);
    }

    public void hacerClickBoton(){
        WebElement boton = testLoginPage.getSubmitButton();
        boton.click();
    }

    public String imprimirURLActual(){
        return myWebDriver.getCurrentUrl();
    }
    public String obtenerContenedor(){
        WebElement contenedor = testLoginPage.getContainer();
        return contenedor.getText();
    }

    public Boolean verificarButtonIsDisplayed(){
        WebElement isDisplay = testLoginPage.getLogoutButton();
        return isDisplay.isDisplayed();
    }

    public String obtenerMensajeDeError(){
        WebElement mensajeError = testLoginPage.getErrorMessage();
        return mensajeError.getText();
    }

    public Boolean verificarMensajeDeErrorIsDisplayed(){
        WebElement isDisplay = testLoginPage.getErrorMessage();
        return isDisplay.isDisplayed();
    }
}
