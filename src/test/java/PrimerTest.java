import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimerTest extends BaseTest{
    @BeforeTest
    public void antesDeLaPrueba(){
        System.out.println("Metodo Before (antes) test");
        myWebDriver.get("https://www.google.com");
    }

    @Test
    public void obtenerUrl(){
        String expectedURL = "https://www.google.com/";
        System.out.println("La url abierta es: "+myWebDriver.getCurrentUrl());
        Assert.assertEquals(myWebDriver.getCurrentUrl(),expectedURL);
    }

    @Test
    public void obtenerTituloPagina(){
        String expectedTitle = "Google";
        System.out.println("El titulo de la pagina es: "+ myWebDriver.getTitle());
        Assert.assertEquals(myWebDriver.getTitle(),expectedTitle);
    }

    @AfterTest
    public void despuesDeLaPrueba(){
        System.out.println("Metodo After (despues) de la prueba");
        myWebDriver.quit();//cierra toda la sesion de memoria; CLOSE solo la pestaña actual
    }
}
