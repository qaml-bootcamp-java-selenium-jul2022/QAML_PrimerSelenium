package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStorePage extends BasePage{

    public MyStorePage (WebDriver myWebDriver) {
        super(myWebDriver);
    }

    public WebElement getCategoriaWomen(){
        return myWebDriver.findElement(By.xpath("//div[@class='row']//div[@id='block_top_menu']/ul/li/a[@title='Women']"));

    }
    public WebElement getCategoriaDress(){
        return myWebDriver.findElement(By.xpath("//div[@class='row']//div[@id='block_top_menu']/ul/li/a[@title='Dresses']"));
    }

    public  WebElement getCategoriaTshirts(){
        return myWebDriver.findElement(By.xpath("//div[@class='row']//div[@id='block_top_menu']/ul/li/a[@title='T-shirts']"));

    }

    public WebElement getCategoriaWomenText1(){
        return  myWebDriver.findElement(By.xpath("//div[@class='content_scene_cat']//div[@class='rte']//p[contains(text(),'This')]"));
    }

    public WebElement getCategoriaWomenText2(){
        return  myWebDriver.findElement(By.xpath("//div[@class='content_scene_cat']//div[@class='rte']//p[contains(text(), 'shoes')]"));
    }

    public WebElement getCategoriaTitleWomen(){
        return myWebDriver.findElement(By.xpath("//div[@class = 'cat_desc']//span[@class='category-name']"));
    }

    public WebElement getCantidadWomen(){
        return myWebDriver.findElement(By.xpath("//h1[@class='page-heading product-listing']//span[@class='heading-counter']"));
    }

    public WebElement getCategoriaTitleDress(){
        return myWebDriver.findElement(By.xpath("//div[@class='cat_desc']//span[@class='category-name']"));
    }

    public WebElement getCategoriaDressesText1(){
        return  myWebDriver.findElement(By.xpath("//div[@class='content_scene_cat']//div[@class='rte']//p[contains(text(), 'Find')]"));
    }

    public WebElement getCategoriaDressesText2(){
        return  myWebDriver.findElement(By.xpath("//div[@class='content_scene_cat']//div[@class='rte']//p[contains(text(), 'We')]"));
    }

    public WebElement getCantidadDresses(){
        return myWebDriver.findElement(By.xpath("//h1[@class='page-heading product-listing']//span[@class='heading-counter']"));
    }
    public WebElement getCategoriaTitleShirt(){
        return myWebDriver.findElement(By.xpath("//div[@class='cat_desc']//span[@class='category-name']"));
    }

    public WebElement getCategoriaShirtText1(){
        return  myWebDriver.findElement(By.xpath("//div[@class='content_scene_cat']//div[@class='rte']//p[contains(text(), 'The must')]"));
    }

    public WebElement getCategoriaShirtText2(){
        return  myWebDriver.findElement(By.xpath("//div[@class='content_scene_cat']//div[@class='rte']//p[contains(text(), 'shapes')]"));
    }

    public WebElement getCantidadShirt(){
        return myWebDriver.findElement(By.xpath("//h1[@class='page-heading product-listing']//span[@class='heading-counter']"));
    }

}