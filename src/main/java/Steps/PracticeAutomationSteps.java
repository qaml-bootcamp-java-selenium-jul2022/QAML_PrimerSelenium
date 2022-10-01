package Steps;

import Pages.PracticeAutomationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeAutomationSteps extends BaseSteps {

    public PracticeAutomationSteps(WebDriver webDriver) {
        super(webDriver);
    }

    PracticeAutomationPage practiceAutomationPage = new PracticeAutomationPage(myWebDriver);

    public void ingresarUsuario(String usuario){
        WebElement txtusuario = practiceAutomationPage.escribirUserName();
        txtusuario.sendKeys(usuario);
    }

    public void ingresarcontrasena(String contrasena){
        WebElement txtContrasena = practiceAutomationPage.escribirPassword();
        txtContrasena.sendKeys(contrasena);
    }

    public void btnSubmit(){
        WebElement btnSubmit = practiceAutomationPage.submit();
        btnSubmit.click();
    }

    public String getTextLoginSuccessfull(){
        WebElement txtloginSuccessfull = practiceAutomationPage.getTxtloginSuccessfull();
        return txtloginSuccessfull.getText();
    }

    public String getTxtError(){
        WebElement txtError = practiceAutomationPage.getTxtError();
        return txtError.getText();
    }

    public String isDisplayedTextError(){
        WebElement txtError = practiceAutomationPage.getTxtError();
        if (txtError.isDisplayed()) {
            return txtError.getText();
        }
        return null;
    }

    public void btnLogout(){
        WebElement btnLogout = practiceAutomationPage.logout();
        btnLogout.click();
    }
}
