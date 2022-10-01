package Steps;

import Pages.DemoQAPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQASteps extends BaseSteps {

    DemoQAPage demoqa = new DemoQAPage(myWebDriver);
    public DemoQASteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    //PASO 1
    public void openURL(){
        myWebDriver.get("https://demoqa.com/text-box/");
    }
    //PASO 2
    public void printPageTitle(){
        System.out.println(myWebDriver.getTitle());
    }

    public String getPageTitle(){
        return myWebDriver.getTitle();
    }
    //PASO 3
    public void printActualURL(){
        System.out.println(myWebDriver.getCurrentUrl());
    }

    public String getActualURL(){
        return myWebDriver.getCurrentUrl();
    }

    public void inputFullName(String text) {
        WebElement fullNameTextField = demoqa.fullNameTextField();
        fullNameTextField.sendKeys(text);
    }

    public void inputEmail(String text) {
        WebElement emailTextField = demoqa.emailTextField();
        emailTextField.sendKeys(text);
    }

    public void inputCurrentAddress(String text) {
        WebElement currentAddressField = demoqa.currentAddressTextField();
        currentAddressField.sendKeys(text);
    }

    public void inputPermanentAddress(String text) {
        WebElement permanentAddressField = demoqa.permanentAddressTextField();
        permanentAddressField.sendKeys(text);
    }
    public boolean isNameOutPutDisplayed() {
        WebElement nameOutPutField = demoqa.nameOutPutField();
        return nameOutPutField.isDisplayed();
    }

    public String getNameOutPutText() {
        WebElement nameOutPutField = demoqa.nameOutPutField();
        return nameOutPutField.getText();
    }

    public boolean isEmailOutPutDisplayed() {
        WebElement emailOutPutField = demoqa.emailOutPutField();
        return emailOutPutField.isDisplayed();
    }

    public String getEmailOutPutText() {
        WebElement emailOutPutField = demoqa.emailOutPutField();
        return emailOutPutField.getText();
    }

    public boolean isCurrentAddressOutPutDisplayed() {
        WebElement currentAddressOutPutField = demoqa.currentAddressOutPutField();
        return currentAddressOutPutField.isDisplayed();
    }

    public String getCurrentAddressOutText() {
        WebElement currentAddressOutPutField = demoqa.currentAddressOutPutField();
        return currentAddressOutPutField.getText();
    }

    public boolean isPermanentAddressOutPutDisplayed() {
        WebElement currentAddressOutPutField = demoqa.permanentAddressOutPutField();
        return currentAddressOutPutField.isDisplayed();
    }

    public String getPermanentAddressOutText() {
        WebElement permanentAddressOutPutField = demoqa.permanentAddressOutPutField();
        return permanentAddressOutPutField.getText();
    }

    public void abrirURL(String url){
        myWebDriver.get(url);
    }

    public void enviarNombreCompleto(String texto) {
        WebElement searchBox = demoqa.getFullNameTextBox();
        searchBox.sendKeys(texto);
    }
    public void enviarCorreo(String correo) {
        WebElement searchBox = demoqa.getEmailTextBox();
        searchBox.sendKeys(correo);
    }

    public void enviarDireccionActual(String direccionActual) {
        WebElement searchBox = demoqa.getCurrentAddressTextBox();
        searchBox.sendKeys(direccionActual);
    }

    public void enviarDireccionPermanente(String direccionPermanente) {
        WebElement searchBox = demoqa.getPermanentAddressTextBox();
        searchBox.sendKeys(direccionPermanente);
    }

    public void clickElements(){
        WebElement elementsMenu = demoqa.getElementsButton();
        elementsMenu.click();
    }
    public boolean textBoxIsDisplayed(){
        WebElement textBoxText = demoqa.getTextBoxOnMenu();
        return textBoxText.isDisplayed();
    }
    public boolean enviarNombreCompletoisDisplayed() {
        WebElement searchBox = demoqa.getFullNameTextBox();
        return searchBox.isDisplayed();
    }
    public boolean enviarCorreoIsDisplayed() {
        WebElement searchBox = demoqa.getEmailTextBox();
        return searchBox.isDisplayed();
    }

    public boolean enviarDireccionActualIsDisplayed() {
        WebElement searchBox = demoqa.getCurrentAddressTextBox();
        return searchBox.isDisplayed();
    }

    public boolean enviarDireccionPermanenteIsDisplayed() {
        WebElement searchBox = demoqa.getPermanentAddressTextBox();
        return searchBox.isDisplayed();
    }

    public boolean submitButtonIsDisplayed(){
        WebElement searchButton = demoqa.getSubmitButton();
        return searchButton.isDisplayed();
    }
    public void clickTextBoxOption(){
        WebElement textBox = demoqa.getTextBoxOnMenu();
        textBox.click();
    }
    public boolean outputFormIsDisplayed(){
        WebElement outputForm = demoqa.getOutputSubmittedForm();
        return outputForm.isDisplayed();
    }

    public void clickSubmitButton(){
        WebElement submitButton = demoqa.getSubmitButton();
        submitButton.click();
    }


}
