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
        WebElement txtusuario = practiceAutomationPage.getUserNameTextBox();
        txtusuario.sendKeys(usuario);
    }

    public void ingresarcontrasena(String contrasena){
        WebElement txtContrasena = practiceAutomationPage.getPasswordTextBox();
        txtContrasena.sendKeys(contrasena);
    }

    public void btnSubmit(){
        WebElement btnSubmit = practiceAutomationPage.getSubmitButton();
        btnSubmit.click();
    }

    public String getTextLoginSuccessfull(){
        WebElement txtloginSuccessfull = practiceAutomationPage.getSuccessMessage();
        return txtloginSuccessfull.getText();
    }

    public String getTxtError(){
        WebElement txtError = practiceAutomationPage.getErrorMessage();
        return txtError.getText();
    }

    public String isDisplayedTextError(){
        WebElement txtError = practiceAutomationPage.getErrorMessage();
        if (txtError.isDisplayed()) {
            return txtError.getText();
        }
        return null;
    }

    public void btnLogout(){
        WebElement btnLogout = practiceAutomationPage.getLogOutButton();
        btnLogout.click();
    }
}
