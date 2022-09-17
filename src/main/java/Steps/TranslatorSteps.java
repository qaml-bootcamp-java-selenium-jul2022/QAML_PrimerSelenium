package Steps;

import Pages.TranslatorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TranslatorSteps extends BaseSteps{
    public TranslatorSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    TranslatorPage tp = new TranslatorPage(myWebDriver);
    public void escribirPalabraParaTraducir(String texto){
        WebElement textArea = tp.getTranslatorText();
        textArea.sendKeys(texto);
    }

    public void escucharPronunciacionPalabra(){
        WebElement altavoz = tp.getAltavozButton();
        altavoz.click();
    }
}
