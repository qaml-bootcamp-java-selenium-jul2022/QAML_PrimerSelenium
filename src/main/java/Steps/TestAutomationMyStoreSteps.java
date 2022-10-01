package Steps;

import Pages.TestAutomationMyStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestAutomationMyStoreSteps extends BaseSteps {

    TestAutomationMyStorePage automationMyStorePage = new TestAutomationMyStorePage(myWebDriver);
    Actions action = new Actions(myWebDriver);

    public TestAutomationMyStoreSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    //PASO 1
    public void openURL(){
        myWebDriver.get("http://automationpractice.com/index.php");
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

    public void hoverEnImagenFadeShort(){
        WebElement imagenFadeShort = automationMyStorePage.imagenFadeShort();
        action.moveToElement(imagenFadeShort).perform();
    }

    public void clickBotonFadeShortAddToCart(){
        WebElement addToCart = automationMyStorePage.botonAddtoCartEnFadeShort();
        addToCart.click();
    }
    public boolean displayBotonFadeShortAddToCart(){
        WebElement displayAddToCart = automationMyStorePage.botonAddtoCartEnFadeShort();
        return displayAddToCart.isDisplayed();
    }

    public void clickBotonFadeShortMore(){
        WebElement more = automationMyStorePage.botonMoreEnFadeShort();
        more.click();
    }

    public boolean displayBotonFadeShortMore(){
        WebElement displayMore = automationMyStorePage.botonAddtoCartEnFadeShort();
        return displayMore.isDisplayed();
    }

    public String getSuccesfullyAddToCartText() {
        WebElement addCartSuccesfullyLabel = automationMyStorePage.addCartSuccesfullyLabel();
        return addCartSuccesfullyLabel.getText();
    }

    public String getMoreInfoText() {
        WebElement moreInfoText = automationMyStorePage.moreInfoText();
        return moreInfoText.getText();
    }
}
