package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

    public WebElement getElementItem(){
        return  myWebDriver.findElement(By.xpath("//ul[@id='homefeatured']//img[@title='Faded Short Sleeve T-shirts']"));

    }
    public WebElement getAddButton(){
        return myWebDriver.findElement(By.xpath("//ul[@id='homefeatured']//a[@data-id-product = '1']/span"));
    }

    public WebElement getMoreButton(){
        //return myWebDriver.findElement(By.xpath("//ul[@id='homefeatured']//div[@class='button-container']//a[contains(@href,'product=1')]/span[contains(text(),'More')]"));
        return myWebDriver.findElement(By.xpath("//ul[@id='homefeatured']/descendant::a[contains(@href,'product=1')]/span[contains(text(),'More')]"));

    }

    public Point getLastElementShowedLocation(){
        WebElement element = myWebDriver.findElement(By.xpath("//ul[@id='homefeatured']//img[@title='Faded Short Sleeve T-shirts']"));
        Point location = element.getLocation();
        System.out.println("X, Y - coordinates : " + location);
        return location;

    }

}
