package Steps;

import Pages.DemoQAPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DemoQASteps extends BaseSteps{
    public DemoQASteps(WebDriver webDriver) {
        super(webDriver);
    }

    DemoQAPage demoQAPage = PageFactory.initElements(myWebDriver, DemoQAPage.class);

    public void abrirURL(String url){
        myWebDriver.get(url);
    }

    public void enviarNombreCompleto(String texto) {
        WebElement searchBox = demoQAPage.getFullNameTextBox();
        searchBox.sendKeys(texto);
    }
    
    public void enviarCorreo(String correo) {
        WebElement searchBox = demoQAPage.getEmailTextBox();
        searchBox.sendKeys(correo);
    }

    @Description("Ejemplo de description")
    public void enviarDireccionActual(String direccionActual) {
        WebElement searchBox = demoQAPage.getCurrentAddressTextBox();
        searchBox.sendKeys(direccionActual);
    }

    public void enviarDireccionPermanente(String direccionPermanente) {
        WebElement searchBox = demoQAPage.getPermanentAddressTextBox();
        searchBox.sendKeys(direccionPermanente);
    }

    public void clickElements(){
        WebElement elementsMenu = demoQAPage.getElementsButton();
        elementsMenu.click();
    }
    public boolean textBoxIsDisplayed(){
        WebElement textBoxText = demoQAPage.getTextBoxOnMenu();
        return textBoxText.isDisplayed();
    }
    public boolean enviarNombreCompletoisDisplayed() {
        WebElement searchBox = demoQAPage.getFullNameTextBox();
        return searchBox.isDisplayed();
    }
    public boolean enviarCorreoIsDisplayed() {
        WebElement searchBox = demoQAPage.getEmailTextBox();
        return searchBox.isDisplayed();
    }

    public boolean enviarDireccionActualIsDisplayed() {
        WebElement searchBox = demoQAPage.getCurrentAddressTextBox();
        return searchBox.isDisplayed();
    }

    public boolean enviarDireccionPermanenteIsDisplayed() {
        WebElement searchBox = demoQAPage.getPermanentAddressTextBox();
        return searchBox.isDisplayed();
    }

    public boolean submitButtonIsDisplayed(){
        WebElement searchButton = demoQAPage.getSubmitButton();
        return searchButton.isDisplayed();
    }

    public void clickTextBoxOption(){
        WebElement textBox = demoQAPage.getTextBoxOnMenu();
        textBox.click();
    }
    public boolean outputFormIsDisplayed(){
        WebElement outputForm = demoQAPage.getOutputSubmittedForm();
        return outputForm.isDisplayed();
    }

    public void clickSubmitButton(){
        WebElement submitButton = demoQAPage.getSubmitButton();
        submitButton.click();
    }

    public void sendUsername() {
        String username = "myQAMLUser";
        demoQAPage.setTxtBoxUsername(username);
    }

    public void sendUsername(String username) {
        demoQAPage.setTxtBoxUsername(username);
    }
}
