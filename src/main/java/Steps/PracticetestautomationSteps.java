package Steps;

import Pages.PracticetestautomationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticetestautomationSteps extends BaseSteps{

    public PracticetestautomationSteps(WebDriver webDriver) {
        super(webDriver);
    }

    PracticetestautomationPage practicetestautomationPage=new PracticetestautomationPage(myWebDriver);

    public void ingresarUsername(String username){
        WebElement usernameAIngresar=practicetestautomationPage.getUsernameTextbox();
        usernameAIngresar.sendKeys(username);
    }

    public void ingresarPassword(String password){
        WebElement passwordAIngresar=practicetestautomationPage.getPasswordTextbox();
        passwordAIngresar.sendKeys(password);
    }

    public void clickEnBotonSumit(){
        WebElement clickEnbotonS=practicetestautomationPage.clickBotonSubmit();
        clickEnbotonS.click();
    }

    public boolean MessageLogInSuccessfull(String mensaje) {
        WebElement message = practicetestautomationPage.messageSuccessfully();
        return message.getText().contains(mensaje);
    }

    public boolean isButtonLogoutDisplayed(){
        WebElement botonLogin=practicetestautomationPage.buttonOut();
        return botonLogin.isDisplayed();
    }

    public boolean obtenerURLPagina(String url){
        return myWebDriver.getCurrentUrl().contains(url);
    }

    public  boolean isErrorMessageDisplayed(){
        WebElement errorD=practicetestautomationPage.errorMessage();
        return  errorD.isDisplayed();
    }

    public boolean isErrorMessageCorrect(String message){
        WebElement errorM=practicetestautomationPage.errorMessage();
        return errorM.getText().contains(message);
    }

}
