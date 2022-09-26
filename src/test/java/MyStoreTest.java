
import Steps.MyStoreStep;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyStoreTest extends BaseTest {

    MyStoreStep myStoreStep = new MyStoreStep(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba() {
        System.out.println("Iniciando Prueba");
        myStoreStep.openURL("http://automationpractice.com/index.php");
    }

    @AfterTest
    public void despuesDeLaPrueba() {
        System.out.println("Finalizando Pruebas");
        myWebDriver.quit();
    }

    //Ejercicio 5 - Women, Dresses and T-Shirts must be available in upper menu
    @Test(priority = 1)
    public void deplegarCategoria() {
        boolean expecteResult = true;
        Assert.assertEquals(myStoreStep.validarCategoriaWomen(), expecteResult);
        myStoreStep.validarCategoriaWomen();

    }

    @Test(priority = 2)
    public void deplegarCategoriaDress() {
        boolean expecteResult = true;
        Assert.assertEquals(myStoreStep.validarCategoriaDress(), expecteResult);
    }

    @Test(priority = 3)
    public void deplegarCategoriaTshirt() {
        boolean expecteResult = true;
        Assert.assertEquals(myStoreStep.validarCategoriaTshirt(), expecteResult);

    }

//Ejercicio 6 - Clicking each category (Women, Dresses and T-Shirts) from Home Page must take user to Women

    @Test(priority = 4)
    public void mostrarCategoria() {
        String urlWomen = "http://automationpractice.com/index.php?id_category=3&controller=category";
        String urlDress = "http://automationpractice.com/index.php?id_category=8&controller=category";
        String urlTshirts = "http://automationpractice.com/index.php?id_category=5&controller=category";
        myStoreStep.openURL("http://automationpractice.com/index.php");
        myStoreStep.clickenCategoriaWomen();
        Assert.assertEquals(myWebDriver.getCurrentUrl(), urlWomen);
        myStoreStep.clickenCategoriaDresses();
        Assert.assertEquals(myWebDriver.getCurrentUrl(), urlDress);
        myStoreStep.clickenCategoriaTshirt();
        Assert.assertEquals(myWebDriver.getCurrentUrl(), urlTshirts);
        myStoreStep.clickenCategoriaWomen();
        Assert.assertEquals(myWebDriver.getCurrentUrl(), urlWomen);
    }

    //Ejercicio 7 - Women banner and text:
    //This category includes all the basics of your wardrobe and much more:
    //shoes, accessories, printed t-shirts, feminine dresses, women's jeans!
    //7 products as search result total banner

    @Test(priority = 5)
    public void opcionWoman(){
        String expectResultTitle = "Women";
        String expectResultText = "This category includes all the basics of your wardrobe and much more: shoes, accessories, printed t-shirts, feminine dresses, women's jeans!";
        String expectResultCantidad = "There are 7 products.";
        String urlWomen = "http://automationpractice.com/index.php?id_category=3&controller=category";
        myStoreStep.openURL("http://automationpractice.com/index.php");
        myStoreStep.clickenCategoriaWomen();
        Assert.assertEquals(expectResultTitle, myStoreStep.validartitleWomen());
        Assert.assertEquals(expectResultText, myStoreStep.validartextoWomen());
        Assert.assertEquals(expectResultCantidad, myStoreStep.validarCantidadArticulos());
        Assert.assertEquals(myWebDriver.getCurrentUrl(), urlWomen);
    }

    //Ejercicio 8 - Dresses banner and text:
    //Find your favorites dresses from our wide choice of evening, casual or summer dresses!
    //We offer dresses for every day, every style and every occasion.
    //5 products as search result total banner

    @Test(priority = 6)
    public void opcionDresses(){
        String expectResultTitle = "Dresses";
        String expectResultText = "Find your favorites dresses from our wide choice of evening, casual or summer dresses! We offer dresses for every day, every style and every occasion.";
        String expectResultCantidad = "There are 5 products.";
        String urlDresses= "http://automationpractice.com/index.php?id_category=8&controller=category";
        myStoreStep.openURL("http://automationpractice.com/index.php");
        myStoreStep.clickenCategoriaDresses();
        Assert.assertEquals(expectResultTitle, myStoreStep.validartitleDresses());
        Assert.assertEquals(expectResultText, myStoreStep.validartextoDresses());
        Assert.assertEquals(expectResultCantidad, myStoreStep.validarCantidadArticulosDresses());
        Assert.assertEquals(myWebDriver.getCurrentUrl(), urlDresses);
    }


    //Ejercicio 9 - T-shirts banner and text:
    //The must have of your wardrobe, take a look at our different colors, shapes and style of our collection!
    //1 product as search result total banner
    @Test(priority = 7)
    public void opcionTshirt(){
        String expectResultTitle = "T-shirts";
        String expectResultText = "The must have of your wardrobe, take a look at our different colors, shapes and style of our collection!";
        String expectResultCantidad = "There is 1 product.";
        String urlTshirt= "http://automationpractice.com/index.php?id_category=5&controller=category";
        myStoreStep.openURL("http://automationpractice.com/index.php");
        myStoreStep.clickenCategoriaTshirt();
        Assert.assertEquals(expectResultTitle, myStoreStep.validartitleTshirt());
        Assert.assertEquals(expectResultText, myStoreStep.validartextoTshirt());
        Assert.assertEquals(expectResultCantidad, myStoreStep.validarCantidadArticulosTshirt());
        Assert.assertEquals(myWebDriver.getCurrentUrl(), urlTshirt);
    }


}
