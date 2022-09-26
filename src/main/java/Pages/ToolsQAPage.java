package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ToolsQAPage extends BasePage{
    public ToolsQAPage(WebDriver webDriver) {
        super(webDriver);
    }

    final String idSelector = "oldSelectMenu";



    public Select  getSelect(WebElement selectElement){
        Select miSelectListaDespegable = new Select(selectElement);
        return miSelectListaDespegable;
    }

    public WebElement selectorColors(){
        return myWebDriver.findElement(By.id(idSelector));
    }



}
