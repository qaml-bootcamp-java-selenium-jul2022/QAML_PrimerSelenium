package Steps;

import Pages.DemoQAHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAHomeSteps extends BaseSteps {
    public DemoQAHomeSteps(WebDriver webDriverTest) {
        super(webDriverTest);
    }

    DemoQAHomePage demoQAHomePage = new DemoQAHomePage(myWebDriver);

    public void selectElements(){
        WebElement elements =  demoQAHomePage.getElements();
        elements.click();
    }

    public boolean isDisplayedTextBox(){
        WebElement txtBox =  demoQAHomePage.getTextBox();
        return txtBox.isDisplayed();
    }

    public void selectTextBox(){
        WebElement txtBox =  demoQAHomePage.getTextBox();
        txtBox.click();
    }

    public boolean isDisplayedFullName(){
        WebElement txtBoxFullName =  demoQAHomePage.txtFullName();
        return txtBoxFullName.isDisplayed();
    }

    public boolean isDisplayedEmail(){
        WebElement txtBoxEmail =  demoQAHomePage.txtEmail();
        return txtBoxEmail.isDisplayed();
    }

    public boolean isDisplayedCurrentAddress(){
        WebElement txtBoxCurrentAddress =  demoQAHomePage.txtCurrentAddress();
        return txtBoxCurrentAddress.isDisplayed();
    }

    public boolean isDisplayedPermanentAddress(){
        WebElement txtBoxPermanentAddress =  demoQAHomePage.txtPermanentAddress();
        return txtBoxPermanentAddress.isDisplayed();
    }

    public boolean isDisplayedbtnSubmit(){
        WebElement btnSubmit =  demoQAHomePage.btnSubmit();
        return btnSubmit.isDisplayed();
    }
    public void typeFullName(String fullName) {
        WebElement txtFullName = demoQAHomePage.txtFullName();
        txtFullName.sendKeys(fullName);
    }

    public void typeEmail(String email) {
        WebElement TxtEmail = demoQAHomePage.txtEmail();
        TxtEmail.sendKeys(email);
    }

    public void typeCurrentAddress(String currentAddress) {
        WebElement txtCurrentAddress = demoQAHomePage.txtCurrentAddress();
        txtCurrentAddress.sendKeys(currentAddress);
    }

    public void typePermanentAddress(String permanentAddress) {
        WebElement txtPermanentAddress = demoQAHomePage.txtPermanentAddress();
        txtPermanentAddress.sendKeys(permanentAddress);
    }

    public void submit() {
        WebElement txtPermanentAddress = demoQAHomePage.btnSubmit();
        txtPermanentAddress.click();
    }

    public boolean containsName(String name){
        WebElement txtName =  demoQAHomePage.getfullNameSubmitted();
        assert(txtName.getText().contains(name));
        return true;
    }

    public boolean containsEmail(String email){
        WebElement txtEmail =  demoQAHomePage.getEmailSubmitted();
        assert(txtEmail.getText().contains(email));
        return true;
    }

  public boolean containsCurrentAddress(String currentAddress){
        WebElement txtCurrentAddress =  demoQAHomePage.getCurrentAddressSubmitted();
        assert(txtCurrentAddress.getText().contains(currentAddress));
        return true;
    }

    public boolean containsPermanentAddress(String permanentAddress){
        WebElement txtPermanentAddress =  demoQAHomePage.getPermanentAddressSubmitted();
        assert(txtPermanentAddress.getText().contains(permanentAddress));
        return true;
    }

    public String getEmailErrorClass(){
        WebElement txtEmail =  demoQAHomePage.txtEmail();
        return txtEmail.getAttribute("class");
    }
}
