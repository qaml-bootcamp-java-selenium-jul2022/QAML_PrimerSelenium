import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimerTest extends BaseTest {
    @BeforeTest
    public void antesDeLaPrueba(){
        System.out.println("Metodo Before (Antes) Test");
        myWebDriver.get("https://www.google.com");
    }

    @Test
    public void obtenerURL(){
        String expectedURL="https://www.google.com/";
        System.out.println("La URL Abierta es: "+myWebDriver.getCurrentUrl());
        Assert.assertEquals(myWebDriver.getCurrentUrl(),expectedURL);
    }

    @Test
    public void obtenerTituloPagina(){
        String expectedTitle =  "Google";
        System.out.println("El titulo de la pagina es: "+myWebDriver.getTitle());
        Assert.assertEquals(myWebDriver.getTitle(),expectedTitle);
    }

    @AfterTest
    public void despuesDeLaPrueba(){
        System.out.println("Metodo After (Despues) de la prueba");
        myWebDriver.quit(); //cierra todas las ventanas abiertas
    }
}
