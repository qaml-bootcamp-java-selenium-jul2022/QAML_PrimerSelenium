import Steps.AutomationPracticeExercisesSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationPracticeExercisesTests extends BaseTest {

    AutomationPracticeExercisesSteps automationPracticeExercisesSteps = new AutomationPracticeExercisesSteps(myWebDriver);

    String mainURL = "http://automationpractice.com/index.php";
    String categoriesURL = "http://automationpractice.com/index.php?id_category=3&controller=category";

    @BeforeTest
    public void abrirUrl() {
        myWebDriver.get(mainURL);
        myWebDriver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
//        myWebDriver.quit();
    }

    //
    @Test(priority = 1)
    public void verificarCategoriesTabEnable(){
        System.out.println("PRIMER REQUERIMIENTO");
        System.out.println("El menu de categorias esta activo");
        Boolean categoriesEnable = automationPracticeExercisesSteps.verificarCategoriasTabActivo();
        Assert.assertTrue(categoriesEnable);
    }
    @Test(priority = 2)
    public void verificarPaginaCategoria(){
        System.out.println("SEGUNDO REQUERIMIENTO");
        System.out.println("El rediccionamiento de las categorias funciona correctamente");
        automationPracticeExercisesSteps.clicWomenCategoryTab();
        Assert.assertEquals(myWebDriver.getCurrentUrl(),categoriesURL);
    }

    @Test(priority = 3)
    public void verificarCategoriaWomen(){
        System.out.println("TERCER REQUERIMIENTO");
        automationPracticeExercisesSteps.clicWomenCategoryTab();
        String firstText = automationPracticeExercisesSteps.getFirstTextFromWomenBanner();
        Assert.assertEquals(firstText,"This category includes all the basics of your wardrobe and much more:");
        System.out.println("El contenido del banner es correcto");

        String secondText = automationPracticeExercisesSteps.getSecondTextFromWomenBanner();
        Assert.assertEquals(secondText,"shoes, accessories, printed t-shirts, feminine dresses, women's jeans!");

        Integer resultadoBusqueda = automationPracticeExercisesSteps.resultadoBusquedaPorCategoria();
        System.out.println(resultadoBusqueda + " resultados encontrados.");
        Assert.assertEquals(resultadoBusqueda,7);
    }
    @Test(priority = 4)
    public void verificarCategoriaDresses(){
        System.out.println("CUARTO REQUERIMIENTO");
        automationPracticeExercisesSteps.clicDressesCategoryTab();
        String firstText = automationPracticeExercisesSteps.getFirstTextFromDressesBanner();
        Assert.assertEquals(firstText,"Find your favorites dresses from our wide choice of evening, casual or summer dresses!");
        System.out.println("El contenido del banner es correcto");

        String secondText = automationPracticeExercisesSteps.getSecondTextFromDressesBanner();
        Assert.assertEquals(secondText,"We offer dresses for every day, every style and every occasion.");

        Integer resultadoBusqueda = automationPracticeExercisesSteps.resultadoBusquedaPorCategoria();
        System.out.println(resultadoBusqueda + " resultados encontrados.");
        Assert.assertEquals(resultadoBusqueda,5);
    }
    @Test(priority = 5)
    public void verificarCategoriaTshirts(){
        System.out.println("QUINTO REQUERIMIENTO");
        automationPracticeExercisesSteps.clicTshirtCategoryTab();
        Boolean contentVerified = automationPracticeExercisesSteps.verifyContentFromCategoryBanner("The must have of your wardrobe, take a look at our different colors,\n" +
                "shapes and style of our collection!");
        System.out.println("El contenido del banner es correcto");
        Assert.assertTrue(contentVerified);

        Integer resultadoBusqueda = automationPracticeExercisesSteps.resultadoBusquedaPorCategoria();
        System.out.println(resultadoBusqueda + " resultados encontrados.");
        Assert.assertEquals(resultadoBusqueda,1);
    }
}
