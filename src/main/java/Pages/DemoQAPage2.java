package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAPage2 extends BasePage{
    public DemoQAPage2(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getElementLink(){
        return myWebDriver.findElement(By.xpath("//div[1][contains(@class,'card mt-4 top-card')]"));
    }

    public WebElement getTextBoxLinkMenu(){
        return myWebDriver.findElement(By.cssSelector("ul.menu-list>li#item-0.btn.btn-light"));
    }
    public WebElement getUserName(){
        return myWebDriver.findElement(By.id("userName"));
    }
    public WebElement getEmail(){
        return myWebDriver.findElement(By.id("userEmail"));
    }
    public WebElement getCurrentAddress(){
        return myWebDriver.findElement(By.id("currentAddress"));
    }
    public WebElement getPermanentAddress(){
        return myWebDriver.findElement(By.id("permanentAddress"));
    }

    public Point getLastElementShowedLocation(){
        WebElement element = myWebDriver.findElement(By.id("permanentAddress"));
        Point location = element.getLocation();
        System.out.println("X, Y - coordinates : " + location);
        return location;

    }
    public WebElement getSubmitButton() {
        return myWebDriver.findElement(By.xpath("//form[@id='userForm']//button[text()='Submit']"));
    }
    public WebElement getNameOutput(){
        return myWebDriver.findElement(By.cssSelector("div#output>div>p#name"));
    }

    public WebElement getEmailOutput(){
        return myWebDriver.findElement(By.cssSelector("div#output>div>p#email"));
    }

    public WebElement getCurrentAddressOutput(){
        return myWebDriver.findElement(By.cssSelector("div#output>div>p#currentAddress"));
    }

    public WebElement getPermanentAddressOutput(){
        return myWebDriver.findElement(By.cssSelector("div#output>div>p#permanentAddress"));
    }

}
