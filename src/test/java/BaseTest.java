import java.io.*;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    public WebDriver myWebDriver = getWebDeriver(Navegadores.CHROME);

    String propertiesFileNameLocalConfig="qaml_primerselenium_local.properties";

    public WebDriver getWebDeriver(Navegadores navegador){
        String chromeDriver=getProperty(propertiesFileNameLocalConfig,"CHROME_DRIVER_PATH");
        File rutaAChromeDriver = new File(chromeDriver);
        File rutaAFirefoxDriver = new File("C:\\Users\\judli\\IdeaProjects\\WebDrivers\\geckodriver.exe");
        File rutaAEdgeDriver = new File("C:\\Users\\judli\\IdeaProjects\\WebDrivers\\msedgedriver.exe");
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

    public String getProperty(String propertiesFile, String key) {
        Properties properties = new Properties();
        InputStream inputStream = null;
        String propertyValue = null;

        try{
            inputStream = new FileInputStream("qaml_primerselenium_local.properties");
            properties.load(inputStream);
            propertyValue = properties.getProperty(key);
            inputStream.close();
        }  catch (Exception e) {
            e.printStackTrace();
            inputStream.close();
        } finally {
            return propertyValue;
        }

    }

}
