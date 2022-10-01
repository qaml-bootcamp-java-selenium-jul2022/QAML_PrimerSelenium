package Steps;

import Pages.BasePage;
import Pages.HoverPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverSteps extends BaseSteps {
    public HoverSteps(WebDriver webDriver) {
        super(webDriver);
    }

    Actions action = new Actions(myWebDriver);
    HoverPage hoverPage = new HoverPage(myWebDriver);

    public void crearHover(){
        WebElement elementoDeHover = hoverPage.getHoverElement();
        action.moveToElement(elementoDeHover).perform();
    }
    public void clickInToButton(){
        WebElement buttonElement = hoverPage.getButtonElement();
        action.click(buttonElement);
    }

}
