package Steps;

import Pages.PracticeAutomationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeAutomationSteps extends BaseSteps{
    public PracticeAutomationSteps(WebDriver webDriver) {
        super(webDriver);
    }
    PracticeAutomationPage PAPage = new PracticeAutomationPage(myWebDriver);

    public void abrirURL(String url){
        myWebDriver.get(url);
    }

    public void enviarUsuario (String usuario){
        WebElement searchBox = PAPage.getUserNameTextBox();
        searchBox.sendKeys(usuario);
    }

    public void enviarContraseña(String pwd){
        WebElement searchBox = PAPage.getPasswordTextBox();
        searchBox.sendKeys(pwd);
    }
    public void clickSubmit(){
        WebElement searchButton = PAPage.getSubmitButton();
        searchButton.click();
    }

    public String verificarURL(){
        System.out.println(PAPage.myWebDriver.getCurrentUrl());
        return PAPage.myWebDriver.getCurrentUrl().toString();
    }
    public String verificarMensaje(){

        return PAPage.getSuccessMessage().getText();
    }
    public void verificarBotonLogOut(){
        WebElement searchButton = PAPage.getLogOutButton();
        searchButton.isDisplayed();
        searchButton.click();
    }

    public String verificarMensajeError(){
        return PAPage.getErrorMessage().getText();
    }


}