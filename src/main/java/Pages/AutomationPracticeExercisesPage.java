package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPracticeExercisesPage extends BasePage {

    public AutomationPracticeExercisesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement womenTab() {
        return myWebDriver.findElement(By.xpath("//a[@title='Dresses']"));
    }
    public WebElement dressesTab() {
        return myWebDriver.findElement(By.xpath("//a[@title='Dresses']"));
    }
    public WebElement tshirtsTab() {
        return myWebDriver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));
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

    public WebElement getBanner(){
        return myWebDriver.findElement(By.xpath("//span[@class='category-name']"));
    }

    public WebElement getFirstSentenceFromBanner(){
        return myWebDriver.findElement(By.xpath("//div[@class='rte']/child::p[1]"));
    }
    public WebElement getSecondSentenceFromBanner(){
        return myWebDriver.findElement(By.xpath("//div[@class='rte']/child::p[2]"));
    }
    public WebElement getThirdSentenceFromBanner(){
        return myWebDriver.findElement(By.xpath("//div[@class='rte']/child::p[3]"));
    }
    public WebElement getTotalProductsDisplayed(){
        return myWebDriver.findElement(By.xpath("//span[@class='heading-counter']"));
    }



}
