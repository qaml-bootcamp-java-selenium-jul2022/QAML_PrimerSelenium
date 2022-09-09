import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
    File rutaAChromeDriver = new File("C:\\Users\\judli\\IdeaProjects\\WebDrivers\\chromedriver.exe");
    File rutaAFirefoxDriver = new File("C:\\Users\\judli\\IdeaProjects\\WebDrivers\\geckodriver.exe");
    File rutaAEdgeDriver = new File("C:\\Users\\judli\\IdeaProjects\\WebDrivers\\msedgedriver.exe");

    public WebDriver myWebDriver = getWebDeriver(Navegadores.CHROME);

    public WebDriver getWebDeriver(Navegadores navegador){
        //Aplica para todos los WebDrivers
        DesiredCapabilities capacidadesDeseadas = new DesiredCapabilities();

        switch (navegador){
            case CHROME: {
                System.setProperty("webdriver.chrome.driver", String.valueOf(rutaAChromeDriver));
                //Aplica para Chrome WebDriver
                ChromeOptions opcionesDeChrome = new ChromeOptions();
                opcionesDeChrome.addArguments("--incognito");
                opcionesDeChrome.merge(capacidadesDeseadas);

                myWebDriver = new ChromeDriver(opcionesDeChrome);
                break;}
            case FIREFOX: {
                System.setProperty("webdriver.gecko.driver", String.valueOf(rutaAFirefoxDriver));
                FirefoxOptions opcionesFirefox = new FirefoxOptions();
                opcionesFirefox.addArguments("-private");
                opcionesFirefox.addArguments("--start-maximized");
                opcionesFirefox.addPreference("browser.startup.homepage", "https://www.google.com");
                opcionesFirefox.merge(capacidadesDeseadas);

                myWebDriver = new FirefoxDriver(opcionesFirefox);
                break;
            }
            case EDGE:{
                System.setProperty("webdriver.edge.driver", String.valueOf(rutaAEdgeDriver));
                EdgeOptions opcionesEdge = new EdgeOptions();
                opcionesEdge.merge(capacidadesDeseadas);

                myWebDriver = new EdgeDriver(opcionesEdge);
                break;
            }
            default:{
                System.setProperty("webdriver.chrome.driver", String.valueOf(rutaAChromeDriver));
                //Aplica para Chrome WebDriver
                ChromeOptions opcionesDeChrome = new ChromeOptions();
                opcionesDeChrome.addArguments("--incognito");
                opcionesDeChrome.merge(capacidadesDeseadas);

                myWebDriver = new ChromeDriver(opcionesDeChrome);
            }

        }

        return myWebDriver;
    }

void testInstanciaWebDriver () {
        WebDriver nuevaInstancia = getWebDeriver(Navegadores.CHROME);
}

}
