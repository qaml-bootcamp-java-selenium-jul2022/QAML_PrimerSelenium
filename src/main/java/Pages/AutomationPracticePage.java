package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPracticePage extends BasePage {
    public AutomationPracticePage(WebDriver webDriver) {
        super(webDriver);
    }
    public WebElement getSearchTextBox(){
        return myWebDriver.findElement(By.cssSelector("#search_query_top"));
    }

    public WebElement getSearchButton(){
        return myWebDriver.findElement(By.cssSelector(".btn.btn-default.button-search"));
    }

    public String getSearchTitle(){
        return myWebDriver.findElement(By.cssSelector("#center_column > h1 > span.lighter")).getText();
    }

    public WebElement getCategoriesMenuWomenOption(){
        return myWebDriver.findElement(By.xpath("//div[@id='block_top_menu']//ul[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]"));
    }
    public WebElement getCategoriesMenuDressOption(){
        return myWebDriver.findElement(By.xpath("//div[@id='block_top_menu']//ul[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]"));
    }
    public WebElement getCategoriesMenuTshirtOption(){
        return myWebDriver.findElement(By.xpath("//div[@id='block_top_menu']//ul[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]"));
    }
    public WebElement getCategorieName(){
        return myWebDriver.findElement(By.xpath("//h1//span[@class='cat-name']"));
    }


}
