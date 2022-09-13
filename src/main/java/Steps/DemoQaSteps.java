package Steps;

import Pages.DemoQaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQaSteps extends BaseSteps{
    public DemoQaSteps(WebDriver webDriver) {
        super(webDriver);
    }
    DemoQaPage demoQaPage = new DemoQaPage(myWebDriver);

    public void obtenerUrlActual (){
        System.out.println(myWebDriver.getCurrentUrl());
    }

    public void verificandoFullNameTextBox(){
        WebElement fullNameTextBox = demoQaPage.getFullNameTextBox();
        fullNameTextBox.isDisplayed();
    }

    public void verificandoEmailTextBox(){
        WebElement emailTextBox = demoQaPage.getEmailTextBox();
        emailTextBox.isDisplayed();
    }

    public void verificandoCurrentAddressTextBox(){
        WebElement currentAddressTextBox = demoQaPage.getCurrentAddressTextBox();
        currentAddressTextBox.isDisplayed();
    }

    public void verificandoPermanentAddressTextBox(){
        WebElement permanentAddressTextBox = demoQaPage.getPermanentAddressTextBox();
        permanentAddressTextBox.isDisplayed();
    }

    public void verificandoElBotonDeSubmit(){
        WebElement submitButton = demoQaPage.getSubmitButton();
        submitButton.isEnabled();
    }
}
