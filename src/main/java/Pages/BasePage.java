package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class BasePage {
    public WebDriver myWebDriver;

    public BasePage(WebDriver webDriver) {
        myWebDriver = webDriver;
    }

    public void esperarUnElemento(WebElement elementoAEsperar) {

        //Ejemplos de Explicit Waits
        WebDriverWait wait = new WebDriverWait(myWebDriver, 30000);
        wait.until(ExpectedConditions.attributeContains(elementoAEsperar, "class", "class1 class2"));

        //Fluent wait
        wait.withTimeout(Duration.ofMillis(10000));
        wait.ignoring(NoSuchElementException.class);
        wait.pollingEvery(Duration.ofMillis(1000));

        wait.until(
                new Function<WebDriver, WebElement>() {
                    @Override
                    public WebElement apply(WebDriver driver) {
                        return elementoAEsperar;
                    }
        });
    }

    public void sleepFor() {
        try {
            Thread.sleep(200000);
        } catch (InterruptedException ie) {

        }
    }
}
